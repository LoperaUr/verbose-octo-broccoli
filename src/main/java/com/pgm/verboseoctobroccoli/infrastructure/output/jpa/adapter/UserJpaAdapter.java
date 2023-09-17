package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter;

import com.pgm.verboseoctobroccoli.domain.exception.UserNotFoundException;
import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public User saveUser(User user) {
        var userEntity = userRepository.save(userEntityMapper.toEntity(user));
        return userEntityMapper.toModel(userEntity);
    }

    @Override
    public List<User> getAllUsers() {

        return userEntityMapper.toModelList(userRepository.findAll());

    }

    @Override
    public User getUserById(Long id) {
        var userFounded = userRepository.findById(id);
        if (userFounded.isEmpty()) {
            throw new UserNotFoundException();
        }
        return userEntityMapper.toModel(userFounded.get());
    }

    @Override
    public Page<User> getAllUsersPageable(Pageable pageable) {
        return userRepository.findAll(pageable).map(userEntityMapper::toModel);
    }
}
