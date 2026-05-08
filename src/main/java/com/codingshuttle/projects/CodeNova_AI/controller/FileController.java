package com.codingshuttle.projects.CodeNova_AI.controller;

import com.codingshuttle.projects.CodeNova_AI.dto.project.FileContentResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.FileNode;
import com.codingshuttle.projects.CodeNova_AI.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId) {
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFillTree(projectId, userId));
    }

    @GetMapping("/{*path}") // src/hooks/get-user-hook.jsx
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @PathVariable String path
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFillContent(projectId, path, userId));
    }
}