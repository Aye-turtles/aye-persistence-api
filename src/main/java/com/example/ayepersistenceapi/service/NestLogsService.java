package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestEntity;
import com.example.ayepersistenceapi.model.entity.NestLogsEntity;

import java.util.List;

public interface NestLogsService {

    public List<NestLogsEntity> findAll();

    public List<NestLogsEntity> findByNestEntityId(Integer nestEntityId);

    public NestLogsEntity createNestLogsEntity(NestLogsEntity nestLogsEntity);

}
