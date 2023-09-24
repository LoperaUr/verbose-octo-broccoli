package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.impl;

import com.pgm.verboseoctobroccoli.domain.spi.repo.UserRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {
    private final IUserRepository userRepository;

    @Override
    public boolean existsByEmail(String email) {

        return userRepository.existsByEmail(email);

    }

}
