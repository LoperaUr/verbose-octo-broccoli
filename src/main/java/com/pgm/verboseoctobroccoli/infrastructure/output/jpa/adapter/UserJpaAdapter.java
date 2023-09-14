package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter;

import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public User saveUser(User user) {
        var userEntity = userRepository.save(userEntityMapper.toEntity(user));
        return userEntityMapper.toModel(userEntity);
    }
}
