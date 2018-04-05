package com.spring.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.client.ViaCEPClient;
import com.spring.boot.model.Endereco;

@RestController
public class ViaCepController {
	
	@Autowired
	ViaCEPClient client;
	
	@RequestMapping("/listacep")
	
	public Endereco ListaEndereco() { 
		
		Endereco end = client.buscaEnderecoPor("03692040");
		
		return end;
		
	}

}
