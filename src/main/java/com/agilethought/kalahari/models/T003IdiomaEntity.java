package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T003_IDIOMA", schema = "kalahari", catalog = "")
public class T003IdiomaEntity {
    private String cdIdioma;
    private String descripcion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdIdioma", unique = true, nullable = false)
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
