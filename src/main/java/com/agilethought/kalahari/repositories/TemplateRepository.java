package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T004TipoPreguntaEntity;
import com.agilethought.kalahari.models.T006TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<T006TemplateEntity, Integer> {
}
