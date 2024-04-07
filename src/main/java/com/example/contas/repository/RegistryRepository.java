package com.example.contas.repository;

import com.example.contas.model.Registry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistryRepository extends JpaRepository<Registry, Long> {
    Optional<Registry> findById(Long id);

}
