package com.pgm.verboseoctobroccoli.infrastructure.input.rest;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.application.handler.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserHandler userHandler;


    @PostMapping("/")
    public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userHandler.saveUser(userRequest), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return new ResponseEntity<>(userHandler.getAllUsers(), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userHandler.getUserById(id), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/pg")
    public ResponseEntity<Page<UserResponse>> getAllUsersPageable(Pageable pageable) {
        return new ResponseEntity<>(userHandler.getAllUsersPageable(pageable), ResponseEntity.ok().build().getStatusCode());
    }
}
