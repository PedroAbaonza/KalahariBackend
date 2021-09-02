package com.agilethought.kalahari.domain;

public class ExamenResponse {
	private String usuarioTemplateId;
	private String usuarioId;
	private String usuarioNombre;
	private String grupoId;
	private String grupoNombre;
	private String tecnologiaId;
	private String tecnologiaNombre;
	
	public ExamenResponse() {
		
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioNombre() {
		return usuarioNombre;
	}

	public void setUsuarioNombre(String usuarioNombre) {
		this.usuarioNombre = usuarioNombre;
	}

	public String getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(String grupoId) {
		this.grupoId = grupoId;
	}

	public String getGrupoNombre() {
		return grupoNombre;
	}

	public void setGrupoNombre(String grupoNombre) {
		this.grupoNombre = grupoNombre;
	}

	public String getUsuarioTemplateId() {
		return usuarioTemplateId;
	}

	public void setUsuarioTemplateId(String usuarioTemplateId) {
		this.usuarioTemplateId = usuarioTemplateId;
	}

	public String getTecnologiaId() {
		return tecnologiaId;
	}

	public void setTecnologiaId(String tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
	}

	public String getTecnologiaNombre() {
		return tecnologiaNombre;
	}

	public void setTecnologiaNombre(String tecnologiaNombre) {
		this.tecnologiaNombre = tecnologiaNombre;
	}
}
