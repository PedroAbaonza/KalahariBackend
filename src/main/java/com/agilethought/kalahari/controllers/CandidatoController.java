package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.dto.CandidatosResponse;
import com.agilethought.kalahari.models.T014Candidato;
import com.agilethought.kalahari.services.CandidatoService;
import com.agilethought.kalahari.utils.FuncionesController;
import com.agilethought.kalahari.utils.Textos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("Candidatos")
public class CandidatoController implements GenericoController<T014Candidato, String,Integer>{
    @Autowired
    CandidatoService candidatoService;

    @Override
    public ArrayList<T014Candidato> obtnerTodo() {
        return FuncionesController.obtnerTodo(candidatoService);

    }

    @Override
    public String agregar(T014Candidato object) {
        return FuncionesController.agregar(candidatoService, object, Textos.Repositorios.Agregar.ERROR);
    }

    @Override
    public String eliminar(Integer id) {
        return FuncionesController.eliminar(candidatoService,id,Textos.Repositorios.Eliminar.ERROR);

    }

    @Override
    public String actualizar(T014Candidato object) {
        return FuncionesController.actualizar(candidatoService,object,Textos.Repositorios.Actualizar.ERROR);
    }
    @GetMapping("listaJoin")
    public ArrayList<CandidatosResponse> listaJoinCandidatosGruposUniverisdades(){
        try{
            return candidatoService.listaJoinCandidatosGruposUniverisdades();
        }catch (Exception e){
            return null;
        }
    }
}
