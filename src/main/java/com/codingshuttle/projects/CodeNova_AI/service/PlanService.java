package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.PlanResponse;
//import org.jspecify.annotations.Nullable;
import jakarta.annotation.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}