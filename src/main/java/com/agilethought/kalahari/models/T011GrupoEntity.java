package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "T011_GRUPO", schema = "kalahari", catalog = "")
public class T011GrupoEntity {
    private int cdGrupo;
    private String descripcion;
    private Timestamp fechaAplicacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdGrupo", unique = true, nullable = false)
    public int getCdGrupo() {
        return cdGrupo;
    }

    public void setCdGrupo(int cdGrupo) {
        this.cdGrupo = cdGrupo;
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
    @Column(name = "fechaAplicacion")
    public Timestamp getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Timestamp fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T011GrupoEntity that = (T011GrupoEntity) o;
        return cdGrupo == that.cdGrupo && Objects.equals(descripcion, that.descripcion) && Objects.equals(fechaAplicacion, that.fechaAplicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdGrupo, descripcion, fechaAplicacion);
    }
}
