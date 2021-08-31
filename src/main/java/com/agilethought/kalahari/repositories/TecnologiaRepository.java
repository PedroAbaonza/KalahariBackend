package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TecnologiaRepository extends JpaRepository<T001TecnologiaEntity, String> {
}
