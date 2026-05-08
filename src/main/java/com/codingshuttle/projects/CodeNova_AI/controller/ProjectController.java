package com.codingshuttle.projects.CodeNova_AI.controller;


import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.CodeNova_AI.security.AuthUtil;
import com.codingshuttle.projects.CodeNova_AI.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;
    private final AuthUtil authUtil;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long userId = authUtil.getCurrentUserId();
        return ResponseEntity.ok(projectService.getUserProjects());
    }

    // ✅ FIXED
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getUserProjectById(id));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody @Valid ProjectRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projectService.createProject(request));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id,
                                                         @RequestBody  @Valid ProjectRequest request) {
        return ResponseEntity.ok(projectService.updateProject(id, request));
    }

    // ✅ FIXED
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.softDelete(id);
        return ResponseEntity.noContent().build();
    }
}