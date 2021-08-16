package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "T009_USUARIO_TEMPLATE_PREGUNTA_RESPUESTA")
public class T009UsuarioTemplatePreguntaRespuestaEntity {
    private int cdUsuarioTemplateRespuesta;
    private Integer seleccion1;
    private Integer seleccion2;
    private Integer seleccion3;
    private Integer seleccion4;
    private Integer punto;
    private Integer tiempoTomado;
    private String trackOpcion;
    private Timestamp fechaCreacion;

    @Id
    @Column(name = "cdUsuarioTemplateRespuesta")
    public int getCdUsuarioTemplateRespuesta() {
        return cdUsuarioTemplateRespuesta;
    }

    public void setCdUsuarioTemplateRespuesta(int cdUsuarioTemplateRespuesta) {
        this.cdUsuarioTemplateRespuesta = cdUsuarioTemplateRespuesta;
    }

    @Basic
    @Column(name = "seleccion1")
    public Integer getSeleccion1() {
        return seleccion1;
    }

    public void setSeleccion1(Integer seleccion1) {
        this.seleccion1 = seleccion1;
    }

    @Basic
    @Column(name = "seleccion2")
    public Integer getSeleccion2() {
        return seleccion2;
    }

    public void setSeleccion2(Integer seleccion2) {
        this.seleccion2 = seleccion2;
    }

    @Basic
    @Column(name = "seleccion3")
    public Integer getSeleccion3() {
        return seleccion3;
    }

    public void setSeleccion3(Integer seleccion3) {
        this.seleccion3 = seleccion3;
    }

    @Basic
    @Column(name = "seleccion4")
    public Integer getSeleccion4() {
        return seleccion4;
    }

    public void setSeleccion4(Integer seleccion4) {
        this.seleccion4 = seleccion4;
    }

    @Basic
    @Column(name = "punto")
    public Integer getPunto() {
        return punto;
    }

    public void setPunto(Integer punto) {
        this.punto = punto;
    }

    @Basic
    @Column(name = "tiempoTomado")
    public Integer getTiempoTomado() {
        return tiempoTomado;
    }

    public void setTiempoTomado(Integer tiempoTomado) {
        this.tiempoTomado = tiempoTomado;
    }

    @Basic
    @Column(name = "trackOpcion")
    public String getTrackOpcion() {
        return trackOpcion;
    }

    public void setTrackOpcion(String trackOpcion) {
        this.trackOpcion = trackOpcion;
    }

    @Basic
    @Column(name = "fechaCreacion")
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T009UsuarioTemplatePreguntaRespuestaEntity that = (T009UsuarioTemplatePreguntaRespuestaEntity) o;
        return cdUsuarioTemplateRespuesta == that.cdUsuarioTemplateRespuesta && Objects.equals(seleccion1, that.seleccion1) && Objects.equals(seleccion2, that.seleccion2) && Objects.equals(seleccion3, that.seleccion3) && Objects.equals(seleccion4, that.seleccion4) && Objects.equals(punto, that.punto) && Objects.equals(tiempoTomado, that.tiempoTomado) && Objects.equals(trackOpcion, that.trackOpcion) && Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdUsuarioTemplateRespuesta, seleccion1, seleccion2, seleccion3, seleccion4, punto, tiempoTomado, trackOpcion, fechaCreacion);
    }
}
