package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class NestEntity {
    @Id
    private Integer id;
    private Integer amount_Eggs;
    private String status;
    private Date recollection_Date;
    private Date hatching_Date;
    @ManyToMany
    private UserEntity collector;
}
