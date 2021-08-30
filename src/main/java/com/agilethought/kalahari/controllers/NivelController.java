package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T002NivelEntity;
import com.agilethought.kalahari.models.T003IdiomaEntity;
import com.agilethought.kalahari.services.IdiomaService;
import com.agilethought.kalahari.services.NivelService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import jnr.ffi.annotations.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("nivel")
public class NivelController implements GenericoController<T002NivelEntity, String, Integer>{
    @Autowired
    NivelService nivelService;

    @Override
    public ArrayList<T002NivelEntity> obtnerTodo() {
        return FuncionesController.obtnerTodo(nivelService);
    }

    @Override
    public String agregar(T002NivelEntity object) {
        return FuncionesController.agregar(nivelService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(Integer id) {

        return FuncionesController.eliminar(nivelService, id, Textos.Repositorios.Eliminar.ERROR);
    }

    @Override
    public String actualizar(T002NivelEntity object) {
        return FuncionesController.actualizar(nivelService, object, Textos.Repositorios.Actualizar.ERROR);
    }
}
