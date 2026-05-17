package com.codingshuttle.projects.CodeNova_AI.dto.member;
import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}