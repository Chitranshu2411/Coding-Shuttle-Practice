package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectRequest;
//import org.jspecify.annotations.Nullable;
import jakarta.annotation.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long Id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}