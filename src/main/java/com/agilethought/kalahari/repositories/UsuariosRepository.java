package com.agilethought.kalahari.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.kalahari.models.T000UsuariosEntity;

@Repository
public interface UsuariosRepository extends CrudRepository<T000UsuariosEntity, String> {
	List<T000UsuariosEntity> findByGrupo(Integer grupo);
}
