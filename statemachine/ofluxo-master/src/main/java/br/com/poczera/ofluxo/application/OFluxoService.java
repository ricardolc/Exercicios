package br.com.poczera.ofluxo.application;

import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.data.RepositoryStateMachine;
import org.springframework.statemachine.data.jpa.JpaStateMachineRepository;
import org.springframework.statemachine.service.StateMachineService;
import org.springframework.stereotype.Service;

import br.com.poczera.ofluxo.domain.Events;
import br.com.poczera.ofluxo.domain.States;

@Service
public class OFluxoService {

	@Autowired
	private StateMachineService<States, Events> stateMachineService;

	@Autowired
	private StateMachinePersist<States, Events, String> stateMachinePersist;

	@Autowired
	private JpaStateMachineRepository repository;

	public StateMachineContext<States, Events> create() throws Exception {
		final String machineId = UUID.randomUUID().toString();

		final StateMachine<States, Events> stateMachine = stateMachineService.acquireStateMachine(machineId);
		stateMachineService.releaseStateMachine(machineId);
		stateMachine.stop();

		return stateMachinePersist.read(machineId);
	}

	public StateMachineContext<States, Events> sendEvent(final String machineId, final Events event) {

		try {
			final StateMachine<States, Events> stateMachine = getStateMachine(machineId);
			stateMachine.sendEvent(event);
			StateMachineContext<States, Events> context = stateMachinePersist.read(machineId);
			stateMachineService.releaseStateMachine(machineId);
			stateMachine.stop();
			return context;
		} catch (Exception e) {
			throw new IllegalArgumentException("State Machine doesn't exist.");
		}
	}

	public StateMachineContext<States, Events> getStateMachineContext(final String machineId) {

		try {
			return stateMachinePersist.read(machineId);
		} catch (Exception e) {
			throw new IllegalArgumentException("State Machine doesn't exist.");
		}
	}

	private StateMachine<States, Events> getStateMachine(final String machineId) {

		StateMachineContext<States, Events> context = getStateMachineContext(machineId);
		final StateMachine<States, Events> stateMachine = stateMachineService.acquireStateMachine(context.getId());
		stateMachine.start();

		return stateMachine;
	}

	public Set<RepositoryStateMachine> getAllStateMachineContext() {
		return StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(repository.findAll().iterator(), Spliterator.ORDERED),
						false)
				.collect(Collectors.toSet());
	}
}
