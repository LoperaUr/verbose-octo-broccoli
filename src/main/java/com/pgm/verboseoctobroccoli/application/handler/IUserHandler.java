package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponsePassword;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserHandler {

    UserResponse saveUser(UserRequest userRequest);

    List<UserResponse> getAllUsers();

    List<UserResponsePassword> getAllPasswords();

    UserResponse getUserById(Long id);

    Page<UserResponse> getAllUsersPageable(Pageable pageable);


}
