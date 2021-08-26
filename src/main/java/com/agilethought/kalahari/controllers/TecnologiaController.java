package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.services.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/tecnologia")
public class TecnologiaController {

    @Autowired
    TecnologiaService tecnologiaService;

    @GetMapping("")
    public ArrayList<T001TecnologiaEntity> obtenerTecnologias() {
        return tecnologiaService.obtenerTecnologias();
    }
}
