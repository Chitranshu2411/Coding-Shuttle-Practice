package com.codingshuttle.projects.CodeNova_AI.service.impl;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.UsageTodayResponse;
import com.codingshuttle.projects.CodeNova_AI.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}