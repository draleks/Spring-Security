package com.epam.esm.exception;

public class TagEntityException extends RuntimeException{
    private final int code;

    public TagEntityException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
