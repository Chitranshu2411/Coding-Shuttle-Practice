package com.codingshuttle.projects.CodeNova_AI.dto.subscription;

public record UsageTodayResponse(
     Integer tokensUsed,
     Integer tokensLimit,
     Integer previousRunning,
     Integer previousLimit
) {
}