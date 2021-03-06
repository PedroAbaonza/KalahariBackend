package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.dto.PreguntaTemplateResponse;
import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public interface TemplatePreguntaRepository extends JpaRepository<T007TemplatePreguntaEntity, Integer> {

    @Query("Select new com.agilethought.kalahari.dto.PreguntaTemplateResponse(T005.cdPregunta, T005.pregunta) from T007TemplatePreguntaEntity T007 join T007.t006TemplateByCdTemplate T006" +
            " join T007.t005PreguntaByCdPregunta T005 where T006.cdTemplate = ?1 and T007.status = 1 and T005.status = 1")
    ArrayList<PreguntaTemplateResponse> getPreguntas(int cd);

    @Query(value = "select  distinct T005.cdPregunta AS cdPregunta, T005.pregunta AS pregunta from T007_TEMPLATE_PREGUNTA T007 " +
            "right join T006_TEMPLATE T006 on T007.cdTemplate = T006.cdTemplate " +
            "right join T005_PREGUNTA T005 on T007.cdPregunta = T005.cdPregunta " +
            "where (T006.cdTemplate != ?1 or T006.cdTemplate is null) and T005.status != 0", nativeQuery = true)
    List<?> getPreguntasSinTemplate(int cd);

   // @Modifying
    //@Query(value = "update T007_TEMPLATE_PREGUNTA SET status = 0 where cdPregunta = 120 and cdTemplate = 2", nativeQuery = true)
    //void modificarStatus2();

    @Transactional
    @Modifying()
    @Query("UPDATE T007TemplatePreguntaEntity T007 set T007.status = ?1 " +
            "where T007.t005PreguntaByCdPregunta.cdPregunta = ?2 " +
            "and T007.t006TemplateByCdTemplate.cdTemplate = ?3")
    int modificarStatus(int status, int cdPregunta, int cdTemplate);




}
