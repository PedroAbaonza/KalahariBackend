package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.V004ExamenPorTecnologiaEntity;
import com.agilethought.kalahari.models.V005GruposExamenEntity;
import com.agilethought.kalahari.repositories.GruposExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/grupos-examen")
public class GruposExamenController {

    @Autowired
    GruposExamenRepository gruposExamenRepository;

    @GetMapping("")
    public @ResponseBody
    List<V005GruposExamenEntity> getGruposExamen(){
        List<V005GruposExamenEntity> lst = gruposExamenRepository.getGruposExamen();

        return lst;
    }
}
