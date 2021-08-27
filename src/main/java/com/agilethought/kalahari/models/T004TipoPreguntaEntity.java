package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T004_TIPO_PREGUNTA", schema = "kalahari", catalog = "")
public class T004TipoPreguntaEntity {
    private int cdTipoPregunta;
    private String descripcion;
    //****
    private List<T005PreguntaEntity> preguntas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdTipoPregunta", unique = true, nullable = false)
    public int getCdTipoPregunta() {
        return cdTipoPregunta;
    }

    public void setCdTipoPregunta(int cdTipoPregunta) {
        this.cdTipoPregunta = cdTipoPregunta;
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
        T004TipoPreguntaEntity that = (T004TipoPreguntaEntity) o;
        return cdTipoPregunta == that.cdTipoPregunta && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdTipoPregunta, descripcion);
    }
}
