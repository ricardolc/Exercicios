package br.com.poczera.ofluxo.endpoint.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GloblaExceptionHandler {
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ExceptionHandler(IllegalArgumentException.class)
    public void handleBadRequest() {

    }
	

}
