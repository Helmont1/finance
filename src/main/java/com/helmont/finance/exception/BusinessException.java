package com.helmont.finance.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super("Business error: " + message);
    }
}
