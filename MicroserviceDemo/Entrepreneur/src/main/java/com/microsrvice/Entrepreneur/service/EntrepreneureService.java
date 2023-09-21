package com.microsrvice.Entrepreneur.service;

import com.microsrvice.Entrepreneur.dto.EntrepreneureDto;
import com.microsrvice.Entrepreneur.entity.Entrepreneure;

public interface EntrepreneureService {

    EntrepreneureDto createEntrepreneur(Entrepreneure entrepreneure);
    EntrepreneureDto getEntrepreneur(Long id);
}
