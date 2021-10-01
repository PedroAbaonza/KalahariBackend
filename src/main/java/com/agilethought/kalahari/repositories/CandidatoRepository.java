package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.dto.CandidatosResponse;
import com.agilethought.kalahari.models.T014Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface CandidatoRepository extends JpaRepository<T014Candidato, Integer> {

    @Query("SELECT new com.agilethought.kalahari.dto.CandidatosResponse(" +
            "c.cdCandidato, " +
            "c.nombreCandidato, " +
            "c.apellidoPaternoCandidato, " +
            "c.apellidoMaternoCandidato, " +
            "c.correoCandidato," +
            "u.nombre, " +
            "g.descripcion) FROM T014Candidato c " +
            "JOIN T010UniversidadEntity u ON c.cdUniversidad = u.cdUniversidad " +
            "JOIN T011GrupoEntity g ON c.cdGrupo = g.cdGrupo")
    ArrayList<CandidatosResponse> listaJoinCandidatosGruposUniverisdades();
}
