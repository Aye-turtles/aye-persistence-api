package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "nestlogs")
public class NestLogsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date log_Date;
    private Double temperature;
    private Double humidity;
    @ManyToOne()
    @JoinColumn(name = "id_nest")
    private NestEntity id_nest;
}
