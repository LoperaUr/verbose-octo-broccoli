package com.pgm.verboseoctobroccoli.domain.usecase;

import com.pgm.verboseoctobroccoli.domain.api.IUserServicePort;
import com.pgm.verboseoctobroccoli.domain.exception.EmailAlreadyRegisteredException;
import com.pgm.verboseoctobroccoli.domain.exception.EmailInvalidException;
import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.domain.spi.IUserPersistencePort;
import com.pgm.verboseoctobroccoli.domain.spi.IoCTestUserRepo;
import com.pgm.verboseoctobroccoli.domain.util.ValidationUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

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

        return userPersistencePort.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userPersistencePort.getUserById(id);

    }

    @Override
    public Page<User> getAllUsersPageable(Pageable pageable) {

        return userPersistencePort.getAllUsersPageable(pageable);
    }
}
