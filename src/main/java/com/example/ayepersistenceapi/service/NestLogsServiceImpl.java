package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestLogsEntity;
import com.example.ayepersistenceapi.repository.NestLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NestLogsServiceImpl implements NestLogsService {

    @Autowired
    private NestLogsRepository nestLogsRepository;

    @Override
    public List<NestLogsEntity> findAll() {
        return nestLogsRepository.findAll();
    }

    @Override
    public List<NestLogsEntity> findByNestEntityId(Long nestEntityId) {
        return nestLogsRepository.findByNestEntityId(nestEntityId);
    }

    @Override
    public NestLogsEntity createNestLogsEntity(NestLogsEntity nestLogsEntity) {
        return nestLogsRepository.saveAndFlush(nestLogsEntity);
    }
}
