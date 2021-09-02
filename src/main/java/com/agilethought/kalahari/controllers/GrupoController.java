package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.dto.CalificacionesPorGrupoDTO;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.V002UsuariosPorGrupoEntity;
import com.agilethought.kalahari.models.V003CalificacionesPorGrupoEntity;
import com.agilethought.kalahari.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/grupo")
public class GrupoController {
    @Autowired
    GrupoService grupoService;

    @GetMapping("")
    public ArrayList<T011GrupoEntity> obtenerGrupos() {
        return grupoService.obtenerGrupos();
    }

    @GetMapping("/gruposOrdered")
    public ArrayList<T011GrupoEntity> obtenerGruposOrdered(){
        return grupoService.obtenerGruposOrderedByFechaAplicacion();
    }

    @PostMapping()
    public T011GrupoEntity guardarGrupo(@RequestBody T011GrupoEntity grupo) {
        grupo.setFechaAplicacion(Timestamp.valueOf("2020-05-01 15:30:00.0"));
        return grupoService.guardarGrupo(grupo);
    }

    @GetMapping("/{cdGrupo}")
    public Optional<T011GrupoEntity> obtenerGrupoPorId(@PathVariable("cdGrupo") Integer cdGrupo){
        return grupoService.obtenerPorId(cdGrupo);
    }

    @DeleteMapping(path = "/{cdGrupo}")
    public String eliminarPorId(@PathVariable("cdGrupo") Integer cdGrupo){
        boolean isResult = this.grupoService.eliminarGrupo(cdGrupo);
        if(isResult){
            return "Se elimino el usuario con id " + cdGrupo;
        }else{
            return "No se pudo eliminar el usuario con id "+ cdGrupo;
        }
    }

    @GetMapping(path = "/calificaciones/usuarios_por_grupo/{cdGrupo}")
    public ArrayList<V002UsuariosPorGrupoEntity> obtenerUsuariosPorGrupo(@PathVariable("cdGrupo") Integer cdGrupo) {
        return this.grupoService.obtenerUsuariosPorGrupo(cdGrupo);
    }

    @GetMapping(path = "/calificaciones/calificaciones_por_grupo/{cdGrupo}")
    public ArrayList<V003CalificacionesPorGrupoEntity> obtenerCalificacionesPorGrupo(@PathVariable("cdGrupo") Integer cdGrupo) {
        return this.grupoService.obtenerCalificacionesPorGrupo(cdGrupo);
    }

    @GetMapping(path = "/calificaciones/{cdGrupo}")
    public ArrayList<CalificacionesPorGrupoDTO> obtenerCalificaciones(@PathVariable("cdGrupo") Integer cdGrupo) {
        return this.grupoService.obtenerCalificaciones(cdGrupo);
    }
    
    @GetMapping(path = "/tecnologias/{cdGrupo}")
    public Map<String, Integer> obtenerTecnologias(@PathVariable("cdGrupo") Integer cdGrupo) {
        return this.grupoService.obtenerTecnologias(cdGrupo);
    }

    @GetMapping(path = "/calificaciones/{cdGrupo}/{cdToken}")
    public Optional<CalificacionesPorGrupoDTO> obtenerCalificaciones(@PathVariable("cdGrupo") Integer cdGrupo, @PathVariable("cdToken") String cdToken) {
        return this.grupoService.obtenerCalificaciones(cdToken);
    }
}
