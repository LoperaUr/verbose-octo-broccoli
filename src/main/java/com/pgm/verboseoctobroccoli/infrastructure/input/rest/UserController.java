package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.application.handler.IUserHandler;
import com.pgm.verboseoctobroccoli.application.mapper.UserRequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserHandler userHandler;
    private final UserRequestMapper userRequestMapper;


    @PostMapping("/")
    public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userHandler.saveUser(userRequest), ResponseEntity.ok().build().getStatusCode());
    }
}
