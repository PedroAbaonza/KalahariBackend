package com.agilethought.kalahari.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalificacionesPorGrupoDTO {
    private String usuarioToken;
    private String nombre;
    private String universidad;
    private BigDecimal promedio;
    private List<CalificacionesPorUsuarioDTO> calificaciones;

    public CalificacionesPorGrupoDTO(String usuarioToken, String nombre, String universidad, BigDecimal promedio, List<CalificacionesPorUsuarioDTO> calificaciones) {
        this.usuarioToken = usuarioToken;
        this.nombre = nombre;
        this.universidad = universidad;
        this.promedio = promedio;
        this.calificaciones = calificaciones;
    }

    public String getUsuarioToken() {
        return usuarioToken;
    }

    public void setUsuarioToken(String usuarioToken) {
        this.usuarioToken = usuarioToken;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    public List<CalificacionesPorUsuarioDTO> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<CalificacionesPorUsuarioDTO> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
