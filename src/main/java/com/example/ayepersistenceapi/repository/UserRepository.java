package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
