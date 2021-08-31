package com.agilethought.kalahari.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T014_CANDIDATO", schema = "kalahari", catalog = "")
public class T014Candidato {

    private int cdCandidato;
    private String nombreCandidato;
    private String apellidoPaternoCandidato;
    private String apellidoMaternoCandidato;
    private String correoCandidato;
    private int cdGrupo;
    private int cdUniversidad;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdCandidato")

    public int getCdCandidato() {
        return cdCandidato;
    }

    public void setCdCandidato(int cdCandidato) {
        this.cdCandidato = cdCandidato;
    }
    @Basic
    @Column(name = "nombreCandidato")
    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }
    @Basic
    @Column(name = "apellidoPaternoCandidato")
    public String getApellidoPaternoCandidato() {
        return apellidoPaternoCandidato;
    }

    public void setApellidoPaternoCandidato(String apellidoPaternoCandidato) {
        this.apellidoPaternoCandidato = apellidoPaternoCandidato;
    }
    @Basic
    @Column(name = "apellidoMaternoCandidato")
    public String getApellidoMaternoCandidato() {
        return apellidoMaternoCandidato;
    }

    public void setApellidoMaternoCandidato(String apellidoMaternoCandidato) {
        this.apellidoMaternoCandidato = apellidoMaternoCandidato;
    }
    @Basic
    @Column(name = "correoCandidato")
    public String getCorreoCandidato() {
        return correoCandidato;
    }

    public void setCorreoCandidato(String correoCandidato) {
        this.correoCandidato = correoCandidato;
    }
    @Basic
    @Column(name = "cdGrupo")
    public int getCdGrupo() {
        return cdGrupo;
    }

    public void setCdGrupo(int cdGrupo) {
        this.cdGrupo = cdGrupo;
    }
    @Basic
    @Column(name = "cdUniversidad")
    public int getCdUniversidad() {
        return cdUniversidad;
    }

    public void setCdUniversidad(int cdUniversidad) {
        this.cdUniversidad = cdUniversidad;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T014Candidato that = (T014Candidato) o;
        return Objects.equals(cdCandidato, that.cdCandidato) && Objects.equals(nombreCandidato, that.nombreCandidato) && Objects.equals(apellidoPaternoCandidato, that.apellidoPaternoCandidato) && Objects.equals(apellidoMaternoCandidato, that.apellidoMaternoCandidato) && Objects.equals(correoCandidato, that.correoCandidato) && Objects.equals(cdGrupo, that.cdGrupo) && Objects.equals(cdUniversidad, that.cdUniversidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdCandidato, nombreCandidato, apellidoPaternoCandidato, apellidoMaternoCandidato, correoCandidato, cdGrupo, cdUniversidad);
    }

}
