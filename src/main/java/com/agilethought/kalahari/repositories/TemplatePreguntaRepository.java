package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface TemplatePreguntaRepository extends JpaRepository<T007TemplatePreguntaEntity, Integer> {

    @Query("Select T005.pregunta from T007TemplatePreguntaEntity T007 join T007.t006TemplateByCdTemplate T006" +
            " join T007.t005PreguntaByCdPregunta T005 where T006.cdTemplate = ?1")
    ArrayList<String> getPreguntas(int cd);

    @Query(value = "select T005.cdPregunta AS cdPregunta, T005.pregunta AS pregunta from T007_TEMPLATE_PREGUNTA T007 " +
            "right join T006_TEMPLATE T006 on T007.cdTemplate = T006.cdTemplate " +
            "right join T005_PREGUNTA T005 on T007.cdPregunta = T005.cdPregunta " +
            "where (T006.cdTemplate != ?1 or T006.cdTemplate is null) and (T007.status =1 or T007.status is null)", nativeQuery = true)
    List<?> getPreguntasSinTemplate(int cd);

}
