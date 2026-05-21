package com.codingshuttle.projects.CodeNova_AI.mapper;


import com.codingshuttle.projects.CodeNova_AI.dto.auth.SignupRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.auth.UserProfileResponse;
import com.codingshuttle.projects.CodeNova_AI.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);
}