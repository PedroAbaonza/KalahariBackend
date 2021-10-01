package com.agilethought.kalahari.services;

import com.agilethought.kalahari.dto.PreguntaTemplateResponse;
import com.agilethought.kalahari.models.T007TemplatePreguntaEntity;
import com.agilethought.kalahari.repositories.TemplatePreguntaRepository;
import com.agilethought.kalahari.utils.FuncionesRepositorios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemplatePreguntaService implements GenericoService<T007TemplatePreguntaEntity, String, Integer>{
    @Autowired
    TemplatePreguntaRepository templatePreguntaRepository;
    @Override
    public ArrayList<T007TemplatePreguntaEntity> obtnerTodo() throws Exception {
        return FuncionesRepositorios.buscarTodos(templatePreguntaRepository);
    }

    @Override
    public String agregar(T007TemplatePreguntaEntity object) throws Exception {
        return FuncionesRepositorios.agregar(templatePreguntaRepository, object, object.getCdTemplatePregunta());
    }

    @Override
    public String eliminar(Integer id) throws Exception {
        return FuncionesRepositorios.eliminar(templatePreguntaRepository, id);
    }

    @Override
    public String actualizar(T007TemplatePreguntaEntity object) throws Exception {
        return FuncionesRepositorios.actualizar(templatePreguntaRepository, object, object.getCdTemplatePregunta());
    }

    public ArrayList<PreguntaTemplateResponse> getPreguntas(int cd){
        ArrayList<PreguntaTemplateResponse> lista =  templatePreguntaRepository.getPreguntas(cd);
        if(lista.isEmpty())
            lista.add(new PreguntaTemplateResponse(0, "Sin preguntas"));
        return lista;
    }

    public List<?> getPreguntasSinTemplate(int cd){
        return templatePreguntaRepository.getPreguntasSinTemplate(cd);
    }
}
