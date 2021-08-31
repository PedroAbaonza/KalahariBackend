package com.agilethought.kalahari.repositories;


import com.agilethought.kalahari.models.V002UsuariosPorGrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuariosPorGrupoRepository extends JpaRepository<V002UsuariosPorGrupoEntity, String> {

    public ArrayList<V002UsuariosPorGrupoEntity> encontrarPorGrupo(Integer grupo);

    public Optional<V002UsuariosPorGrupoEntity> encontrarPorToken(String token);
}
