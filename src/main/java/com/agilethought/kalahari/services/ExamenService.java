package com.agilethought.kalahari.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilethought.kalahari.domain.ExamenRequest;
import com.agilethought.kalahari.domain.ExamenRequest.Tecnologia;
import com.agilethought.kalahari.domain.ExamenResponse;
import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.models.T008UsuarioTemplateEntity;
import com.agilethought.kalahari.repositories.TemplateRepository;
import com.agilethought.kalahari.repositories.UsuariosRepository;
import com.agilethought.kalahari.repositories.UsuariosTemplateRepository;

@Service
public class ExamenService {
	@Autowired
	TemplateRepository templateRepository;

	@Autowired
	UsuariosRepository usuariosRepository;
	
	@Autowired
	UsuariosTemplateRepository usuariosTemplateRepository;

	public List<ExamenResponse> asignarExamen(ExamenRequest request) {
		List<ExamenResponse> respuesta = new ArrayList<ExamenResponse>();
		List<T006TemplateEntity> tecnologias = new ArrayList<T006TemplateEntity>();
		List<T000UsuariosEntity> usuariosGrupo = usuariosRepository.findByGrupo(Integer.valueOf(request.getGrupoId()));

		for (Tecnologia tecnologia : request.getTecnologias()) {
			Optional<T006TemplateEntity> template = templateRepository
					.findById(Integer.valueOf(tecnologia.getTecnologiaId()));
			if (template.isPresent())
				tecnologias.add(template.get());
		}

		for (T000UsuariosEntity usuario : usuariosGrupo) {
			for (T006TemplateEntity tecnologia : tecnologias) {
				T008UsuarioTemplateEntity entidad = new T008UsuarioTemplateEntity();
				entidad.setT000UsuariosByUsuarioToken(usuario);
				entidad.setT006TemplateByCdTemplate(tecnologia);
				entidad.setCalificacion((double) 0);
				entidad.setResuelto((byte) 0);
				usuariosTemplateRepository.save(entidad);
				
				ExamenResponse tempRespuesta = new ExamenResponse();
				tempRespuesta.setGrupoId(request.getGrupoId());
				tempRespuesta.setGrupoNombre(request.getGrupoDescripcion());
				tempRespuesta.setUsuarioId(usuario.getUsuarioToken());
				tempRespuesta.setUsuarioNombre(usuario.getNombre());
				tempRespuesta.setTecnologiaId(String.valueOf(tecnologia.getCdTemplate()));
				tempRespuesta.setTecnologiaNombre(tecnologia.getNombre());
				tempRespuesta.setUsuarioTemplateId(String.valueOf(entidad.getCdUsuarioTemplate()));
				respuesta.add(tempRespuesta);
			}
			
		}

		return respuesta;
	}

}
