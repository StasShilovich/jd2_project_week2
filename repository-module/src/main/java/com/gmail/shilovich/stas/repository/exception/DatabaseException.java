package com.gmail.shilovich.stas.repository.exception;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String errorMessage) {
        super(errorMessage);
    }

    public DatabaseException(String errorMessage, Throwable e) {
        super(errorMessage);
    }
}
