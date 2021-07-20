package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.NestEntity;
import com.example.ayepersistenceapi.repository.NestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class NestServiceImpl implements NestService {

    @Autowired
    private NestRepository nestRepository;

    @Override
    @GetMapping(path="nests/")
    public List<NestEntity> findAll() {
        return nestRepository.findAll();
    }

    @Override
    @GetMapping(path="nest/{nest_id}")
    public NestEntity findById(@PathVariable("nest_id")Integer id) {
        return nestRepository.findByNestId(id);
    }

    @Override
    @GetMapping(path = "nests/status/{status}")
    public List<NestEntity> findByStatus(@PathVariable("status") String status) {
        return nestRepository.findByStatus(status);
    }

    @Override
    @GetMapping(path = "nests/collector/{username}")
    public List<NestEntity> findByCollectorUserName(@PathVariable("username")String collectorUsername) {
        return nestRepository.findByCollectorUserName(collectorUsername);
    }

    @Override
    @PostMapping(path = "nest/")
    public NestEntity createNest(@RequestBody NestEntity nestEntity) {
        return nestRepository.saveAndFlush(nestEntity);
    }

    @Override
    @PutMapping(path = "nest/")
    public NestEntity updateNest(@RequestBody NestEntity nestEntity) {
        return nestRepository.save(nestEntity);
    }
}
