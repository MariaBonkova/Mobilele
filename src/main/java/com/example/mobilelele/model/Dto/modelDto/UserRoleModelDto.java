package com.example.mobilelele.model.Dto.modelDto;

import com.example.mobilelele.model.enums.Role;

public class UserRoleModelDto {
    private Role role ;

    public UserRoleModelDto() {
    }

    public Role getRole() {
        return role;
    }

    public UserRoleModelDto setRole(Role role) {
        this.role = role;
        return this;
    }
}
