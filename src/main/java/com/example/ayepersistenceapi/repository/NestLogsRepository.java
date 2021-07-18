package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.NestLogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NestLogsRepository extends JpaRepository<NestLogsEntity, Long> {
}
