package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T006TemplateEntity;
import com.agilethought.kalahari.repositories.TemplateRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TemplateService implements GenericoService<T006TemplateEntity, String, Integer>{
    @Autowired
    TemplateRepository templateRepository;
    @Override
    public ArrayList<T006TemplateEntity> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(templateRepository);
    }

    @Override
    public String agregar(T006TemplateEntity object) throws Exception {
        return FuncionesRepositorios.agregar(templateRepository, object, object.getCdTemplate());
    }

    @Override
    public String eliminar(Integer id) throws Exception {
        return FuncionesRepositorios.eliminar(templateRepository, id);
    }

    @Override
    public String actualizar(T006TemplateEntity object) throws Exception {
        return FuncionesRepositorios.actualizar(templateRepository, object, object.getCdTemplate());
    }
}
