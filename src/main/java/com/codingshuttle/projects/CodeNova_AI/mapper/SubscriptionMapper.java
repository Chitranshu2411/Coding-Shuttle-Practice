package com.codingshuttle.projects.CodeNova_AI.mapper;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.PlanResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.SubscriptionResponse;
import com.codingshuttle.projects.CodeNova_AI.entity.Plan;
import com.codingshuttle.projects.CodeNova_AI.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    static SubscriptionResponse toSubscriptionResponse(Subscription subscription) {
        return null;
    }

    PlanResponse toPlanResponse(Plan plan);
}