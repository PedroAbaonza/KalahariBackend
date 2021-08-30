package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T002NivelEntity;
import com.agilethought.kalahari.repositories.NivelRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NivelService implements GenericoService<T002NivelEntity, String, Integer>{
    @Autowired
    NivelRepository nivelRepository;

    @Override
    public ArrayList<T002NivelEntity> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(nivelRepository);
    }

    @Override
    public String agregar(T002NivelEntity object) throws Exception {
        return FuncionesRepositorios.agregar(nivelRepository, object, object.getCdNivel());
    }

    @Override
    public String eliminar(Integer id) throws Exception {
        return FuncionesRepositorios.eliminar(nivelRepository, id);
    }

    @Override
    public String actualizar(T002NivelEntity object) throws Exception {
        return FuncionesRepositorios.actualizar(nivelRepository, object, object.getCdNivel());
    }
}
