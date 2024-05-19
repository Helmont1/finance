package com.helmont.finance.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.helmont.finance.exception.BusinessException;
import com.helmont.finance.exception.DatabaseException;
import com.helmont.finance.exception.NotFoundException;
import com.helmont.finance.util.DefaultResponse;

@ControllerAdvice
public class ExceptionManager extends ResponseEntityExceptionHandler {
    public ResponseEntity<Object> handleBusinessException(BusinessException ex) {
        var apiExceptionMessage = new DefaultResponse<BusinessException>(HttpStatus.BAD_REQUEST, ex);
        return new ResponseEntity<>(apiExceptionMessage,new HttpHeaders(), apiExceptionMessage.getStatus());
    }

    public ResponseEntity<Object> handleDatabaseException(DatabaseException ex) {
        var apiExceptionMessage = new DefaultResponse<DatabaseException>(HttpStatus.INTERNAL_SERVER_ERROR, ex);
        return new ResponseEntity<>(apiExceptionMessage,new HttpHeaders(), apiExceptionMessage.getStatus());
    }

    public ResponseEntity<Object> handleNotFoundException(NotFoundException ex) {
        var apiExceptionMessage = new DefaultResponse<NotFoundException>(HttpStatus.NOT_FOUND, ex);
        return new ResponseEntity<>(apiExceptionMessage,new HttpHeaders(), apiExceptionMessage.getStatus());
    }
}
