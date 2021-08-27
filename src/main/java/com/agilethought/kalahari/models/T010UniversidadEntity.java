package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T010_UNIVERSIDAD", schema = "kalahari", catalog = "")
public class T010UniversidadEntity {
    private int cdUniversidad;
    private String nombre;

    @Id
    @Column(name = "cdUniversidad")
    public int getCdUniversidad() {
        return cdUniversidad;
    }

    public void setCdUniversidad(int cdUniversidad) {
        this.cdUniversidad = cdUniversidad;
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
        T010UniversidadEntity that = (T010UniversidadEntity) o;
        return cdUniversidad == that.cdUniversidad && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdUniversidad, nombre);
    }
}
