package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    public List<UserEntity> findAllUsers();

    public UserEntity findUserByUsername(String username);

    public UserEntity createNewUser(UserEntity user);

    public UserEntity updateUser(UserEntity user);
}
