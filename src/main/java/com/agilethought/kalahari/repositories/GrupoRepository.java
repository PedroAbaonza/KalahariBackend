package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T011GrupoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface GrupoRepository extends CrudRepository<T011GrupoEntity, Integer> {

    @Query(nativeQuery = true,
            value = "SELECT cdGrupo, descripcion, fechaAplicacion FROM T011_GRUPO " +
                    "ORDER BY fechaAplicacion DESC;")
    ArrayList<T011GrupoEntity> obtenerGruposOrderedByFechaAplicacion();

}
