package com.pgm.verboseoctobroccoli.infrastructure.exceptionhandler;

public enum ExceptionResponse {
    EMAIL_ALREADY_REGISTERED("email already registered"),
    EMAIL_INVALID("email invalid"),
    PASSWORD_INVALID("password invalid"),
    USER_NOT_FOUND("user not found"),
    REQUEST_BODY_INVALID("request body invalid"),
    INVALID_NAME("invalid name"),
    INVALID_PRICE("invalid price"),
    INVALID_STOCK("invalid stock"),
    INVALID_CATEGORY("invalid category"),
    CATEGORY_NOT_FOUND("category not found"),

    ;
    private String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
