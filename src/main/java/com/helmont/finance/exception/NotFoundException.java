package com.helmont.finance.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String object, String id) {
        super(object + " with id " + id + " not found");
    }
}
