package com.agilethought.kalahari.dto;

public class PreguntaTemplateResponse {
    private int cdPregunta;
    private String pregunta;

    public PreguntaTemplateResponse(int cdPregunta, String pregunta) {
        this.cdPregunta = cdPregunta;
        this.pregunta = pregunta;
    }

    public int getCdPregunta(){
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
}
