package com.agilethought.kalahari.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agilethought.kalahari.domain.ExamenRequest;
import com.agilethought.kalahari.domain.ExamenResponse;
import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.services.ExamenService;

@RestController
@RequestMapping(value = "/examen")
public class ExamenController {
	@Autowired
	ExamenService examenService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	public List<ExamenResponse> asignarExamen(@RequestBody ExamenRequest request) {
		return examenService.asignarExamen(request);
	}
}
