package com.pgm.verboseoctobroccoli.infrastructure.exceptionhandler;

public enum ExceptionResponse {
    EMAIL_ALREADY_REGISTERED("email already registered"),
    EMAIL_INVALID("email invalid"),
    PASSWORD_INVALID("password invalid"),
    USER_NOT_FOUND("user not found"),
    REQUEST_BODY_INVALID("request body invalid"),

    ;
    private String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
