package com.agilethought.kalahari.dto;

import java.math.BigDecimal;

public class TecnologiaCalificacionDTO {
    private String tecnologia;
    private BigDecimal calificacion;

    public TecnologiaCalificacionDTO(String tecnologia, BigDecimal calificacion) {
        this.tecnologia = tecnologia;
        this.calificacion = calificacion;
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
}
