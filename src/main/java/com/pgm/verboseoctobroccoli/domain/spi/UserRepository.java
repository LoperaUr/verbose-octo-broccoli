package com.pgm.verboseoctobroccoli.domain.spi;


public interface UserRepository {

    public boolean existsByEmail(String email);

}
