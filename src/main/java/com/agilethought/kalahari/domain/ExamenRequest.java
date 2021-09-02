package com.agilethought.kalahari.domain;

import java.util.ArrayList;
import java.util.List;

public class ExamenRequest {
	private String grupoId;
	private String grupoDescripcion;
	private List<Tecnologia> tecnologias;

	public ExamenRequest() {
		this.tecnologias = new ArrayList<ExamenRequest.Tecnologia>();
	}

	public String getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(String grupoId) {
		this.grupoId = grupoId;
	}

	public String getGrupoDescripcion() {
		return grupoDescripcion;
	}

	public void setGrupoDescripcion(String grupoDescripcion) {
		this.grupoDescripcion = grupoDescripcion;
	}

	public List<Tecnologia> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<Tecnologia> tecnologias) {
		this.tecnologias = tecnologias;
	}

	public static class Tecnologia {
		private String tecnologiaId;
		private String tecnologiaDescripcion;

		public Tecnologia() {

		}

		public String getTecnologiaId() {
			return tecnologiaId;
		}

		public void setTecnologiaId(String tecnologiaId) {
			this.tecnologiaId = tecnologiaId;
		}

		public String getTecnologiaDescripcion() {
			return tecnologiaDescripcion;
		}

		public void setTecnologiaDescripcion(String tecnologiaDescripcion) {
			this.tecnologiaDescripcion = tecnologiaDescripcion;
		}
	}
}
