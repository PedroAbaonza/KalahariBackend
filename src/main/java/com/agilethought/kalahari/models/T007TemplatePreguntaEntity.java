package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T007_TEMPLATE_PREGUNTA", schema = "kalahari", catalog = "")
public class T007TemplatePreguntaEntity {
    private int cdTemplatePregunta;
    private Integer tiempoRespuesta;
    private T006TemplateEntity t006TemplateByCdTemplate;
    private T005PreguntaEntity t005PreguntaByCdPregunta;
    private int status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdTemplatePregunta", unique = true, nullable = false)
    public int getCdTemplatePregunta() {
        return cdTemplatePregunta;
    }

    public void setCdTemplatePregunta(int cdTemplatePregunta) {
        this.cdTemplatePregunta = cdTemplatePregunta;
    }

    @Basic
    @Column(name = "tiempoRespuesta")
    public Integer getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(Integer tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T007TemplatePreguntaEntity that = (T007TemplatePreguntaEntity) o;
        return cdTemplatePregunta == that.cdTemplatePregunta && Objects.equals(tiempoRespuesta, that.tiempoRespuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdTemplatePregunta, tiempoRespuesta);
    }

    @ManyToOne
    @JoinColumn(name = "cdTemplate", referencedColumnName = "cdTemplate", nullable = false)
    public T006TemplateEntity getT006TemplateByCdTemplate() {
        return t006TemplateByCdTemplate;
    }

    public void setT006TemplateByCdTemplate(T006TemplateEntity t006TemplateByCdTemplate) {
        this.t006TemplateByCdTemplate = t006TemplateByCdTemplate;
    }

    @ManyToOne
    @JoinColumn(name = "cdPregunta", referencedColumnName = "cdPregunta")
    public T005PreguntaEntity getT005PreguntaByCdPregunta() {
        return t005PreguntaByCdPregunta;
    }

    public void setT005PreguntaByCdPregunta(T005PreguntaEntity t005PreguntaByCdPregunta) {
        this.t005PreguntaByCdPregunta = t005PreguntaByCdPregunta;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
