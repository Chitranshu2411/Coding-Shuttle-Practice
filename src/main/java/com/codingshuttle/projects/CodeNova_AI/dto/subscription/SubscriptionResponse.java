package com.codingshuttle.projects.CodeNova_AI.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
     PlanResponse plan,
     String status,
     Instant currentPeriodEnd,
     Long tokensUserThisCycle
) {
}