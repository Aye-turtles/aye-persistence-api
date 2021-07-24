package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.StatusEntity;
import com.example.ayepersistenceapi.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    @GetMapping(path="status/")
    public List<StatusEntity> findAll() {
        return statusRepository.findAll();
    }

    @Override
    @PostMapping(path="status/")
    public StatusEntity createNewStatus(@RequestBody StatusEntity status) {
        return statusRepository.save(status);
    }
}
