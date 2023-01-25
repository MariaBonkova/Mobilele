package com.example.mobilelele.model.Dto.modelDto;

import java.util.Date;

public class BrandModelDto {

    private String name;
    private Date created;
    private Date modified;

    public BrandModelDto() {
    }

    public String getName() {
        return name;
    }

    public BrandModelDto setName(String name) {
        this.name = name;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public BrandModelDto setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public BrandModelDto setModified(Date modified) {
        this.modified = modified;
        return this;
    }
}
