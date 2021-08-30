package com.agilethought.kalahari.utils;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public class FuncionesRepositorios {
    public static <U>ArrayList<U> buscarTodos(CrudRepository<U, Integer> crudRepository) throws Exception{
        return (ArrayList<U>) crudRepository.findAll();
    }
    public static String agregar(CrudRepository crudRepository, Object objectToAdd, Object id) throws Exception{

        if (id != null && crudRepository != null && objectToAdd != null){
            if (!id.toString().isEmpty()){
                if(crudRepository.existsById(id))
                    return Textos.Repositorios.YA_EXISTE;
            }

            crudRepository.save(objectToAdd);
            return Textos.Repositorios.Agregar.EXITO;
        }
        return Textos.DATOS_ERRONEOS;
    }
    public static String actualizar(CrudRepository crudRepository, Object objectToAdd, Object id) throws Exception{

        if (id != null && crudRepository != null && objectToAdd != null){
            if (!id.toString().isEmpty()){
                if(crudRepository.existsById(id)){
                    crudRepository.save(objectToAdd);
                    return Textos.Repositorios.Actualizar.EXITO;
                }
                return Textos.Repositorios.NO_EXISTE;
            }
            return Textos.Repositorios.ID_INCORRECTO;
        }
        return Textos.DATOS_ERRONEOS;
    }
    public static String eliminar(CrudRepository crudRepository, Object id) throws Exception{

        if (id != null && crudRepository != null){
            if (!id.toString().isEmpty()){
                if(crudRepository.existsById(id)){
                    crudRepository.deleteById(id);
                    return crudRepository.existsById(id) ? Textos.Repositorios.Eliminar.NO_EXITO : Textos.Repositorios.Eliminar.EXITO;
                }
                return Textos.Repositorios.NO_EXISTE;
            }
            return Textos.Repositorios.ID_INCORRECTO;
        }
        return Textos.DATOS_ERRONEOS;
    }
}
