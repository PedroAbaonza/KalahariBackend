package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T003_IDIOMA", schema = "kalahari", catalog = "")
public class T003IdiomaEntity {
    private String cdIdioma;
    private String descripcion;

    //*************
    private List<T005PreguntaEntity> preguntas;

    @Id
    @Column(name = "cdIdioma")
    public String getCdIdioma() {
        return cdIdioma;
    }

    public void setCdIdioma(String cdIdioma) {
        this.cdIdioma = cdIdioma;
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
        T003IdiomaEntity that = (T003IdiomaEntity) o;
        return Objects.equals(cdIdioma, that.cdIdioma) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdIdioma, descripcion);
    }
}
