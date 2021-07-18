package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> findAll();

    public UserEntity findByUsername(String username);

    public UserEntity createUser(UserEntity user);

    public UserEntity updateUser(UserEntity user);
}
