package com.pgm.verboseoctobroccoli.domain.spi.repo;

public interface ProductRepository {

    boolean existsByName(String name);
}
