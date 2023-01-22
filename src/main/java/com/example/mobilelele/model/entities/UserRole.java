package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class UserRole extends BaseEntity{

    private Role role ;

    public UserRole() {
    }
    @Enumerated(EnumType.ORDINAL)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
