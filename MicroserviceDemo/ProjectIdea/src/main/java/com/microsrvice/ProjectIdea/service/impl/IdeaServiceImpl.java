package com.microsrvice.ProjectIdea.service.impl;

import com.microsrvice.ProjectIdea.dto.IdeaDto;
import com.microsrvice.ProjectIdea.entity.Ideas;
import com.microsrvice.ProjectIdea.repository.IdeaRepo;
import com.microsrvice.ProjectIdea.service.APIClient;
import com.microsrvice.ProjectIdea.service.IdeaService;
import com.microsrvice.ProjectIdea.service.InvestorClient;
import com.netflix.discovery.converters.Auto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdeaServiceImpl implements IdeaService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IdeaRepo ideaRepo;

    @Autowired
    private APIClient apiClient;
    @Autowired
    private InvestorClient investorClient;
    @Override
    public IdeaDto createIdea(Ideas ideas) {
            ideaRepo.save(ideas);
            return modelMapper.map(ideas,IdeaDto.class);
    }

    @Override
    public Ideas getIdea(Long id) {
           Ideas ideas=ideaRepo.findById(id).orElseThrow();
    }
}
