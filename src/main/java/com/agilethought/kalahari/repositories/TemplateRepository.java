package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.models.T006TemplateEntity;
import org.springframework.data.repository.CrudRepository;

public interface TemplateRepository extends CrudRepository<T006TemplateEntity, String> {

}
