package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface TemplatePreguntaRepository extends JpaRepository<T007TemplatePreguntaEntity, Integer> {

    @Query("Select T005.pregunta from T007TemplatePreguntaEntity T007 join T007.t006TemplateByCdTemplate T006" +
            " join T007.t005PreguntaByCdPregunta T005 where T006.cdTemplate = ?1")
    ArrayList<String> getPreguntas(int cd);

}
