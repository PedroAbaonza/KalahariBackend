package com.agilethought.kalahari.services;

import com.agilethought.kalahari.dto.CalificacionesPorGrupoDTO;
import com.agilethought.kalahari.dto.CalificacionesPorUsuarioDTO;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.V002UsuariosPorGrupoEntity;
import com.agilethought.kalahari.models.V003CalificacionesPorGrupoEntity;
import com.agilethought.kalahari.repositories.CalificacionesPorGrupoRepository;
import com.agilethought.kalahari.repositories.GrupoRepository;
import com.agilethought.kalahari.repositories.UsuariosPorGrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;

@Service
public class GrupoService {
    @Autowired
    GrupoRepository grupoRepository;

    public ArrayList<T011GrupoEntity> obtenerGrupos() {
        return (ArrayList<T011GrupoEntity>) grupoRepository.findAll();
    }

    public T011GrupoEntity guardarGrupo(T011GrupoEntity t011Grupo) {
        return grupoRepository.save(t011Grupo);
    }

    public Optional<T011GrupoEntity> obtenerPorId(Integer id) {
        return grupoRepository.findById(id);
    }

    public boolean eliminarGrupo(Integer cdGrupo) {

        if (grupoRepository.existsById(cdGrupo)) {
            grupoRepository.deleteById(cdGrupo);
            return grupoRepository.existsById(cdGrupo);
        } else {
            return false;
        }
    }

    @Autowired
    UsuariosPorGrupoRepository usuariosPorGrupoRepository;
    @Autowired
    CalificacionesPorGrupoRepository calificacionesPorGrupoRepository;

    public ArrayList<V002UsuariosPorGrupoEntity> obtenerUsuariosPorGrupo(Integer grupo) {
        return (ArrayList<V002UsuariosPorGrupoEntity>) usuariosPorGrupoRepository.encontrarPorGrupo(grupo);
    }

    public ArrayList<V003CalificacionesPorGrupoEntity> obtenerCalificacionesPorGrupo(Integer grupo) {
        return (ArrayList<V003CalificacionesPorGrupoEntity>) calificacionesPorGrupoRepository.encontrarPorGrupo(grupo);
    }

    public ArrayList<CalificacionesPorGrupoDTO> obtenerCalificaciones(Integer grupo) {
        ArrayList<V002UsuariosPorGrupoEntity> usuariosPorGrupo = obtenerUsuariosPorGrupo(grupo);
        ArrayList<V003CalificacionesPorGrupoEntity> calificacionesPorGrupo = obtenerCalificacionesPorGrupo(grupo);

        MultiValueMap<String, CalificacionesPorUsuarioDTO> calificacionesPorUsuario = new LinkedMultiValueMap<>();

        for (V003CalificacionesPorGrupoEntity calificacion : calificacionesPorGrupo) {
            calificacionesPorUsuario.add(calificacion.getUsuarioToken(), new CalificacionesPorUsuarioDTO(
                    calificacion.getTecnologia(),
                    calificacion.getCalificacion(),
                    calificacion.getResuelto()
            ));
        }

        ArrayList<CalificacionesPorGrupoDTO> calificaciones = new ArrayList<>();

        for (V002UsuariosPorGrupoEntity usuarios : usuariosPorGrupo) {
            calificaciones.add(new CalificacionesPorGrupoDTO(
                    usuarios.getUsuarioToken(),
                    usuarios.getNombre(),
                    usuarios.getUniversidad(),
                    usuarios.getPromedio(),
                    calificacionesPorUsuario.get(usuarios.getUsuarioToken())
            ));
        }

        return calificaciones;
    }
}
