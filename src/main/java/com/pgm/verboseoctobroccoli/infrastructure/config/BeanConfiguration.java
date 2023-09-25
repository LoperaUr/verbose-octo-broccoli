package com.pgm.verboseoctobroccoli.infrastructure.config;

import com.pgm.verboseoctobroccoli.domain.api.ICategoryServicePort;
import com.pgm.verboseoctobroccoli.domain.api.IOrderServicePort;
import com.pgm.verboseoctobroccoli.domain.api.IProductServicePort;
import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.spi.IOrderPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IProductPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.repo.CategoryRepository;
import com.pgm.verboseoctobroccoli.domain.spi.ICategoryPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.repo.ProductRepository;
import com.pgm.verboseoctobroccoli.domain.spi.repo.UserRepository;
import com.pgm.verboseoctobroccoli.domain.usecase.CategoryUseCase;
import com.pgm.verboseoctobroccoli.domain.usecase.OrderUseCase;
import com.pgm.verboseoctobroccoli.domain.usecase.ProductUseCase;
import com.pgm.verboseoctobroccoli.domain.usecase.UserUseCase;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.CategoryJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.OrderJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.ProductJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.CategoryEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.OrderEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.ProductEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper.UserEntityMapper;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.ICategoryRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IOrderRepository;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IProductRepository;
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
    private final IProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;
    private final ProductRepository productRepositoryDomain;
    private final IOrderRepository orderRepository;
    private final OrderEntityMapper orderEntityMapper;


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

    @Bean
    public IProductPersistencePort productPersistencePort() {
        return new ProductJpaAdapter(productRepository, productEntityMapper);
    }

    @Bean
    public IProductServicePort productServicePort() {
        return new ProductUseCase(productPersistencePort(), productRepositoryDomain, categoryRepositoryDomain);
    }

    @Bean
    public IOrderPersistencePort orderPersistencePort() {
        return new OrderJpaAdapter(orderRepository, orderEntityMapper);
    }

    @Bean
    public IOrderServicePort orderServicePort() {
        return new OrderUseCase(orderPersistencePort());
    }

}
