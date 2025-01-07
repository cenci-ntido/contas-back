package com.example.contas.repository;

import com.example.contas.model.RegistroDetalhe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistroDetalheRepository extends JpaRepository<RegistroDetalhe, Long> {
    Optional<RegistroDetalhe> findById(Long id);

}
