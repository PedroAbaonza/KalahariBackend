package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T004TipoPreguntaEntity;
import com.agilethought.kalahari.services.TipoPreguntaService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("tipoPregunta")
public class TipoPreguntaController implements GenericoController<T004TipoPreguntaEntity, String, Integer>{
    @Autowired
    TipoPreguntaService tipoPreguntaService;
    @Override
    public ArrayList<T004TipoPreguntaEntity> obtnerTodo() {
        return FuncionesController.obtnerTodo(tipoPreguntaService);
    }

    @Override
    public String agregar(T004TipoPreguntaEntity object) {
        return FuncionesController.agregar(tipoPreguntaService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(Integer id) {
        return FuncionesController.eliminar(tipoPreguntaService, id, Textos.Repositorios.Eliminar.ERROR);
    }

    @Override
    public String actualizar(T004TipoPreguntaEntity object) {
        return FuncionesController.actualizar(tipoPreguntaService, object, Textos.Repositorios.Actualizar.ERROR);
    }
}
