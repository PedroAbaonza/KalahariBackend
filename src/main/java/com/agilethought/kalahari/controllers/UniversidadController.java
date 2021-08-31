package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T010UniversidadEntity;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.services.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/universidad")
public class UniversidadController {
    @Autowired
    UniversidadService universidadService;

    @GetMapping("")
    public ArrayList<T010UniversidadEntity> obtenerUniversidades() {

        return universidadService.obtenerUniversidades();
    }

    @GetMapping("/{cdUniversidad}")
    public Optional<T010UniversidadEntity> obtenerPorIdUniversidad(@PathVariable("cdUniversidad") Integer cdUniversidad){
        return universidadService.obtenerPorIdUniversidad(cdUniversidad);
    }

    @PostMapping("/AgregarUniversidad")
    public T010UniversidadEntity guardarUniversidad(@RequestBody T010UniversidadEntity universidad) {
        universidadService.guardarUniversidad(universidad);
        return universidadService.guardarUniversidad(universidad);
    }

    @DeleteMapping(path = "/eliminar/{cdUniversidad}")
    public String eliminarUniversidadPorId(@PathVariable("cdUniversidad") Integer cdUniversidad){
        boolean isResult = this.universidadService.eliminarUniversidadPorId(cdUniversidad);

        if(isResult){
            return "Se elimino correctamente universidad con el  id " + cdUniversidad;
        }else{
            return "No se elimino correctamente la universidad  "+ cdUniversidad;
        }
    }
}
