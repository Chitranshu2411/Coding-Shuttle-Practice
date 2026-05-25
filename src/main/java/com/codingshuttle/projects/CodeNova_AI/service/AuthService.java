package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.auth.AuthResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.auth.LoginRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}