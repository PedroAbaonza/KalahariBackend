package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.models.V005GruposExamenEntity;
import com.agilethought.kalahari.repositories.GruposExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class GruposExamenService {

    @Autowired
    GruposExamenRepository gruposExamenRepository;

    public ArrayList<V005GruposExamenEntity> getGruposExamen() {
        //return (java.util.ArrayList<com.agilethought.kalahari.models.T011GrupoEntity>) grupoRepository.findAll();
        return (ArrayList<V005GruposExamenEntity>) gruposExamenRepository.getGruposExamen();
    }
}
