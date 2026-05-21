package com.codingshuttle.projects.CodeNova_AI.mapper;

import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.CodeNova_AI.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    //@Mapping(target = "createdAt", dateFormat = "YYYY-MM-DD")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}