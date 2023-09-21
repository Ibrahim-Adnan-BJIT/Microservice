package com.microsrvice.ProjectIdea.repository;

import com.microsrvice.ProjectIdea.entity.Ideas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepo extends JpaRepository<Ideas,Long> {
}
