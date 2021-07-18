package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "nest")
public class NestEntity {
    @Id
    private Integer id;

    private Integer amount_Eggs;

    private Date recollection_Date;

    private Date hatching_Date;

    @ManyToOne()
    @JoinColumn(name = "collector")
    private UserEntity collector;

    @ManyToOne()
    @JoinColumn(name = "status")
    private StatusEntity status;
}
