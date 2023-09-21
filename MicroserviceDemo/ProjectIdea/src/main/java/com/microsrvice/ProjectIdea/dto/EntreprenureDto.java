package com.microsrvice.ProjectIdea.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EntreprenureDto {

    private Long id;
    private String name;
    private String location;
    private String number;
    private Long ideaCode;
}
