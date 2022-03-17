package com.examly.springapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> handleUserPresent(UserException userException){
		return new ResponseEntity<String>(userException.getErrorMessage(),HttpStatus.BAD_REQUEST);
	}
}
