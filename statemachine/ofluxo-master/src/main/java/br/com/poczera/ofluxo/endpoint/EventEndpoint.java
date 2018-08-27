package br.com.poczera.ofluxo.endpoint;

import java.util.EnumSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poczera.ofluxo.domain.Events;

@RestController
@RequestMapping("/service/event")
public class EventEndpoint {
	
	@GetMapping
	public Set<Events> listEvents(){
		return EnumSet.allOf(Events.class);
	}
}
