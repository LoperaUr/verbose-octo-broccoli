package com.pgm.verboseoctobroccoli.infrastructure.config;

import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.usecase.UserUseCase;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {
    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;


    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort(){
        return new UserUseCase(userPersistencePort());
    }


}
