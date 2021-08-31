package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.dto.PreguntasResponse;
import com.agilethought.kalahari.models.T005PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PreguntasRepository extends JpaRepository<T005PreguntaEntity, Integer> {
        /**
         *
         * Obtenemos una lista de todas la preguntas de la base de datos con los campos:
         * pregunta,nivel, idioma, tipo, tecnologia, respuesta1, respuesta2, respuesta3,
         * respuesta4, correcta1, correcta2, correcta3 correcta4, tiempo
         * @return  ArrayList<PreguntasResponse>
         */
        @Query("SELECT new com.agilethought.kalahari.dto.PreguntasResponse(T005.cdPregunta, T005.pregunta, T002.descripcion, " +
        "T003.descripcion, T004.descripcion, T001.descripcion, T005.respuesta1, T005.respuesta2, " +
        "T005.respuesta3, T005.respuesta4, T005.correcta1, T005.correcta2, T005.correcta3, T005.correcta4, T007.tiempoRespuesta) " +
        "FROM T005PreguntaEntity T005 JOIN T005.t001TecnologiaByTecnologia T001 JOIN T005.t002NivelByNivel T002 " +
        "JOIN T005.t003IdiomaByIdioma T003 JOIN T005.t004TipoPreguntaByTipo T004 JOIN T005.t007TemplatePreguntaEntity T007 ")
        ArrayList<PreguntasResponse> listaPreguntas();

}
