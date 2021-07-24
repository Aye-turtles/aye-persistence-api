package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.StatusEntity;

import java.util.List;

public interface StatusService {

    public List<StatusEntity> findAll();

    StatusEntity createNewStatus(StatusEntity status);
}
