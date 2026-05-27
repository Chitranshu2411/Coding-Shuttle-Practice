package com.codingshuttle.projects.CodeNova_AI.service;

import java.util.List;

import com.codingshuttle.projects.CodeNova_AI.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.member.MemberResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.member.UpdateMemberRoleRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectMember;
//import org.jspecify.annotations.Nullable;
import jakarta.annotation.Nullable;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    void removeProjectMember(Long projectId, Long memberId);
}