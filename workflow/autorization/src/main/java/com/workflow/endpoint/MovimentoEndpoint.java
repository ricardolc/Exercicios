package com.workflow.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.domain.request.response.MovimentoRequest;
import com.workflow.domain.request.response.MovimentoResponse;
import com.workflow.service.MovimentoService;

@RestController
@RequestMapping("/service")
public class MovimentoEndpoint {

	@Autowired
	private MovimentoService movimentoService;
	
	@RequestMapping(value="/movimento/new", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody MovimentoResponse novo(@RequestBody MovimentoRequest movimentoRequest){
	    movimentoService.saveMoviment(movimentoRequest);
	    return null;
		
	}
}
