package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.LoginRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.AuthResponse;
import com.pgm.verboseoctobroccoli.infrastructure.config.sec.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login (@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>(authService.login(loginRequest), ResponseEntity.ok().build().getStatusCode());
    }


}
