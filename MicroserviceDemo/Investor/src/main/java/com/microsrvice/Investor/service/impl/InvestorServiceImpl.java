package com.microsrvice.Investor.service.impl;

import com.microsrvice.Investor.dto.InvestorDto;
import com.microsrvice.Investor.entity.Investor;
import com.microsrvice.Investor.repository.InvestorRepo;
import com.microsrvice.Investor.service.InvestorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorServiceImpl implements InvestorService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private InvestorRepo investorRepo;
    @Override
    public InvestorDto createInvestor(Investor investor) {
       investorRepo.save(investor);
       return modelMapper.map(investor,InvestorDto.class);
    }

    @Override
    public InvestorDto getInvestor(Long id) {
       Investor investor=investorRepo.findById(id).orElseThrow();
       return modelMapper.map(investor,InvestorDto.class);
    }
}
