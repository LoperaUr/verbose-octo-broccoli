package com.pgm.verboseoctobroccoli.domain.spi.repo;


public interface UserRepository {

    public boolean existsByEmail(String email);

}
