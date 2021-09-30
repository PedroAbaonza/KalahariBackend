package com.agilethought.kalahari.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "T013_USUARIOS_RH", schema = "kalahari", catalog = "")
public class T013UsuariosRH {

    private String usuarioToken;
    private String nombre;
    private String email;
    private Integer  intentos_fail;
    private Date fecha_bloqueo;
    private boolean disabled;



    @Id
    public String getUsuarioToken() {
        return usuarioToken;
    }

    public void setUsuarioToken(String usuarioToken) {
        this.usuarioToken = usuarioToken;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIntentos_fail() {
        return intentos_fail;
    }

    public void setIntentos_fail(Integer intentos_fail) {
        this.intentos_fail = intentos_fail;
    }

    public Date getFecha_bloqueo() {
        return fecha_bloqueo;
    }

    public void setFecha_bloqueo(Date fecha_bloqueo) {
        this.fecha_bloqueo = fecha_bloqueo;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
