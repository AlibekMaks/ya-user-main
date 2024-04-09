package com.ya.yausermain.mappers;

import com.ya.yausermain.dtos.UserDTO;
import com.ya.yausermain.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface UserMapper {

    User toEntity(UserDTO user);

    UserDTO toFullDto(User user);
}
