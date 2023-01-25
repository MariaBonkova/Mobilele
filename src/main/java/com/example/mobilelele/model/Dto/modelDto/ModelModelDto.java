package com.example.mobilelele.model.Dto.modelDto;

import com.example.mobilelele.model.entities.Brand;
import com.example.mobilelele.model.enums.Category;

import java.util.Date;

public class ModelModelDto {
    private String name;
    private Category category;
    private String imageUrl;
    private int startYear;
    private int endYea;
    private Date created;
    private Date modified;
    private Brand brand;

    public ModelModelDto() {
    }

    public String getName() {
        return name;
    }

    public ModelModelDto setName(String name) {
        this.name = name;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public ModelModelDto setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ModelModelDto setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getStartYear() {
        return startYear;
    }

    public ModelModelDto setStartYear(int startYear) {
        this.startYear = startYear;
        return this;
    }

    public int getEndYea() {
        return endYea;
    }

    public ModelModelDto setEndYea(int endYea) {
        this.endYea = endYea;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public ModelModelDto setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public ModelModelDto setModified(Date modified) {
        this.modified = modified;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public ModelModelDto setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }
}
