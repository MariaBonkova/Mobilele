package com.example.mobilelele.model.Dto.modelDto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseModelDto {

    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string",
            strategy = "org.hibernate.id.UUIDGenerator")

    private String id;

    public BaseModelDto() {
    }

    public String getId() {
        return id;
    }

    public BaseModelDto setId(String id) {
        this.id = id;
        return this;
    }


}
