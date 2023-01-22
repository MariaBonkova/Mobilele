package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.enums.Category;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    private String name;
    private Category category;
    private String imageUrl;
    private int startYear;
    private int endYea;
    private Date created;
    private Date modified;
    private Brand brand;

    public Model() {
    }

    //⦁	name – a model name.
//⦁	category – an enumeration (Car, Buss, Truck, Motorcycle)
//⦁	imageUrl – the url of image with size between 8 and 512 characters.
//⦁	startYear – a number.
//⦁	endYear – a number.
//⦁	created – a date and time.
//⦁	modified – a date and time.
//⦁	brand – a model brand.

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.STRING)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "image_Url", length = 512)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "start_year")
    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    @Column(name = "end_year")
    public int getEndYea() {
        return endYea;
    }

    public void setEndYea(int endYea) {
        this.endYea = endYea;
    }

    @Column(name = "created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "modified")
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @ManyToOne
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

