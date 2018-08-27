package br.com.poczera.ofluxo.endpoint;

import java.util.EnumSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poczera.ofluxo.domain.States;

@RestController
@RequestMapping("/service/state")
public class StateEndpoint {
	
	@GetMapping
	public Set<States> listStates(){
		return EnumSet.allOf(States.class);
	}
}
