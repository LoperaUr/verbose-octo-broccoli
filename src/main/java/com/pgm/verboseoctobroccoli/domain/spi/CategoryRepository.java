package com.pgm.verboseoctobroccoli.domain.spi;

public interface CategoryRepository {
    public boolean existsByName(String name);
}
