package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/template")
public class TemplateController {

    @Autowired
    TemplateService templateService;

    @GetMapping("")
    public ArrayList<T006TemplateEntity> obtenerTemplate() {
        return templateService.obtenerTemplate();
    }
}
