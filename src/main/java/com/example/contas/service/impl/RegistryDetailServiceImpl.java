package com.example.contas.service.impl;

import com.example.contas.model.RegistryDetail;
import com.example.contas.repository.RegistryDetailRepository;
import com.example.contas.service.IRegistryDetailService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistryDetailServiceImpl extends CrudServiceImpl<RegistryDetail, Long>
        implements IRegistryDetailService {

    private final RegistryDetailRepository registryDetailRepository;


    public RegistryDetailServiceImpl(RegistryDetailRepository registryDetailRepository) {
        this.registryDetailRepository = registryDetailRepository;
    }

    @Override
    protected JpaRepository<RegistryDetail, Long> getRepository() {
        return registryDetailRepository;
    }

    @Override
    public RegistryDetail findOne(Long aLong) {
        Optional<RegistryDetail> optionalRegistryDetail = registryDetailRepository.findById(aLong);
        return optionalRegistryDetail.orElse(null);
    }


    @Override
    public List<RegistryDetail> findAll() {
        return registryDetailRepository.findAll();
    }

    @Override
    public void delete(Long aLong) {
        if (registryDetailRepository.findById(aLong) != null) {
            super.delete(aLong);
        }
    }
}
