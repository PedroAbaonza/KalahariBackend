package com.agilethought.kalahari.repositories;


import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamenTecnologiaRepository extends CrudRepository<V004ExamenPorTecnologiaEntity, Integer> {
    //Esta consulta corresponde al metodo de ExamenTecnologiaController.
    //Nos trae a todas las personas que han realizado un examen de acuerdo al having que en este caso es'
    @Query(nativeQuery = true, value = "select u.nombre, descripcion as Grupo, fechaAplicacion, t.nombre as Nombre_Examen, calificacion " +
            "from T000_USUARIOS u " +
            "inner join T011_GRUPO g " +
            "on u.grupo  = g.cdGrupo " +
            "inner join T008_USUARIO_TEMPLATE ut " +
            "on u.usuarioToken = ut.usuarioToken " +
            "inner join T006_TEMPLATE t " +
            "on ut.cdTemplate = t.cdTemplate " +
            "having t.nombre like 'Jav%' " +
            "order by u.nombre, t.nombre, fechaAplicacion;")


    List<V004ExamenPorTecnologiaEntity> getExamenTecnologia();
}

