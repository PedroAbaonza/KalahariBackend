package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T001TecnologiaEntity;
import com.agilethought.kalahari.repositories.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Service
public class TecnologiaService {

    @Autowired
    TecnologiaRepository tecnologiaRepository;

    /**
     * Obtenemos la lista de todas las tecnologias.
     * @return ArrayList<T001TecnologiaEntity>
     */
    public ArrayList<T001TecnologiaEntity> obtenerTecnologias(){
        return (ArrayList<T001TecnologiaEntity>) tecnologiaRepository.findAll();
    }

    /**
     * Agregamos una tecnologia a la base de datos y regresa un mensaje si se pudo o no agregar.
     * @param t001TecnologiaEntity
     * @return String
     */

    public String agregarTecnologia(T001TecnologiaEntity t001TecnologiaEntity){
        tecnologiaRepository.save(t001TecnologiaEntity);
        if(tecnologiaRepository.existsById(t001TecnologiaEntity.getCdTecnologia()))
            return "Se agregó correctamente";
        else
            return "No se agregó correctamente";
    }

    /**
     * Eliminamos una tecnologia con el Id como parametro y regresa
     * un mensaje si se pudo o no eliminar correctamente
     * @param id
     * @return String
     */
    public  String eliminarTecnologia(String id){

        if(tecnologiaRepository.existsById(id)) {
            tecnologiaRepository.deleteById(id);
            return "Se eliminó correctamente";
        }
        else
            return "No se eliminó correctamente";
    }

    /**
     * Modificamos una tecnologia con su id como parametro y regresa un mensaje
     * si se pudo  no o actualizar correctamente
     * @param t001TecnologiaEntity
     * @param id
     * @return String
     */
    public String actualizarTecnologia(T001TecnologiaEntity t001TecnologiaEntity){

        if(tecnologiaRepository.existsById(t001TecnologiaEntity.getCdTecnologia())){
           tecnologiaRepository.save(t001TecnologiaEntity);
            return "Se actualizo correctamente";
        }
        else
            return "No actualizó correctamente";
    }
}
