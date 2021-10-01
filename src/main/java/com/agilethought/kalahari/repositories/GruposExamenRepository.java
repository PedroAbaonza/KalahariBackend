package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.models.V005GruposExamenEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GruposExamenRepository extends CrudRepository <V005GruposExamenEntity, Integer>{

    @Query(nativeQuery = true, value = "select DISTINCT g.descripcion, t.nombre " +
            "from T000_USUARIOS u " +
            "inner JOIN T011_GRUPO g " +
            "on u.grupo  = g.cdGrupo " +
            "Inner JOIN  T008_USUARIO_TEMPLATE ut " +
            "on u.usuarioToken = ut.usuarioToken " +
            "inner join T006_TEMPLATE t " +
            "on ut.cdTemplate = t.cdTemplate " +
            "having t.nombre Like 'Jav%' " +
            "order by g.descripcion;")

    List<V005GruposExamenEntity> getGruposExamen();
}
