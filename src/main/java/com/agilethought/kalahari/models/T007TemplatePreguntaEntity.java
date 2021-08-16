package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T007_TEMPLATE_PREGUNTA")
public class T007TemplatePreguntaEntity {
    private int cdTemplatePregunta;
    private Integer tiempoRespuesta;

    @Id
    @Column(name = "cdTemplatePregunta")
    public int getCdTemplatePregunta() {
        return cdTemplatePregunta;
    }

    public void setCdTemplatePregunta(int cdTemplatePregunta) {
        this.cdTemplatePregunta = cdTemplatePregunta;
    }

    @Basic
    @Column(name = "tiempoRespuesta")
    public Integer getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(Integer tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T007TemplatePreguntaEntity that = (T007TemplatePreguntaEntity) o;
        return cdTemplatePregunta == that.cdTemplatePregunta && Objects.equals(tiempoRespuesta, that.tiempoRespuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdTemplatePregunta, tiempoRespuesta);
    }
}
