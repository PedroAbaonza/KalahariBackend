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
    private T011GrupoEntity t011GrupoByGrupo;
    private T010UniversidadEntity t010UniversidadByUniversidad;

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

    @ManyToOne
    @JoinColumn(name = "grupo", referencedColumnName = "cdGrupo", nullable = false)
    public T011GrupoEntity getT011GrupoByGrupo() { return t011GrupoByGrupo; };

    public void setT011GrupoByGrupo(T011GrupoEntity t011GrupoByGrupo) {
        this.t011GrupoByGrupo = t011GrupoByGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "universidad", referencedColumnName = "cdUniversidad", nullable = false)
    public T010UniversidadEntity getT010UniversidadByUniversidad() {
        return t010UniversidadByUniversidad;
    }

    public void setT010UniversidadByUniversidad(T010UniversidadEntity t010UniversidadByUniversidad) {
        this.t010UniversidadByUniversidad = t010UniversidadByUniversidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T000UsuariosEntity that = (T000UsuariosEntity) o;
        return Objects.equals(usuarioToken, that.usuarioToken) && Objects.equals(notificacionToken, that.notificacionToken) && Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email) && Objects.equals(fhRegistro, that.fhRegistro) && Objects.equals(t011GrupoByGrupo, that.t011GrupoByGrupo) && Objects.equals(t010UniversidadByUniversidad, that.t010UniversidadByUniversidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioToken, notificacionToken, nombre, email, fhRegistro, t011GrupoByGrupo, t010UniversidadByUniversidad);
    }
}
