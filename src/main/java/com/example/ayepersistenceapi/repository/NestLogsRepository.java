package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.NestLogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NestLogsRepository extends JpaRepository<NestLogsEntity, Long> {

    @Query("Select nsl from nestlogs nsl where nsl.id_nest.id =:nestEntityId")
    List<NestLogsEntity> findByNestEntityId(@Param("nestEntityId") Integer nestEntityId);
}
