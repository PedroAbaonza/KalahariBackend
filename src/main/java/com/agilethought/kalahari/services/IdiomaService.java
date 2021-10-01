package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T003IdiomaEntity;
import com.agilethought.kalahari.repositories.IdiomaRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IdiomaService implements GenericoService<T003IdiomaEntity, String, String>{
    @Autowired
    IdiomaRepository idiomaRepository;
    @Override
    public ArrayList<T003IdiomaEntity> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(idiomaRepository);
    }

    @Override
    public String agregar(T003IdiomaEntity object) throws Exception {
        return FuncionesRepositorios.agregar(idiomaRepository, object, object.getCdIdioma());
    }

    @Override
    public String eliminar(String id) throws Exception {
        return FuncionesRepositorios.eliminar(idiomaRepository, id);
    }

    @Override
    public String actualizar(T003IdiomaEntity object) throws Exception {
        return FuncionesRepositorios.actualizar(idiomaRepository, object, object.getCdIdioma());
    }
}
