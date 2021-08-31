package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Immutable
@NamedQuery(name = "V002UsuariosPorGrupoEntity.encontrarPorGrupo", query = "SELECT v FROM V002UsuariosPorGrupoEntity v WHERE v.grupo = ?1")
@Table(name = "V002_USUARIOS_POR_GRUPO", schema = "kalahari", catalog = "")
public class V002UsuariosPorGrupoEntity {
    private String usuarioToken;
    private int grupo;
    private String nombre;
    private String universidad;
    private BigDecimal promedio;
    private Date fecha;

    @Id
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
    @Column(name = "universidad")
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Basic
    @Column(name = "promedio")
    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    @Basic
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
