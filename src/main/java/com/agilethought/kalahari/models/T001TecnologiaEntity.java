package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T001_TECNOLOGIA", schema = "kalahari", catalog = "")
public class T001TecnologiaEntity {
    private String cdTecnologia;
    private String descripcion;
    //*********************
    private List<T005PreguntaEntity> preguntas;

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

    @JsonIgnore
    @OneToMany(targetEntity = T005PreguntaEntity.class, cascade = CascadeType.ALL)
    public List<T005PreguntaEntity> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<T005PreguntaEntity> preguntas) {
        this.preguntas = preguntas;
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
