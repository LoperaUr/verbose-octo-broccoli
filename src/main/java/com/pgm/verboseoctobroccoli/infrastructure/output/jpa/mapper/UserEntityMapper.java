package com.pgm.verboseoctobroccoli.infrastructure.output.jpa.mapper;

import com.pgm.verboseoctobroccoli.domain.model.User;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper {
    UserEntity toEntity(User user);

    User toModel(UserEntity studentReturned);

    List<User> toModelList(List<UserEntity> allUsers);
}
