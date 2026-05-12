package com.codingshuttle.projects.CodeNova_AI.dto.member;

import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InviteMemberRequest(
        @Email @NotBlank String username,
        @NotNull ProjectRole role
) {
}