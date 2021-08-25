package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "T000_USUARIOS", schema = "kalahari", catalog = "")
public class T000UsuariosEntity {
    private String usuarioToken;
    private String notificacionToken;
    private String nombre;
    private String email;
    private Timestamp fhRegistro;
    private Integer grupo;

    @Id
    @Column(name = "usuarioToken")
    public String getUsuarioToken() {
        return usuarioToken;
    }

    public void setUsuarioToken(String usuarioToken) {
        this.usuarioToken = usuarioToken;
    }

    @Basic
    @Column(name = "notificacionToken")
    public String getNotificacionToken() {
        return notificacionToken;
    }

    public void setNotificacionToken(String notificacionToken) {
        this.notificacionToken = notificacionToken;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "fhRegistro")
    public Timestamp getFhRegistro() {
        return fhRegistro;
    }

    public void setFhRegistro(Timestamp fhRegistro) {
        this.fhRegistro = fhRegistro;
    }

    @Basic
    @Column(name = "grupo")
    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T000UsuariosEntity that = (T000UsuariosEntity) o;
        return Objects.equals(usuarioToken, that.usuarioToken) && Objects.equals(notificacionToken, that.notificacionToken) && Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email) && Objects.equals(fhRegistro, that.fhRegistro) && Objects.equals(grupo, that.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioToken, notificacionToken, nombre, email, fhRegistro, grupo);
    }
}
