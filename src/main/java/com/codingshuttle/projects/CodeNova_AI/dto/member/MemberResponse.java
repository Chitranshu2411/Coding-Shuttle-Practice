package com.codingshuttle.projects.CodeNova_AI.dto.member;

import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userid,
        String username,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}