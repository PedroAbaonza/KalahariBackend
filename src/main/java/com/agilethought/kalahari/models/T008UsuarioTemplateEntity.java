package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T008_USUARIO_TEMPLATE", schema = "kalahari", catalog = "")
public class T008UsuarioTemplateEntity {
    private int cdUsuarioTemplate;
    private Byte resuelto;
    private Double calificacion;
    private T000UsuariosEntity t000UsuariosByUsuarioToken;
    private T006TemplateEntity t006TemplateByCdTemplate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdUsuarioTemplate", unique = true, nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "usuarioToken", referencedColumnName = "usuarioToken")
    public T000UsuariosEntity getT000UsuariosByUsuarioToken() {
        return t000UsuariosByUsuarioToken;
    }

    public void setT000UsuariosByUsuarioToken(T000UsuariosEntity t000UsuariosByUsuarioToken) {
        this.t000UsuariosByUsuarioToken = t000UsuariosByUsuarioToken;
    }

    @ManyToOne
    @JoinColumn(name = "cdTemplate", referencedColumnName = "cdTemplate")
    public T006TemplateEntity getT006TemplateByCdTemplate() {
        return t006TemplateByCdTemplate;
    }

    public void setT006TemplateByCdTemplate(T006TemplateEntity t006TemplateByCdTemplate) {
        this.t006TemplateByCdTemplate = t006TemplateByCdTemplate;
    }
}
