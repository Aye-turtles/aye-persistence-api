package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.NestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NestRepository extends JpaRepository<NestEntity, Long> {
}
