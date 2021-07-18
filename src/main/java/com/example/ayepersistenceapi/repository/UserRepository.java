package com.example.ayepersistenceapi.repository;

import com.example.ayepersistenceapi.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("Select us from user us where us.username =:username")
    public UserEntity findByUsername(@Param("username") String username);
}
