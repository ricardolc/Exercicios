package com.workflow.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.domain.Fase;
import com.workflow.service.FaseService;


//@CrossOrigin(origins  = "http://localhost:4200")

@RestController
@RequestMapping("/service/fase")
public class FaseEndPoint {
	
	@Autowired
	private FaseService faseService;
	
	
	@RequestMapping(value="/allfases", method = RequestMethod.GET)
	public List<Fase> getAllFases(){
 
		//return new ResponseEntity<FaseResponse>(service.create(), HttpStatus.CREATED);
		List<Fase> lf = this.faseService.findAll();
		
		return lf;
		
		
		
	
	}
	
	
}
