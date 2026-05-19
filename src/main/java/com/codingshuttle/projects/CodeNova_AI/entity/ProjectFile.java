package com.codingshuttle.projects.CodeNova_AI.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {

    Long id;

    Project project;

    String path;

    String minioObjectKey;

    Instant createdAt;

    Instant deletedAt;

    User createdBy;

    User deletedBy;

}