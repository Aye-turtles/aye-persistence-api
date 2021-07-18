package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Date;

@Data
@Entity
public class NestLogsEntity {
    @Id
    private Long id;
    @ManyToMany
    private NestEntity id_nest;
    private Date log_Date;
    private Double temperature;
    private Double humidity;
}
