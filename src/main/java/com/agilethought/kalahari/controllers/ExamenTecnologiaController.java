package com.agilethought.kalahari.controllers;


import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.repositories.ExamenTecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/examen")
public class ExamenTecnologiaController {

    @Autowired
    ExamenTecnologiaRepository examenTecnologiaRepository;

    /**
     * Metodo que regresa los resultados de todos los grupos en una tecnologia en especifico
     * La tecnologia que se necesite se manda en la Query de ExamenTecnologiaRepository
     * @return
     */
    @GetMapping("/resultados")
    public @ResponseBody List<V004ExamenPorTecnologiaEntity> getExamenTecnologia(){
        List<V004ExamenPorTecnologiaEntity> lst = examenTecnologiaRepository.getExamenTecnologia();

        return lst;
    }

}

