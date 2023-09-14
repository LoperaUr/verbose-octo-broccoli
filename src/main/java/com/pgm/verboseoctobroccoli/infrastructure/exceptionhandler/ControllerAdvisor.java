package com.pgm.verboseoctobroccoli.infrastructure.exceptionhandler;

import com.pgm.verboseoctobroccoli.domain.exception.EmailAlreadyRegisteredException;
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
}
