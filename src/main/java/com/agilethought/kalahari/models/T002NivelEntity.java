package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T002_NIVEL", schema = "kalahari", catalog = "")
public class T002NivelEntity {
    private int cdNivel;
    private String descripcion;
    private Integer puntaje;

    @Id
    @Column(name = "cdNivel")
    public int getCdNivel() {
        return cdNivel;
    }

    public void setCdNivel(int cdNivel) {
        this.cdNivel = cdNivel;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "puntaje")
    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T002NivelEntity that = (T002NivelEntity) o;
        return cdNivel == that.cdNivel && Objects.equals(descripcion, that.descripcion) && Objects.equals(puntaje, that.puntaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdNivel, descripcion, puntaje);
    }
}
