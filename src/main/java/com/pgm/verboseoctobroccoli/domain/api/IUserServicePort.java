package com.pgm.verboseoctobroccoli.domain.api;

import com.pgm.verboseoctobroccoli.domain.model.User;

public interface IUserServicePort {
    User saveUser(User user);
}
