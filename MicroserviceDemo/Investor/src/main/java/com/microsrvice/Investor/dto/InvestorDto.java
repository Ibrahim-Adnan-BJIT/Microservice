package com.microsrvice.Investor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class InvestorDto {
    private Long id;
    private String name;
    private String Location;
    private String phoneNumber;
    private Long investCode;
}
