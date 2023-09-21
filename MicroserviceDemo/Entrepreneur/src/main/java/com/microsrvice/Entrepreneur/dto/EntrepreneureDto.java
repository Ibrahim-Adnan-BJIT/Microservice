package com.microsrvice.Entrepreneur.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EntrepreneureDto {

    private Long id;
    private String name;
    private String location;
    private String number;
    private Long ideaCode;
}
