package com.pgm.verboseoctobroccoli.infrastructure.exceptionhandler;

import com.pgm.verboseoctobroccoli.domain.exception.EmailAlreadyRegisteredException;
import com.pgm.verboseoctobroccoli.domain.exception.EmailInvalidException;
import com.pgm.verboseoctobroccoli.domain.exception.PasswordInvalidException;
import com.pgm.verboseoctobroccoli.domain.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    private static final String MESSAGE = "message";
    @ExceptionHandler(EmailAlreadyRegisteredException.class)
    public ResponseEntity<Map<String, String>> handleEmailAlreadyRegisteredException(
            EmailAlreadyRegisteredException emailAlreadyRegisteredException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.EMAIL_ALREADY_REGISTERED.getMessage()));
    }

    @ExceptionHandler(EmailInvalidException.class)
    public ResponseEntity<Map<String, String>> handleEmailInvalidException(
            EmailInvalidException emailInvalidException) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.EMAIL_INVALID.getMessage()));
    }

    @ExceptionHandler(PasswordInvalidException.class)
    public ResponseEntity<Map<String, String>> handlePasswordInvalidException(
            PasswordInvalidException passwordInvalidException) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.PASSWORD_INVALID.getMessage()));
    }
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleUserNotFoundException(
            UserNotFoundException userNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.USER_NOT_FOUND.getMessage()));
    }
}