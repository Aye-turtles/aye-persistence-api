package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
}
