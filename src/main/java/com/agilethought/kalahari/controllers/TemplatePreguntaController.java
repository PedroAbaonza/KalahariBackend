package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import com.agilethought.kalahari.services.TemplatePreguntaService;
import com.agilethought.kalahari.services.TemplateService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("templatePregunta")
public class TemplatePreguntaController implements GenericoController<T007TemplatePreguntaEntity, String, Integer>{
    @Autowired
    TemplatePreguntaService templatePreguntaService;
    @Override
    public ArrayList<T007TemplatePreguntaEntity> obtnerTodo() {
        return FuncionesController.obtnerTodo(templatePreguntaService);
    }

    @Override
    public String agregar(T007TemplatePreguntaEntity object) {

        return FuncionesController.agregar(templatePreguntaService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(Integer id) {
        return FuncionesController.eliminar(templatePreguntaService, id, Textos.Repositorios.Eliminar.ERROR);
    }

    @Override
    public String actualizar(T007TemplatePreguntaEntity object) {

        return FuncionesController.actualizar(templatePreguntaService, object, Textos.Repositorios.Actualizar.ERROR);
    }
}
