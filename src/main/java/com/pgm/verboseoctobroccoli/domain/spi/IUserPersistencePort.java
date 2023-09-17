package com.pgm.verboseoctobroccoli.domain.spi;

import com.pgm.verboseoctobroccoli.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserPersistencePort {

    User saveUser (User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    Page<User> getAllUsersPageable(Pageable pageable);
}
