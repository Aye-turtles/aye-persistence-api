package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "status")
public class StatusEntity {

    @Id
    private Long id;
    private String name;
    private String value;
}
