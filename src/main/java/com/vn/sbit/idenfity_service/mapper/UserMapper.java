package com.vn.sbit.idenfity_service.mapper;

import com.vn.sbit.idenfity_service.dto.request.UserCreationRequest;
import com.vn.sbit.idenfity_service.dto.request.UserUpdateRequest;
import com.vn.sbit.idenfity_service.dto.response.UserResponse;
import com.vn.sbit.idenfity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(source = "firstName",target = "lastName") map value 1 = value 2
//    @Mapping(source = "firstName",ignore = true) // không map  => firstName = null
    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
