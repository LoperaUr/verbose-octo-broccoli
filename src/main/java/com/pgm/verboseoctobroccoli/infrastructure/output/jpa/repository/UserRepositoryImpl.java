package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository;

import com.pgm.verboseoctobroccoli.domain.spi.UserRepository;
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
