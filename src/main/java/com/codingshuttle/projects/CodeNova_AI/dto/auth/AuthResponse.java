package com.codingshuttle.projects.CodeNova_AI.dto.auth;

public record AuthResponse (
        String token,
        UserProfileResponse user
){

}