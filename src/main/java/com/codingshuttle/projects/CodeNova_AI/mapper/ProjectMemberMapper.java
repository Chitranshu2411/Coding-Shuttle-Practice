package com.codingshuttle.projects.CodeNova_AI.mapper;

import com.codingshuttle.projects.CodeNova_AI.dto.member.MemberResponse;
import com.codingshuttle.projects.CodeNova_AI.entity.ProjectMember;
import com.codingshuttle.projects.CodeNova_AI.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    // ✔ ProjectMember case
    @Mapping(target = "userid", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "projectRole", source = "projectRole")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);

    // ✔ Owner case
    @Mapping(target = "userid", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "projectRole", constant = "OWNER")
    @Mapping(target = "invitedAt", expression = "java(java.time.Instant.now())")
    MemberResponse toProjectMemberResponseFromOwner(User owner);
}