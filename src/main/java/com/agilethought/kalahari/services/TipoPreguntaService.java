package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T004TipoPreguntaEntity;
import com.agilethought.kalahari.repositories.TipoPreguntaRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TipoPreguntaService implements GenericoService<T004TipoPreguntaEntity, String, Integer> {
    @Autowired
    TipoPreguntaRepository tipoPreguntaRepository;

    @Override
    public ArrayList<T004TipoPreguntaEntity> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(tipoPreguntaRepository);
    }

    @Override
    public String agregar(T004TipoPreguntaEntity object) throws Exception {
        return FuncionesRepositorios.agregar(tipoPreguntaRepository, object, object.getCdTipoPregunta());
    }

    @Override
    public String eliminar(Integer id) throws Exception {
        return FuncionesRepositorios.eliminar(tipoPreguntaRepository, id);
    }

    @Override
    public String actualizar(T004TipoPreguntaEntity object) throws Exception {
        return FuncionesRepositorios.actualizar(tipoPreguntaRepository, object, object.getCdTipoPregunta());
    }
}
