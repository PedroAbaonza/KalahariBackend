package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T005_PREGUNTA", schema = "kalahari", catalog = "")
public class T005PreguntaEntity {
    private int cdPregunta;
    private String pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private Byte correcta1;
    private Byte correcta2;
    private Byte correcta3;
    private Byte correcta4;
    private String explicacion;
    private String creador;
    private Timestamp fhCreacion;
    private String autorizador;
    private Timestamp fhAutorizacion;
    private double rate;
    private T001TecnologiaEntity t001TecnologiaByTecnologia;
    private T002NivelEntity t002NivelByNivel;
    private T003IdiomaEntity t003IdiomaByIdioma;
    private T004TipoPreguntaEntity t004TipoPreguntaByTipo;
    //Se agrego este atributo para poder obtener la columna de tiempoRespuesta de la tabla TemplatePregunta
    //private T007TemplatePreguntaEntity t007TemplatePreguntaEntity;
    private List<T007TemplatePreguntaEntity> t007TemplatePreguntaEntity;
    private int status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdPregunta", unique = true, nullable = false)
    public int getCdPregunta() {
        return cdPregunta;
    }

    public void setCdPregunta(int cdPregunta) {
        this.cdPregunta = cdPregunta;
    }

    @Basic
    @Column(name = "pregunta")
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Basic
    @Column(name = "respuesta1")
    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    @Basic
    @Column(name = "respuesta2")
    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    @Basic
    @Column(name = "respuesta3")
    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    @Basic
    @Column(name = "respuesta4")
    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    @Basic
    @Column(name = "correcta1")
    public Byte getCorrecta1() {
        return correcta1;
    }

    public void setCorrecta1(Byte correcta1) {
        this.correcta1 = correcta1;
    }

    @Basic
    @Column(name = "correcta2")
    public Byte getCorrecta2() {
        return correcta2;
    }

    public void setCorrecta2(Byte correcta2) {
        this.correcta2 = correcta2;
    }

    @Basic
    @Column(name = "correcta3")
    public Byte getCorrecta3() {
        return correcta3;
    }

    public void setCorrecta3(Byte correcta3) {
        this.correcta3 = correcta3;
    }

    @Basic
    @Column(name = "correcta4")
    public Byte getCorrecta4() {
        return correcta4;
    }

    public void setCorrecta4(Byte correcta4) {
        this.correcta4 = correcta4;
    }

    @Basic
    @Column(name = "explicacion")
    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    @Basic
    @Column(name = "creador")
    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Basic
    @Column(name = "fhCreacion")
    public Timestamp getFhCreacion() {
        return fhCreacion;
    }

    public void setFhCreacion(Timestamp fhCreacion) {
        this.fhCreacion = fhCreacion;
    }

    @Basic
    @Column(name = "autorizador")
    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    @Basic
    @Column(name = "fhAutorizacion")
    public Timestamp getFhAutorizacion() {
        return fhAutorizacion;
    }

    public void setFhAutorizacion(Timestamp fhAutorizacion) {
        this.fhAutorizacion = fhAutorizacion;
    }

    @Basic
    @Column(name = "rate")
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T005PreguntaEntity that = (T005PreguntaEntity) o;
        return cdPregunta == that.cdPregunta && Double.compare(that.rate, rate) == 0 && Objects.equals(pregunta, that.pregunta) && Objects.equals(respuesta1, that.respuesta1) && Objects.equals(respuesta2, that.respuesta2) && Objects.equals(respuesta3, that.respuesta3) && Objects.equals(respuesta4, that.respuesta4) && Objects.equals(correcta1, that.correcta1) && Objects.equals(correcta2, that.correcta2) && Objects.equals(correcta3, that.correcta3) && Objects.equals(correcta4, that.correcta4) && Objects.equals(explicacion, that.explicacion) && Objects.equals(creador, that.creador) && Objects.equals(fhCreacion, that.fhCreacion) && Objects.equals(autorizador, that.autorizador) && Objects.equals(fhAutorizacion, that.fhAutorizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdPregunta, pregunta, respuesta1, respuesta2, respuesta3, respuesta4, correcta1, correcta2, correcta3, correcta4, explicacion, creador, fhCreacion, autorizador, fhAutorizacion, rate);
    }

    @ManyToOne()
    @JoinColumn(name = "tecnologia", referencedColumnName = "cdTecnologia")
    public T001TecnologiaEntity getT001TecnologiaByTecnologia() {
        return t001TecnologiaByTecnologia;
    }

    public void setT001TecnologiaByTecnologia(T001TecnologiaEntity t001TecnologiaByTecnologia) {
        this.t001TecnologiaByTecnologia = t001TecnologiaByTecnologia;
    }


    @ManyToOne
    @JoinColumn(name = "nivel", referencedColumnName = "cdNivel")
    public T002NivelEntity getT002NivelByNivel() {
        return t002NivelByNivel;
    }

    public void setT002NivelByNivel(T002NivelEntity t002NivelByNivel) {
        this.t002NivelByNivel = t002NivelByNivel;
    }

    @ManyToOne
    @JoinColumn(name = "idioma", referencedColumnName = "cdIdioma")
    public T003IdiomaEntity getT003IdiomaByIdioma() {
        return t003IdiomaByIdioma;
    }

    public void setT003IdiomaByIdioma(T003IdiomaEntity t003IdiomaByIdioma) {
        this.t003IdiomaByIdioma = t003IdiomaByIdioma;
    }

    @ManyToOne
    @JoinColumn(name = "tipo", referencedColumnName = "cdTipoPregunta")
    public T004TipoPreguntaEntity getT004TipoPreguntaByTipo() {
        return t004TipoPreguntaByTipo;
    }

    public void setT004TipoPreguntaByTipo(T004TipoPreguntaEntity t004TipoPreguntaByTipo) {
        this.t004TipoPreguntaByTipo = t004TipoPreguntaByTipo;
    }

    @JsonIgnore
    @OneToMany(targetEntity = T007TemplatePreguntaEntity.class,  mappedBy = "t005PreguntaByCdPregunta")
    public List<T007TemplatePreguntaEntity> getT007TemplatePreguntaEntity() {
        return t007TemplatePreguntaEntity;
    }

    public void setT007TemplatePreguntaEntity(List<T007TemplatePreguntaEntity> t007TemplatePreguntaEntity) {
        this.t007TemplatePreguntaEntity = t007TemplatePreguntaEntity;
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
