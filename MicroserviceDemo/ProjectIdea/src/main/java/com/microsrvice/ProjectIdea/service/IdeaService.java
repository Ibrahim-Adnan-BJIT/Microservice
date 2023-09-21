package com.microsrvice.ProjectIdea.service;

import com.microsrvice.ProjectIdea.dto.IdeaDto;
import com.microsrvice.ProjectIdea.entity.Ideas;

public interface IdeaService {

    IdeaDto createIdea(Ideas ideas);

    Ideas getIdea(Long id);
}
