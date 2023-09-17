package com.pgm.verboseoctobroccoli.application.mapper;

import com.pgm.verboseoctobroccoli.application.dto.response.UserResponsePassword;
import com.pgm.verboseoctobroccoli.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserPasswordMapper {

    List<UserResponsePassword> toResponseList(List<User> allUsers);

}
