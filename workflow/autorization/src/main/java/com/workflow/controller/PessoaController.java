package com.workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.model.PessoaModel;
import com.workflow.model.ResponsePessoaModel;
import com.workflow.repository.PessoaRepository;
 
@RestController
@RequestMapping("/service")
public class PessoaController {
 
	@Autowired
	private PessoaRepository pessoaRepository; 
 
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(value="/pessoa", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponsePessoaModel salvar(@RequestBody PessoaModel pessoa){
 
 
		try {
 
			this.pessoaRepository.save(pessoa);
 
			return new ResponsePessoaModel(1,"Registro salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponsePessoaModel(0,e.getMessage());			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UMA PESSOA
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(value="/pessoa", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponsePessoaModel atualizar(@RequestBody PessoaModel pessoa){
 
		try {
 
			this.pessoaRepository.save(pessoa);		
 
			return new ResponsePessoaModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponsePessoaModel(0,e.getMessage());
		}
	}
 
	/**
	 * CONSULTAR TODAS AS PESSOAS
	 * @return
	 */
	@RequestMapping(value="/pessoa", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<PessoaModel> consultar(){
 
		return this.pessoaRepository.findAll();
	}
 
	/**
	 * BUSCAR UMA PESSOA PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PessoaModel buscar(@PathVariable("codigo") Integer codigo){
 
		return this.pessoaRepository.findOne(codigo);
	}
 
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponsePessoaModel excluir(@PathVariable("codigo") Integer codigo){
 
		PessoaModel pessoaModel = pessoaRepository.findOne(codigo);
 
		try {
 
			pessoaRepository.delete(pessoaModel);
 
			return new ResponsePessoaModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponsePessoaModel(0, e.getMessage());
		}
	}
 
}