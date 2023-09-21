package com.microsrvice.Investor.service;

import com.microsrvice.Investor.dto.InvestorDto;
import com.microsrvice.Investor.entity.Investor;

public interface InvestorService {

    InvestorDto createInvestor(Investor investor);

    InvestorDto getInvestor(Long id);
}
