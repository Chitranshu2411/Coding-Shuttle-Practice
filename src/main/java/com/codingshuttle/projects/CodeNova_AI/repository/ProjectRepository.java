package com.codingshuttle.projects.CodeNova_AI.repository;

import com.codingshuttle.projects.CodeNova_AI.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    // ✅ Get all projects accessible by a user
    @Query("""
            SELECT p FROM Project p
            WHERE p.deletedAt IS NULL
            AND EXISTS (
                SELECT 1 FROM ProjectMember pm
                WHERE pm.id.userId = :userId
                AND pm.id.projectId = p.id
            )
            ORDER BY p.updatedAt DESC
            """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);


    // ✅ Get single project if user has access
    @Query("""
            SELECT pm.project FROM ProjectMember pm
            WHERE pm.project.id = :projectId
            AND pm.user.id = :userId
            AND pm.project.deletedAt IS NULL
            """)
    Optional<Project> findAccessibleProjectById(@Param("projectId") Long projectId,
                                                @Param("userId") Long userId);
}