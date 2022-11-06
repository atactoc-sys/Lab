package com.anudip.CrudOperation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler 
{
	
	@ExceptionHandler(EmploieeNotFoundException.class)
	public ResponseEntity<ErrorMessege> handleUserNotFoundException(EmploieeNotFoundException ex,
			WebRequest request){
		ErrorMessege errorMessege= new ErrorMessege(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessege);
	}

}
