package com.example.contas.service.impl;

import com.example.contas.model.Registry;
import com.example.contas.repository.RegistryRepository;
import com.example.contas.service.IRegistryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;


import java.util.List;

@Service
public class RegistryServiceImpl extends CrudServiceImpl<Registry, Long>
        implements IRegistryService {

    private final RegistryRepository registryRepository;


    public RegistryServiceImpl(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    @Override
    protected JpaRepository<Registry, Long> getRepository() {
        return registryRepository;
    }

    @Override
    public Registry findOne(Long aLong) {
        Optional<Registry> optionalRegistry = registryRepository.findById(aLong);
        return optionalRegistry.orElse(null);
    }


    @Override
    public List<Registry> findAll() {
        return registryRepository.findAll();
    }

    @Override
    public void delete(Long aLong) {
        if (registryRepository.findById(aLong) != null) {
            super.delete(aLong);
        }
    }
}
