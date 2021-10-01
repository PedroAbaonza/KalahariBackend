package com.agilethought.kalahari.dto;

public class CandidatosResponse {
    protected int cdCandidato;
    protected String nombreCandidato;
    protected String apellidoPaternoCandidato;
    protected String apellidoMaternoCandidato;
    protected String correoCandidato;
    protected String nombre;
    protected String descripcion;

    public CandidatosResponse(){

    }

    public CandidatosResponse(int cdCandidato, String nombreCandidato, String apellidoPaternoCandidato, String apellidoMaternoCandidato,String correoCandidato, String nombre, String descripcion) {
        this.cdCandidato = cdCandidato;
        this.nombreCandidato = nombreCandidato;
        this.apellidoPaternoCandidato = apellidoPaternoCandidato;
        this.apellidoMaternoCandidato = apellidoMaternoCandidato;
        this.correoCandidato = correoCandidato;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCdCandidato() {
        return cdCandidato;
    }

    public void setCdCandidato(int cdCandidato) {
        this.cdCandidato = cdCandidato;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public String getApellidoPaternoCandidato() {
        return apellidoPaternoCandidato;
    }

    public void setApellidoPaternoCandidato(String apellidoPaternoCandidato) {
        this.apellidoPaternoCandidato = apellidoPaternoCandidato;
    }

    public String getApellidoMaternoCandidato() {
        return apellidoMaternoCandidato;
    }

    public void setApellidoMaternoCandidato(String apellidoMaternoCandidato) {
        this.apellidoMaternoCandidato = apellidoMaternoCandidato;
    }

    public String getCorreoCandidato() {
        return correoCandidato;
    }

    public void setCorreoCandidato(String correoCandidato) {
        this.correoCandidato = correoCandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
