package com.example.contas.service.impl;

import com.example.contas.model.RegistroDetalhe;
import com.example.contas.repository.RegistroDetalheRepository;
import com.example.contas.service.IRegistroDetalheService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroDetalheServiceImpl extends CrudServiceImpl<RegistroDetalhe, Long>
        implements IRegistroDetalheService {

    private final RegistroDetalheRepository registroDetalheRepository;


    public RegistroDetalheServiceImpl(RegistroDetalheRepository registroDetalheRepository) {
        this.registroDetalheRepository = registroDetalheRepository;
    }

    @Override
    protected JpaRepository<RegistroDetalhe, Long> getRepository() {
        return registroDetalheRepository;
    }

    @Override
    public RegistroDetalhe findOne(Long aLong) {
        Optional<RegistroDetalhe> optionalRegistryDetail = registroDetalheRepository.findById(aLong);
        return optionalRegistryDetail.orElse(null);
    }


    @Override
    public List<RegistroDetalhe> findAll() {
        return registroDetalheRepository.findAll();
    }

    @Override
    public void delete(Long aLong) {
        if (registroDetalheRepository.findById(aLong) != null) {
            super.delete(aLong);
        }
    }
}
