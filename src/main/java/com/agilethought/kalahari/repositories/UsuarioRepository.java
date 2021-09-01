package com.agilethought.kalahari.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilethought.kalahari.models.T000UsuariosEntity;

@Repository
public interface UsuarioRepository extends CrudRepository<T000UsuariosEntity, String> {
	@Query("SELECT listaUsuarios FROM T011GrupoEntity AS grupo LEFT JOIN grupo.usuarios AS listaUsuarios WHERE grupo.cdGrupo = ?1")
	public List<T000UsuariosEntity> findAllWithGrupo(Integer id);
}
