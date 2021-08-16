package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T008_USUARIO_TEMPLATE")
public class T008UsuarioTemplateEntity {
    private int cdUsuarioTemplate;
    private Byte resuelto;
    private Double calificacion;

    @Id
    @Column(name = "cdUsuarioTemplate")
    public int getCdUsuarioTemplate() {
        return cdUsuarioTemplate;
    }

    public void setCdUsuarioTemplate(int cdUsuarioTemplate) {
        this.cdUsuarioTemplate = cdUsuarioTemplate;
    }

    @Basic
    @Column(name = "resuelto")
    public Byte getResuelto() {
        return resuelto;
    }

    public void setResuelto(Byte resuelto) {
        this.resuelto = resuelto;
    }

    @Basic
    @Column(name = "calificacion")
    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T008UsuarioTemplateEntity that = (T008UsuarioTemplateEntity) o;
        return cdUsuarioTemplate == that.cdUsuarioTemplate && Objects.equals(resuelto, that.resuelto) && Objects.equals(calificacion, that.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdUsuarioTemplate, resuelto, calificacion);
    }
}
