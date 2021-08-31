package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.services.TemplateService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("template")
public class TemplateController implements GenericoController<T006TemplateEntity, String, Integer>{
    @Autowired
    TemplateService templateService;
    @Override
    public ArrayList<T006TemplateEntity> obtnerTodo() {
        return FuncionesController.obtnerTodo(templateService);
    }

    @Override
    public String agregar(T006TemplateEntity object) {
        return FuncionesController.agregar(templateService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(Integer id) {
        return FuncionesController.eliminar(templateService, id, Textos.Repositorios.Eliminar.ERROR);
    }

    @Override
    public String actualizar(T006TemplateEntity object) {
        return FuncionesController.actualizar(templateService, object, Textos.Repositorios.Actualizar.ERROR);
    }
}
