package com.pgm.verboseoctobroccoli.domain.spi.repo;

public interface CategoryRepository {
    public boolean existsByName(String name);
}
