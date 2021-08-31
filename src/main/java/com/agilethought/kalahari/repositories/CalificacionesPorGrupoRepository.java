package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.V002UsuariosPorGrupoEntity;
import com.agilethought.kalahari.models.V003CalificacionesPorGrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.Optional;

public interface CalificacionesPorGrupoRepository extends JpaRepository<V003CalificacionesPorGrupoEntity, String> {

    public ArrayList<V003CalificacionesPorGrupoEntity> encontrarPorGrupo(Integer grupo);

    public ArrayList<V003CalificacionesPorGrupoEntity> encontrarPorToken(String token);
}
