package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestEntity;

import java.util.List;

public interface NestService {

    public List<NestEntity> findAllNests();

    public NestEntity findNestById(Integer id);

    public List<NestEntity> findNestsByStatus(String status);

    public List<NestEntity> findNestsByCollectorUserName(String collectorUsername);

    public NestEntity createNewNest(NestEntity nestEntity);

    public NestEntity updateNest(NestEntity nestEntity);

}
