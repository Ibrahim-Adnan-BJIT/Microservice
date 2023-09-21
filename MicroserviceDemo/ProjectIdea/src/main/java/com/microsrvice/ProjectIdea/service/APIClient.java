package com.microsrvice.ProjectIdea.service;

import com.microsrvice.ProjectIdea.dto.EntreprenureDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ENTREPRENEUR-SERVICE")
public interface APIClient {
    // Build get department rest api
    @GetMapping("api/entrepreneurs/{entrepreneur-code}")
    EntreprenureDto getEntrepreneur(@PathVariable("entrepreneur-code") String ideaCode);
}
