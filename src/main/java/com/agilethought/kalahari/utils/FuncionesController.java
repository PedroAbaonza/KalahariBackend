package com.agilethought.kalahari.utils;

import com.agilethought.kalahari.models.T003IdiomaEntity;
import com.agilethought.kalahari.services.GenericoService;

import java.util.ArrayList;

public class FuncionesController {

    public static <U> ArrayList<U> obtnerTodo(GenericoService genericoService) {
        try {
            return genericoService.obtnerTodo();
        } catch (Exception e) {
            return null;
        }
    }
    public static <U, V, W> V agregar(GenericoService<U, V, W> genericoService, U object, V messageCath) {
        try {
            return genericoService.agregar(object);
        } catch (Exception e) {
            return (V) (messageCath.toString() + ", e: "+ e.getMessage());
            //return messageCath;
        }
    }

    public static <U, V, W> V eliminar(GenericoService<U, V, W> genericoService, W id, V messageCath) {
        try {
            return genericoService.eliminar(id);
        } catch (Exception e) {
            return messageCath;
        }
    }

    public static <U, V, W> V actualizar(GenericoService<U, V, W> genericoService, U object, V messageCath) {
        try {
            return genericoService.actualizar(object);
        } catch (Exception e) {
            return messageCath;
        }
    }
}
