package com.workflow.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.domain.Pessoa;
import com.workflow.domain.request.response.ResponsePessoaModel;
import com.workflow.service.PessoaService;

//@CrossOrigin(origins  = "http://localhost:4200")

@RestController
@RequestMapping("/service")
public class PessoaController {
 
	@Autowired
	private PessoaService pessoaService; 
	
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(value="/pessoa", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponsePessoaModel salvar(@RequestBody Pessoa pessoa){
 
 
		try {
 
			this.pessoaService.save(pessoa);
 
			return new ResponsePessoaModel(pessoa.getCodigo(),"Registro salvo com sucesso!");
 
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
	public @ResponseBody ResponsePessoaModel atualizar(@RequestBody Pessoa pessoa){
 
		try {
 
			this.pessoaService.save(pessoa);		
 
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
	public List<Pessoa> consultar(){
 
		return this.pessoaService.findAll();
	}
	
	
 
	/**
	 * BUSCAR UMA PESSOA PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	//@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	//public @ResponseBody PessoaModel buscar(@PathVariable("codigo") Integer codigo){
 
	//	return this.pessoaRepository.findOne(codigo);
	//}

	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Pessoa buscar(@PathVariable("codigo") Integer codigo){
 
		Pessoa pm = this.pessoaService.findOne(codigo);
		
		return pm;
		//return null;
	}

	
	
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponsePessoaModel excluir(@PathVariable("codigo") Integer codigo){
 
		Pessoa pessoaModel = pessoaService.findOne(codigo);
 
		try {
 
			pessoaService.delete(pessoaModel);
 
			return new ResponsePessoaModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponsePessoaModel(0, e.getMessage());
		}
	}
 
}