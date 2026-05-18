package com.codingshuttle.projects.CodeNova_AI.dto.project;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        com.codingshuttle.projects.CodeNova_AI.entity.User owner
) {
}