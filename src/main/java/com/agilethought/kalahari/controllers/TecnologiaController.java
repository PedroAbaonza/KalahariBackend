package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.services.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("tecnologia")
public class TecnologiaController {

    @Autowired
    TecnologiaService tecnologiaService;

    @GetMapping("lista")
    public @ResponseBody  ArrayList<T001TecnologiaEntity> obtenerTecnologias(){
        return tecnologiaService.obtenerTecnologias();
    }

    @PostMapping("agregar")
    public @ResponseBody String agregarTecnologia(@RequestBody T001TecnologiaEntity t001TecnologiaEntity){
        return tecnologiaService.agregarTecnologia(t001TecnologiaEntity);
    }

    @DeleteMapping("eliminar/{id}")
    public @ResponseBody String eliminarTecnologia(@PathVariable("id") String id){
        return tecnologiaService.eliminarTecnologia(id);
    }

    @PutMapping("actualizar/{id}")
    public @ResponseBody String actualizarTecnologia(@RequestBody T001TecnologiaEntity t001TecnologiaEntity, @PathVariable("id") String id){
        return tecnologiaService.actualizarTecnologia(t001TecnologiaEntity, id);
    }
}
