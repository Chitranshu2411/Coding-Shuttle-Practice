package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.SubscriptionResponse;
import com.codingshuttle.projects.CodeNova_AI.enums.SubscriptionStatus;

import java.io.IOException;
import java.time.Instant;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription();

    void activateSubscription(Long userId, Long planId, String subsciptionId, String customerId) throws IOException;

    void updateSubscription(String gatewaySubscriptionId, SubscriptionStatus status, Instant periodStart, Instant periodEnd, Boolean cancelAtPeriodEnd, Long planId);

    void cancelSubscription(String gatewaySubscriptionId);

    void renewSubscriptionPeriod(String subId, Instant periodStart, Instant periodEnd) throws IOException;

    void markSubscriptionPastDue(String subId);
}