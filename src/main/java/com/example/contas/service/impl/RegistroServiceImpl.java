package com.example.contas.service.impl;

import com.example.contas.model.Registro;
import com.example.contas.repository.RegistroRepository;
import com.example.contas.service.IRegistroService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;


import java.util.List;

@Service
public class RegistroServiceImpl extends CrudServiceImpl<Registro, Long>
        implements IRegistroService {

    private final RegistroRepository registroRepository;


    public RegistroServiceImpl(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    @Override
    protected JpaRepository<Registro, Long> getRepository() {
        return registroRepository;
    }

    @Override
    public Registro findOne(Long aLong) {
        Optional<Registro> optionalRegistry = registroRepository.findById(aLong);
        return optionalRegistry.orElse(null);
    }


    @Override
    public List<Registro> findAll() {
        return registroRepository.findAll();
    }

    @Override
    public void delete(Long aLong) {
        if (registroRepository.findById(aLong) != null) {
            super.delete(aLong);
        }
    }
}
