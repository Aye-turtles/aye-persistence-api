package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEntity {
    @Id
    private Integer id;

    private String username;
    private String name;
    private String lastname;
    private String email;
}
