package com.workflow.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoController<T> {
	

	
	//@Autowired
	private TodoRepository systemRepository;

	@RequestMapping("/listodo")
	public List<Todo> ListaTodo(){
		//return (List<Todo>) systemRepository.findAll();
		return null;
	}
	
	@RequestMapping("altera")
	public List<Todo> Altera(){
		
		Todo todo = new Todo();
		todo.title = "testeRicardo";
		
		//CrudRespository  crud = new TodoRepository ();
		
		
		//systemRepository.save( todo);
		
		//return systemRepository.findAll();
		return null;
	}
	
	
	
}
