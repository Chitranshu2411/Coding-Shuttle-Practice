package com.codingshuttle.projects.CodeNova_AI.dto.subscription;

public record PlanLimitResponse(
        String planName,
        Integer maxTokensPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}