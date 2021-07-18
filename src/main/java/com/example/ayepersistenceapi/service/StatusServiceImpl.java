package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.StatusEntity;
import com.example.ayepersistenceapi.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<StatusEntity> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public StatusEntity saveStatus(StatusEntity status) {
        return statusRepository.save(status);
    }
}
