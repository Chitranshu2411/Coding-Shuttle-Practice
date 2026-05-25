package com.codingshuttle.projects.CodeNova_AI.service.impl;

import com.codingshuttle.projects.CodeNova_AI.dto.project.FileContentResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.FileNode;
import com.codingshuttle.projects.CodeNova_AI.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFillTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFillContent(Long projectId, String path, Long userId) {
        return null;
    }
}