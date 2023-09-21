package com.microsrvice.ProjectIdea.service;

import com.microsrvice.ProjectIdea.dto.EntreprenureDto;
import com.microsrvice.ProjectIdea.dto.InvestorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INVESTOR-SERVICE")
public interface InvestorClient {

    @GetMapping("api/investors/{investor-code}")
    InvestorDto getInvestor(@PathVariable("investor-code") String investCode);
}
