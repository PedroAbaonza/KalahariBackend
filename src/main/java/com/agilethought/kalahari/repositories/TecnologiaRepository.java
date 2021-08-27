package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TecnologiaRepository extends CrudRepository<T001TecnologiaEntity, String>, JpaRepository<T001TecnologiaEntity, String> {
}
