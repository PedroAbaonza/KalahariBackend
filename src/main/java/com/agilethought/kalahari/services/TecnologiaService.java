package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.repositories.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TecnologiaService {

    @Autowired
    TecnologiaRepository tecnologiaRepository;

    public ArrayList<T001TecnologiaEntity> obtenerTecnologias() {
        return (ArrayList<T001TecnologiaEntity>) tecnologiaRepository.findAll();
    }
}
