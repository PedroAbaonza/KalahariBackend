package com.agilethought.kalahari.services;

import com.agilethought.kalahari.dto.CandidatosResponse;
import com.agilethought.kalahari.models.T014Candidato;
import com.agilethought.kalahari.repositories.CandidatoRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CandidatoService implements GenericoService<T014Candidato, String, Integer> {
    @Autowired
    CandidatoRepository candidatoRepository;
    @Override
    public ArrayList<T014Candidato> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(candidatoRepository);
    }

    @Override
    public String agregar(T014Candidato object) throws Exception {
        return FuncionesRepositorios.agregar(candidatoRepository,object,object.getCdCandidato());
    }

    @Override
    public String eliminar(Integer id) throws Exception {
        return FuncionesRepositorios.eliminar(candidatoRepository,id);
    }

    @Override
    public String actualizar(T014Candidato object) throws Exception {
        return FuncionesRepositorios.actualizar(candidatoRepository, object, object.getCdCandidato());
    }

    public ArrayList<CandidatosResponse> listaJoinCandidatosGruposUniverisdades() throws Exception{
        return candidatoRepository.listaJoinCandidatosGruposUniverisdades();
    }
}
