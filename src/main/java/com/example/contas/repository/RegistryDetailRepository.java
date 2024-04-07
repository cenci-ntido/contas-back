package com.example.contas.repository;

import com.example.contas.model.Registry;
import com.example.contas.model.RegistryDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistryDetailRepository extends JpaRepository<RegistryDetail, Long> {
    Optional<RegistryDetail> findById(Long id);

}
