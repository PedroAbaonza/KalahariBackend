package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.models.T013UsuariosRH;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRHRepository extends CrudRepository <T013UsuariosRH, String>{
}
