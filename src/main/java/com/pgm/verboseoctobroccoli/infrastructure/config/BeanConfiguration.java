package com.pgm.verboseoctobroccoli.infrastructure.config;

import com.pgm.verboseoctobroccoli.domain.api.ICategoryServicePort;
import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.spi.CategoryRepository;
import com.pgm.verboseoctobroccoli.domain.spi.ICategoryPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.UserRepository;
import com.pgm.verboseoctobroccoli.domain.usecase.CategoryUseCase;
import com.pgm.verboseoctobroccoli.domain.usecase.UserUseCase;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.CategoryJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.CategoryEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.ICategoryRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {
    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    private final UserRepository ioCTestUserRepo;
    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    private final CategoryRepository categoryRepositoryDomain;



    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort(), ioCTestUserRepo);
    }

    @Bean
    public ICategoryPersistencePort categoryPersistencePort() {
        return new CategoryJpaAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public ICategoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort(), categoryRepositoryDomain);
    }

}
