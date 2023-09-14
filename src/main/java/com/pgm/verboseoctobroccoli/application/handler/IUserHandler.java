package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;

public interface IUserHandler {

    UserResponse saveUser(UserRequest userRequest);

}
