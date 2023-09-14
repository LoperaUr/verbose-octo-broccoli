package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User saveUser(User user) {
        return userPersistencePort.saveUser(user);
    }
}
