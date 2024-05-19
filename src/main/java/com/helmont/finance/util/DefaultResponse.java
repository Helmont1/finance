package com.helmont.finance.util;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaultResponse<T> {
    private HttpStatus status;
    private T data;

    public DefaultResponse(HttpStatus status) {
        this.status = status;
    }
}
