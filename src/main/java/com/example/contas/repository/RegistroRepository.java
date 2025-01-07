package com.example.contas.repository;

import com.example.contas.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    Optional<Registro> findById(Long id);

}
