package com.agilethought.kalahari.services;

import com.agilethought.kalahari.dto.CalificacionesPorGrupoDTO;
import com.agilethought.kalahari.dto.TecnologiaCalificacionDTO;
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

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        MultiValueMap<String, TecnologiaCalificacionDTO> teccalPorUsuario = new LinkedMultiValueMap<>();

        for (V003CalificacionesPorGrupoEntity teccal : calificacionesPorGrupo) {
            teccalPorUsuario.add(teccal.getUsuarioToken(), new TecnologiaCalificacionDTO(
                    teccal.getTecnologia(),
                    teccal.getCalificacion()
            ));
        }

        ArrayList<CalificacionesPorGrupoDTO> calificaciones = new ArrayList<>();

        for (V002UsuariosPorGrupoEntity usuario : usuariosPorGrupo) {
            String usuarioToken = usuario.getUsuarioToken();
            String nombre = usuario.getNombre();
            String universidad = usuario.getUniversidad();
            BigDecimal promedio = usuario.getPromedio();
            Date fecha = usuario.getFecha();

            List<TecnologiaCalificacionDTO> teccalDTO = teccalPorUsuario.get(usuarioToken);
            Map<String, BigDecimal> examenes = new LinkedHashMap<>();
            if (teccalDTO != null) {
                for (TecnologiaCalificacionDTO teccal : teccalDTO) {
                    examenes.put(teccal.getTecnologia(), teccal.getCalificacion());
                }
            }
            calificaciones.add(new CalificacionesPorGrupoDTO(usuarioToken, nombre, universidad, examenes, promedio, fecha));
        }

        return calificaciones;
    }

    public String[] obtenerTecnologias(Integer grupo) {
        ArrayList<V003CalificacionesPorGrupoEntity> calificacionesPorGrupo = obtenerCalificacionesPorGrupo(grupo);

        HashSet<String> tecnologias = new HashSet<>();

        for (V003CalificacionesPorGrupoEntity calificacion : calificacionesPorGrupo) {
            tecnologias.add(calificacion.getTecnologia());
        }

        return tecnologias.toArray(new String[0]);
    }
}
