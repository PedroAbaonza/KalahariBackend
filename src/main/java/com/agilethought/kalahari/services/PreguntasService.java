package com.agilethought.kalahari.services;

import com.agilethought.kalahari.dto.PreguntasResponse;
import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.models.T005PreguntaEntity;
import com.agilethought.kalahari.repositories.PreguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PreguntasService {

    @Autowired
    PreguntasRepository preguntasRepository;

    /**
     *
     * Servicio para obtener la lista de preguntas
     * @return ArrayList<PreguntasResponse>
     */
    public ArrayList<PreguntasResponse> obtenerPreguntas(){
        ArrayList<PreguntasResponse> lista = new ArrayList<>();
        lista = preguntasRepository.listaPreguntas();
        return lista;
    }

    /**
     * Servicio para agregar una pregunta y regresa un mensaje si se pudo o no agregar
     * @param t005PreguntaEntity
     * @return String
     */
    public String agregarPregunta(T005PreguntaEntity t005PreguntaEntity) {

        Date fecha = new Date();
        t005PreguntaEntity.setFhCreacion(new Timestamp(fecha.getTime()));
        preguntasRepository.save(t005PreguntaEntity);
        if(preguntasRepository.existsById(t005PreguntaEntity.getCdPregunta()))
            return "Se agregó correctamente con el id: " + t005PreguntaEntity.getCdPregunta();
        else
            return "No se agregó correctamente";
    }

    /**
     *Servicio para eliminar una pregunta de la base de datos y regresa
     * un mensaje si se pudo o no eliminar correctamente
     * @param id
     * @return String
     */
    public String eliminarPregunta(int id){
        if (preguntasRepository.existsById(id)){
            preguntasRepository.deleteById(id);
            return "Se eliminó correctamente";
        }
        else
            return "No se eliminó correctamente";
    }

    /**
     * Servicio para modificar una tecnologia con su id como parametro y regresa un mensaje
     * si se pudo  no o actualizar correctamente
     * @param t005PreguntaEntity
     * @param id
     * @return
     */
    public String actualizarPregunta(T005PreguntaEntity t005PreguntaEntity, int id){
        if (preguntasRepository.existsById(id)){
            Date fecha = new Date();
            t005PreguntaEntity.setFhCreacion(new Timestamp(fecha.getTime()));
            t005PreguntaEntity.setCdPregunta(id);
            preguntasRepository.save(t005PreguntaEntity);
            return "Se actualizó correctamente";
        }
        else
            return "No se actualizó correctamente";
    }
}
