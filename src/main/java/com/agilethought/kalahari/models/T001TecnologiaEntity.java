package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T001_TECNOLOGIA")
public class T001TecnologiaEntity {
    private String cdTecnologia;
    private String descripcion;

    @Id
    @Column(name = "cdTecnologia")
    public String getCdTecnologia() {
        return cdTecnologia;
    }

    public void setCdTecnologia(String cdTecnologia) {
        this.cdTecnologia = cdTecnologia;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T001TecnologiaEntity that = (T001TecnologiaEntity) o;
        return Objects.equals(cdTecnologia, that.cdTecnologia) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdTecnologia, descripcion);
    }
}
