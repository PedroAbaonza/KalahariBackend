package com.agilethought.kalahari.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.kalahari.models.T008UsuarioTemplateEntity;

@Repository
public interface UsuariosTemplateRepository extends CrudRepository<T008UsuarioTemplateEntity, Integer> {
	
}
