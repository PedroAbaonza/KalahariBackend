package com.agilethought.kalahari.dto;

import java.math.BigDecimal;

public class CalificacionesPorUsuarioDTO {
    private String tecnologia;
    private BigDecimal calificacion;
    private int resuelto;

    public CalificacionesPorUsuarioDTO(String tecnologia, BigDecimal calificacion, int resuelto) {
        this.tecnologia = tecnologia;
        this.calificacion = calificacion;
        this.resuelto = resuelto;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }

    public int getResuelto() {
        return resuelto;
    }

    public void setResuelto(int resuelto) {
        this.resuelto = resuelto;
    }
}
