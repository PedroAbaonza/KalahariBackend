package com.agilethought.kalahari.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "V004_EXAMEN_POR_GRUPO", schema = "kalahari", catalog = "")
public class V004ExamenPorTecnologiaEntity {
    @Id
    private String nombre;
    private String Grupo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaAplicacion;
    private String Nombre_Examen;
    private BigDecimal calificacion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getNombre_Examen() {
        return Nombre_Examen;
    }

    public void setNombre_Examen(String nombre_Examen) {
        Nombre_Examen = nombre_Examen;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }
}

