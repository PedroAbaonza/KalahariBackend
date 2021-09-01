package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Immutable
@NamedQuery(name = "V003CalificacionesPorGrupoEntity.encontrarPorGrupo", query = "SELECT v FROM V003CalificacionesPorGrupoEntity v WHERE v.grupo = ?1")
@NamedQuery(name = "V003CalificacionesPorGrupoEntity.encontrarPorToken", query = "SELECT v FROM V003CalificacionesPorGrupoEntity v WHERE v.usuarioToken = ?1")
@Table(name = "V003_CALIFICACIONES_POR_GRUPO", schema = "kalahari", catalog = "")
public class V003CalificacionesPorGrupoEntity {
    private int cdUsuarioTemplate;
    private String usuarioToken;
    private int grupo;
    private String nombre;
    private String tecnologia;
    private BigDecimal calificacion;

    @Id
    @Column(name = "cdUsuarioTemplate")
    public int getCdUsuarioTemplate() { return cdUsuarioTemplate; }

    public void setCdUsuarioTemplate(int cdUsuarioTemplate) { this.cdUsuarioTemplate = cdUsuarioTemplate; }

    @Basic
    @Column(name = "usuarioToken")
    public String getUsuarioToken() {
        return usuarioToken;
    }

    public void setUsuarioToken(String usuarioToken) {
        this.usuarioToken = usuarioToken;
    }

    @Basic
    @Column(name = "grupo")
    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "tecnologia")
    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Basic
    @Column(name = "calificacion")
    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }
}
