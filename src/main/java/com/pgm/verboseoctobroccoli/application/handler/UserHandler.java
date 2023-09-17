package com.pgm.verboseoctobroccoli.application.handler;

import com.pgm.verboseoctobroccoli.application.dto.request.UserRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.application.dto.response.UserResponsePassword;
import com.pgm.verboseoctobroccoli.application.mapper.UserPasswordMapper;
import com.pgm.verboseoctobroccoli.application.mapper.UserRequestMapper;
import com.pgm.verboseoctobroccoli.application.mapper.UserResponseMapper;
import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.PasswordInvalidException;
import com.pgm.verboseoctobroccoli.domain.util.ValidationUser;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final UserRequestMapper userRequestMapper;
    private final PasswordEncoder passwordEncoder;
    private final UserResponseMapper userResponseMapper;
    private final UserPasswordMapper userPasswordMapper;

    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        if (ValidationUser.isValidPasswordStructure(userRequest.getPassword())) {
            throw new PasswordInvalidException();
        }
        userRequest.setPassword(passwordEncoder.encode(userRequest.getPassword()));

        var user = userServicePort.saveUser(userRequestMapper.toModel(userRequest));
        return userResponseMapper.toResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userResponseMapper.toResponseList(userServicePort.getAllUsers());
    }

    @Override
    public List<UserResponsePassword> getAllPasswords() {

        var list = userPasswordMapper.toResponseList(userServicePort.getAllUsers());
        list.forEach(user -> user.setPswUnHashed(passwordEncoder.encode(user.getPassword())));
        return list;
    }

    @Override
    public UserResponse getUserById(Long id) {

        return userResponseMapper.toResponse(userServicePort.getUserById(id));
    }

    @Override
    public Page<UserResponse> getAllUsersPageable(Pageable pageable) {
        var users = userServicePort.getAllUsersPageable(pageable);
        return users.map(userResponseMapper::toResponse);
    }


}
