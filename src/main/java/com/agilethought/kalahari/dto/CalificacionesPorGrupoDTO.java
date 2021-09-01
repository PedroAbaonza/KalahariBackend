package com.agilethought.kalahari.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.*;

public class CalificacionesPorGrupoDTO {
    private String usuarioToken;
    private String nombre;
    private String universidad;
    private Map<String, BigDecimal> examenes = new LinkedHashMap<>();
    private BigDecimal promedio;
    private Date fecha;

    public CalificacionesPorGrupoDTO(String usuarioToken, String nombre, String universidad, Map<String, BigDecimal> examenes, BigDecimal promedio, Date fecha) {
        this.usuarioToken = usuarioToken;
        this.nombre = nombre;
        this.universidad = universidad;
        this.examenes = examenes;
        this.promedio = promedio;
        this.fecha = fecha;
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

    public Map<String, BigDecimal> getExamenes() {
        return examenes;
    }

    @JsonAnySetter
    public void setExamenes(Map<String, BigDecimal> examenes) {
        this.examenes = examenes;
    }

    @JsonAnySetter
    public void setExamenes(String key, BigDecimal value) {
        this.examenes.put(key, value);
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
