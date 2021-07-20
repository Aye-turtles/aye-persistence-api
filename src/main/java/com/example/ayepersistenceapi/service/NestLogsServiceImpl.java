package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestLogsEntity;
import com.example.ayepersistenceapi.repository.NestLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class NestLogsServiceImpl implements NestLogsService {

    @Autowired
    private NestLogsRepository nestLogsRepository;

    @Override
    @GetMapping(path="nests-logs/")
    public List<NestLogsEntity> findAll() {
        return nestLogsRepository.findAll();
    }

    @Override
    @GetMapping(path="nest-logs/{id}")
    public List<NestLogsEntity> findByNestEntityId(@PathVariable("id") Integer nestEntityId) {
        return nestLogsRepository.findByNestEntityId(nestEntityId);
    }

    @Override
    @PostMapping(path="nest-log/")
    public NestLogsEntity createNestLogsEntity(@RequestBody NestLogsEntity nestLogsEntity) {
        return nestLogsRepository.saveAndFlush(nestLogsEntity);
    }
}
