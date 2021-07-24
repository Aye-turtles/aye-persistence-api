package com.example.ayepersistenceapi.service;

import com.example.ayepersistenceapi.model.entity.UserEntity;
import com.example.ayepersistenceapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @GetMapping(path="users/")
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @GetMapping(path = "user/{username}")
    public UserEntity findUserByUsername(@PathVariable("username")String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    @PostMapping(path = "user/")
    public UserEntity createNewUser(@RequestBody UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    @PutMapping("user/")
    public UserEntity updateUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }
}
