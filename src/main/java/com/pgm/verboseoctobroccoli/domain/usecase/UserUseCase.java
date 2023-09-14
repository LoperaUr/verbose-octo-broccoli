package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.EmailAlreadyRegisteredException;
import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IoCTestUserRepo;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;
    private final IoCTestUserRepo ioCTestUserRepo;

    public UserUseCase(IUserPersistencePort userPersistencePort, IoCTestUserRepo ioCTestUserRepo) {
        this.userPersistencePort = userPersistencePort;
        this.ioCTestUserRepo = ioCTestUserRepo;
    }


    @Override
    public User saveUser(User user) {
        if (ioCTestUserRepo.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyRegisteredException();
        }

        return userPersistencePort.saveUser(user);
    }
}
