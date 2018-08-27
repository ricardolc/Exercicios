package br.com.poczera.ofluxo.endpoint;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.data.RepositoryStateMachine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poczera.ofluxo.application.OFluxoService;
import br.com.poczera.ofluxo.domain.Events;
import br.com.poczera.ofluxo.domain.States;

@RestController
@RequestMapping("/service/machine")
public class StateMachineEndpoint {

	@Autowired
	private OFluxoService service;

	@GetMapping
	public Set<RepositoryStateMachine> listAll() {
		return service.getAllStateMachineContext();
	}

	@PostMapping
	public ResponseEntity<StateMachineContext<States, Events>> create() throws Exception {
		return new ResponseEntity<StateMachineContext<States, Events>>(service.create(), HttpStatus.CREATED);
	}

	@GetMapping("/{machineId}")
	public StateMachineContext<States, Events> get(@PathVariable("machineId") String machineId) {
		return service.getStateMachineContext(machineId);
	}

	@PutMapping("/{machineId}/event/{eventId}")
	public StateMachineContext<States, Events> sendEvent(@PathVariable("machineId") String machineId,
			@PathVariable("eventId") String eventId) {

		Events event = Events.valueOf(eventId.toUpperCase());
		return service.sendEvent(machineId, event);
	}

}
