package com.example.ayepersistenceapi.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "nestlogs")
public class NestLogsEntity {
    @Id
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "id_nest")
    private NestEntity id_nest;
    private Date log_Date;
    private Double temperature;
    private Double humidity;
}
