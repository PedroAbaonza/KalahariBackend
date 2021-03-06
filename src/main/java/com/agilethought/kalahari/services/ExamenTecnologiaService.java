package com.agilethought.kalahari.services;


import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.repositories.ExamenTecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class ExamenTecnologiaService {
    @Autowired
    ExamenTecnologiaRepository examenTecnologiaRepository;

    public ArrayList<V004ExamenPorTecnologiaEntity> getExamenTecnologia() {
        return (ArrayList<V004ExamenPorTecnologiaEntity>) examenTecnologiaRepository.getExamenTecnologia();
    }

    public ArrayList<V004ExamenPorTecnologiaEntity> getExamenTecnologia(Integer tecnologia) {
        return (ArrayList<V004ExamenPorTecnologiaEntity>) examenTecnologiaRepository.getExamenTecnologia(tecnologia);
    }
}


