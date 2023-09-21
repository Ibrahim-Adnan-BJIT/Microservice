package com.microsrvice.Entrepreneur.service.impl;

import com.microsrvice.Entrepreneur.dto.EntrepreneureDto;
import com.microsrvice.Entrepreneur.entity.Entrepreneure;
import com.microsrvice.Entrepreneur.repository.EntrepreneurRepo;
import com.microsrvice.Entrepreneur.service.EntrepreneureService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepreneurServiceRepo implements EntrepreneureService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EntrepreneurRepo entrepreneurRepo;
    @Override
    public EntrepreneureDto createEntrepreneur(Entrepreneure entrepreneure) {
        EntrepreneureDto entrepreneureDto=modelMapper.map(entrepreneure,EntrepreneureDto.class);
        entrepreneurRepo.save(entrepreneure);
        return entrepreneureDto;
    }

    @Override
    public EntrepreneureDto getEntrepreneur(Long id) {
       Entrepreneure entrepreneure=entrepreneurRepo.findById(id).orElseThrow();
       return modelMapper.map(entrepreneure,EntrepreneureDto.class);
    }
}
