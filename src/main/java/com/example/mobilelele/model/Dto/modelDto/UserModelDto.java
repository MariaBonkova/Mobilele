package com.example.mobilelele.model.Dto.modelDto;

import com.example.mobilelele.model.enums.Role;

import java.util.Date;

public class UserModelDto {

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private Role role;
    private String imageUrl;
    private Date created;
    private Date modified;

    public UserModelDto() {
    }

    public String getUserName() {
        return userName;
    }

    public UserModelDto setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserModelDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserModelDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserModelDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public UserModelDto setActive(boolean active) {
        isActive = active;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public UserModelDto setRole(Role role) {
        this.role = role;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UserModelDto setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public UserModelDto setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public UserModelDto setModified(Date modified) {
        this.modified = modified;
        return this;
    }
}
