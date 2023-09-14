package com.pgm.verboseoctobroccoli.application.mapper;

import com.pgm.verboseoctobroccoli.application.dto.response.UserResponse;
import com.pgm.verboseoctobroccoli.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserResponseMapper {
    UserResponse toResponse(User user);
}
