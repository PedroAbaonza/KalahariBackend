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

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public ArrayList<T011GrupoEntity> obtenerGruposOrderedByFechaAplicacion(){
        return (ArrayList<T011GrupoEntity>) grupoRepository.obtenerGruposOrderedByFechaAplicacion();
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

    public Optional<V002UsuariosPorGrupoEntity> obtenerUsuarioPorToken(String token) {
        return (Optional<V002UsuariosPorGrupoEntity>) usuariosPorGrupoRepository.encontrarPorToken(token);
    }

    public ArrayList<V003CalificacionesPorGrupoEntity> obtenerCalificacionPorToken(String token) {
        return (ArrayList<V003CalificacionesPorGrupoEntity>) calificacionesPorGrupoRepository.encontrarPorToken(token);
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
            Date fecha = usuario.getFecha();

            List<TecnologiaCalificacionDTO> teccalDTO = teccalPorUsuario.get(usuarioToken);
            Map<String, BigDecimal> examenes = new LinkedHashMap<>();
            BigDecimal promedio = null;
            if (teccalDTO != null) {
                promedio = new BigDecimal(0);
                BigDecimal acumulado = new BigDecimal(0);
                BigDecimal cantidad = new BigDecimal(0);
                BigDecimal adicion = new BigDecimal(1);
                for (TecnologiaCalificacionDTO teccal : teccalDTO) {
                    if (teccal.getCalificacion() != null) {
                        examenes.put(teccal.getTecnologia(), teccal.getCalificacion());
                        acumulado = acumulado.add(teccal.getCalificacion());
                        cantidad = cantidad.add(adicion);
                    }
                }
                if (cantidad.intValue() != 0) {
                    promedio = acumulado.divide(cantidad, 2, RoundingMode.DOWN);
                }
            }
            calificaciones.add(new CalificacionesPorGrupoDTO(usuarioToken, nombre, universidad, examenes, promedio, fecha));
        }

        return calificaciones;
    }

    public Map<String, Integer> obtenerTecnologias(Integer grupo) {
        ArrayList<V003CalificacionesPorGrupoEntity> calificacionesPorGrupo = obtenerCalificacionesPorGrupo(grupo);

        Map<String, Integer> tecnologias = new HashMap<>();

        for (V003CalificacionesPorGrupoEntity calificacion : calificacionesPorGrupo) {
            tecnologias.put(calificacion.getTecnologia(), calificacion.getCdTemplate());
        }

        return tecnologias;
    }

    public Optional<CalificacionesPorGrupoDTO> obtenerCalificaciones(String token) {
        Optional<V002UsuariosPorGrupoEntity> usuarioPorToken = obtenerUsuarioPorToken(token);
        ArrayList<V003CalificacionesPorGrupoEntity> calificacionesPorToken = obtenerCalificacionPorToken(token);

        if (!usuarioPorToken.isPresent()) {
            return null;
        }

        ArrayList<TecnologiaCalificacionDTO> teccalDTO = new ArrayList<>();

        for (V003CalificacionesPorGrupoEntity teccal : calificacionesPorToken) {
            teccalDTO.add(new TecnologiaCalificacionDTO(
                    teccal.getTecnologia(),
                    teccal.getCalificacion()
            ));
        }

        String usuarioToken = usuarioPorToken.get().getUsuarioToken();
        String nombre = usuarioPorToken.get().getNombre();
        String universidad = usuarioPorToken.get().getUniversidad();
        Date fecha = usuarioPorToken.get().getFecha();

        Map<String, BigDecimal> examenes = new LinkedHashMap<>();
        BigDecimal promedio = null;
        if (teccalDTO != null) {
            promedio = new BigDecimal(0);
            BigDecimal acumulado = new BigDecimal(0);
            BigDecimal cantidad = new BigDecimal(0);
            BigDecimal adicion = new BigDecimal(1);
            for (TecnologiaCalificacionDTO teccal : teccalDTO) {
                if (teccal.getCalificacion() != null) {
                    examenes.put(teccal.getTecnologia(), teccal.getCalificacion());
                    acumulado = acumulado.add(teccal.getCalificacion());
                    cantidad = cantidad.add(adicion);
                }
            }
            if (cantidad.intValue() != 0) {
                promedio = acumulado.divide(cantidad, 2, RoundingMode.DOWN);
            }
        }

        return Optional.of(new CalificacionesPorGrupoDTO(usuarioToken, nombre, universidad, examenes, promedio, fecha));
    }
}
