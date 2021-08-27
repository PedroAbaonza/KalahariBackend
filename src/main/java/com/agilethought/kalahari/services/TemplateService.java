package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.repositories.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TemplateService {

    @Autowired
    TemplateRepository templateRepository;

    public ArrayList<T006TemplateEntity> obtenerTemplate() {
        return (ArrayList<T006TemplateEntity>) templateRepository.findAll();
    }
}
