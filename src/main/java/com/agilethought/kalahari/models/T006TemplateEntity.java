package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T006_TEMPLATE", schema = "kalahari", catalog = "")
public class T006TemplateEntity {
    private int cdTemplate;
    private String nombre;
    private List<T007TemplatePreguntaEntity> preguntasTemplate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdTemplate", unique = true, nullable = false)
    public int getCdTemplate() {
        return cdTemplate;
    }

    public void setCdTemplate(int cdTemplate) {
        this.cdTemplate = cdTemplate;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T006TemplateEntity that = (T006TemplateEntity) o;
        return cdTemplate == that.cdTemplate && Objects.equals(nombre, that.nombre);
    }

    @JsonIgnore
    @OneToMany(targetEntity = T007TemplatePreguntaEntity.class, mappedBy = "t006TemplateByCdTemplate")
    public List<T007TemplatePreguntaEntity> getTemplatePreguntas() {
        return preguntasTemplate;
    }

    public void setTemplatePreguntas(List<T007TemplatePreguntaEntity> preguntasTemplate) {
        this.preguntasTemplate = preguntasTemplate;
    }
    @Override
    public int hashCode() {
        return Objects.hash(cdTemplate, nombre);
    }
}
