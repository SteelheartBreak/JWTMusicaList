package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    Optional <UserEntity> findByCorreo(String correo);
    Boolean existsByCorreo(String correo);
}
