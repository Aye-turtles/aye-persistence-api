package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.NestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NestRepository extends JpaRepository<NestEntity, Long> {


    @Query("Select ns from nest ns where ns.collector.username =:username")
    List<NestEntity> findByCollectorUserName(@Param("username")String collectorUsername);

    @Query("Select ns from nest ns where ns.status.name =:status")
    List<NestEntity> findByStatus(@Param("status") String status);

    @Query("Select ns from nest ns where ns.id =:id")
    NestEntity findByNestId(@Param("id") Integer id);
}
