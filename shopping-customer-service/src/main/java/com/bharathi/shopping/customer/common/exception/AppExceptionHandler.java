package com.bharathi.shopping.customer.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler
{
    
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(NotFoundException notFound){
        
        ErrorResponse error= new ErrorResponse();
        
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(notFound.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception ex){
        
        ErrorResponse error= new ErrorResponse();
        
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(ex.getLocalizedMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
    }

}
