package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestEntity;

import java.util.List;

public interface NestService {

    public List<NestEntity> findAll();

    public NestEntity findById(Long id);

    public List<NestEntity> findByStatus(String status);

    public List<NestEntity> findByCollectorUserName(String collectorUsername);

    public NestEntity createNest(NestEntity nestEntity);

    public NestEntity updateNest(NestEntity nestEntity);

}
