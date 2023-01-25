package com.example.mobilelele.model.Dto.modelDto;

import com.example.mobilelele.model.entities.Model;
import com.example.mobilelele.model.entities.User;
import com.example.mobilelele.model.enums.Engine;
import com.example.mobilelele.model.enums.Transmission;

import java.math.BigDecimal;
import java.util.Date;

public class OfferModelDto {
    private String description;
    private Engine engine;
    private String imageUrl;
    private int mileage;
    private BigDecimal price;
    private Transmission transmission; // – enumerated value ().
    private int year;
    private Date created;
    private Date modified;
    private Model model;
    private User seller;

    public OfferModelDto() {
    }

    public String getDescription() {
        return description;
    }

    public OfferModelDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public OfferModelDto setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferModelDto setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferModelDto setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferModelDto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public OfferModelDto setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public OfferModelDto setYear(int year) {
        this.year = year;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public OfferModelDto setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public OfferModelDto setModified(Date modified) {
        this.modified = modified;
        return this;
    }

    public Model getModel() {
        return model;
    }

    public OfferModelDto setModel(Model model) {
        this.model = model;
        return this;
    }

    public User getSeller() {
        return seller;
    }

    public OfferModelDto setSeller(User seller) {
        this.seller = seller;
        return this;
    }
}
