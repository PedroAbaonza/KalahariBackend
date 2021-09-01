package com.agilethought.kalahari.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.kalahari.models.T011GrupoEntity;

@Repository
public interface GrupoRepository extends CrudRepository<T011GrupoEntity, Integer> {


}
