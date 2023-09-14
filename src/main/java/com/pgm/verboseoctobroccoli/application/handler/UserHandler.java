package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.application.mapper.UserRequestMapper;
import com.pgm.verboseoctobroccoli.application.mapper.UserResponseMapper;
import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final UserRequestMapper userRequestMapper;
    private final PasswordEncoder passwordEncoder;
    private final UserResponseMapper userResponseMapper;

    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        userRequest.setPassword(passwordEncoder.encode(userRequest.getPassword()));

        var user = userServicePort.saveUser(userRequestMapper.toModel(userRequest));
        return userResponseMapper.toResponse(user);
    }
}
