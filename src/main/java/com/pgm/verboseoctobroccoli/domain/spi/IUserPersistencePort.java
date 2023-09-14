package com.pgm.verboseoctobroccoli.domain.spi;

import com.pgm.verboseoctobroccoli.domain.model.User;

public interface IUserPersistencePort {

    User saveUser (User user);

}
