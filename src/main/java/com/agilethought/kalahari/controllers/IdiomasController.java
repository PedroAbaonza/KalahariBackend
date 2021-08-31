package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T003IdiomaEntity;
import com.agilethought.kalahari.repositories.IdiomaRepository;
import com.agilethought.kalahari.services.IdiomaService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("idiomas")
public class IdiomasController implements GenericoController<T003IdiomaEntity, String, String>{
    @Autowired
    IdiomaService idiomaService;

    @Override
    public ArrayList<T003IdiomaEntity> obtnerTodo() {
        return FuncionesController.obtnerTodo(idiomaService);
    }

    @Override
    public String agregar(T003IdiomaEntity object) {
        return FuncionesController.agregar(idiomaService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(String id) {
        return FuncionesController.eliminar(idiomaService, id, Textos.Repositorios.Eliminar.ERROR);
    }

    @Override
    public String actualizar(T003IdiomaEntity object) {
        return FuncionesController.actualizar(idiomaService, object, Textos.Repositorios.Actualizar.ERROR);
    }
}
