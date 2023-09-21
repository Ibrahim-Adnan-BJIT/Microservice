package com.microsrvice.ProjectIdea.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IdeaDto {
    private Long id;
    private String title;
    private String description;
    private Long ideaCode;
    private Long investCode;
}
