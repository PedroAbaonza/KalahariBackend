package com.agilethought.kalahari.services;


import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.repositories.ExamenTecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExamenTecnologiaService {
    @Autowired
    ExamenTecnologiaRepository examenTecnologiaRepository;

    public ArrayList<V004ExamenPorTecnologiaEntity> getExamenTecnologia() {
        //return (java.util.ArrayList<com.agilethought.kalahari.models.T011GrupoEntity>) grupoRepository.findAll();
        return (ArrayList<V004ExamenPorTecnologiaEntity>) examenTecnologiaRepository.getExamenTecnologia();
    }
}


