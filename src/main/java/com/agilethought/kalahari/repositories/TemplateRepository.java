package com.agilethought.kalahari.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.kalahari.models.T006TemplateEntity;

@Repository
public interface TemplateRepository extends CrudRepository<T006TemplateEntity, Integer> {

}
