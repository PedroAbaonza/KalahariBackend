package com.agilethought.kalahari.models;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "T011_GRUPO", schema = "kalahari", catalog = "")
public class T011GrupoEntity {
	private int cdGrupo;
	private String descripcion;
	private Timestamp fechaAplicacion;
	private List<T000UsuariosEntity> usuarios;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cdGrupo", unique = true, nullable = false)
	public int getCdGrupo() {
		return cdGrupo;
	}

	public void setCdGrupo(int cdGrupo) {
		this.cdGrupo = cdGrupo;
	}

	@Basic
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Basic
	@Column(name = "fechaAplicacion")
	public Timestamp getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(Timestamp fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	@JsonIgnore
	@JsonManagedReference
	@OneToMany(mappedBy = "t011GrupoByGrupo")
	public List<T000UsuariosEntity> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<T000UsuariosEntity> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		T011GrupoEntity that = (T011GrupoEntity) o;
		return cdGrupo == that.cdGrupo && Objects.equals(descripcion, that.descripcion)
				&& Objects.equals(fechaAplicacion, that.fechaAplicacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cdGrupo, descripcion, fechaAplicacion);
	}
}
