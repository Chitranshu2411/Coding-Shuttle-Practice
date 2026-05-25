package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.project.FileContentResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.FileNode;
//import org.jspecify.annotations.Nullable;
import jakarta.annotation.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFillTree(Long projectId, Long userId);

    FileContentResponse getFillContent(Long projectId, String path, Long userId);
}