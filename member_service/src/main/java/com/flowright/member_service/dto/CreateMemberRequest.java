package com.flowright.member_service.dto;

import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMemberRequest {
    @NotNull(message = "Workspace ID is required")
    private Long workspaceId;
}
