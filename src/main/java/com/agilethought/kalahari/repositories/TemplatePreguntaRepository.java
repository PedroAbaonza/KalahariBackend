package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplatePreguntaRepository extends JpaRepository<T007TemplatePreguntaEntity, Integer> {
}
