package com.pgm.verboseoctobroccoli.infrastructure.exceptionhandler;

public enum ExceptionResponse {
    EMAIL_ALREADY_REGISTERED("email already registered"),


    ;
    private String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
