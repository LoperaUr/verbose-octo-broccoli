package com.pgm.verboseoctobroccoli.application.mapper;

import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserResponseMapper {
    UserResponse toResponse(User user);

    List<UserResponse> toResponseList(List<User> allUsers);

}
