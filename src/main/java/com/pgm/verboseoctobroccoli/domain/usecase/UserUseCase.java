package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.EmailAlreadyRegisteredException;
import com.pgm.verboseoctobroccoli.domain.exception.EmailInvalidException;
import com.pgm.verboseoctobroccoli.domain.exception.PasswordInvalidException;
import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IoCTestUserRepo;
import com.pgm.verboseoctobroccoli.domain.util.ValidationUser;

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
        if (ValidationUser.isValidEmailStructure(user.getEmail())) {
            throw new EmailInvalidException();
        }
        if (ValidationUser.isValidPasswordStructure(user.getPassword())) {
            throw new PasswordInvalidException();
        }

        return userPersistencePort.saveUser(user);
    }
}
