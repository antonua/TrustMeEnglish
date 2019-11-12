package com.trustmeenglish.core.dto;

import com.trustmeenglish.core.model.Role;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private Set<RoleDTO> roles;
}
