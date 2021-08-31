package com.agilethought.kalahari.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static java.sql.Types.NULL;

/**
 *
 * Clase que sirve para recibir todos los parametros utilizados para mostrar la tabla de preguntas
 */
public class PreguntasResponse {

    private int cdPregunta;
    private String pregunta;
    private String nivel;
    private String idioma;
    private String tipo;
    private String tecnologia;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private Byte correcta1;
    private Byte correcta2;
    private Byte correcta3;
    private Byte correcta4;
    private int tiempo;

    public PreguntasResponse(int cdPregunta, String pregunta, String nivel, String idioma, String tipo,
                             String tecnologia, String respuesta1, String respuesta2,
                             String respuesta3, String respuesta4, Byte correcta1,
                             Byte correcta2, Byte correcta3, Byte correcta4, int tiempo) {
        this.cdPregunta = cdPregunta;
        this.pregunta = pregunta;
        this.nivel = nivel;
        this.idioma = idioma;
        this.tipo = tipo;
        this.tecnologia = tecnologia;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.correcta1 = correcta1;
        this.correcta2 = correcta2;
        this.correcta3 = correcta3;
        this.correcta4 = correcta4;
        this.tiempo = tiempo;
        }

    public int getCdPregunta() {
        return cdPregunta;
    }

    public void setCdPregunta(int cdPregunta) {
        this.cdPregunta = cdPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public Byte getCorrecta1() {
        return correcta1;
    }

    public void setCorrecta1(Byte correcta1) {
        this.correcta1 = correcta1;
    }

    public Byte getCorrecta2() {
        return correcta2;
    }

    public void setCorrecta2(Byte correcta2) {
        this.correcta2 = correcta2;
    }

    public Byte getCorrecta3() {
        return correcta3;
    }

    public void setCorrecta3(Byte correcta3) {
        this.correcta3 = correcta3;
    }

    public Byte getCorrecta4() {
        return correcta4;
    }

    public void setCorrecta4(Byte correcta4) {
        this.correcta4 = correcta4;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
