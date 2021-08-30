package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.dto.PreguntasResponse;
import com.agilethought.kalahari.models.T005PreguntaEntity;
import com.agilethought.kalahari.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("preguntas")
public class PreguntasController {

    @Autowired
    PreguntasService preguntasService;

    /**
     *
     * Obtenemos la lista de todas las preguntas
     * @return ArrayList<PreguntasResponse>
     */
    @GetMapping("lista")
    public @ResponseBody ArrayList<PreguntasResponse> obtenerPreguntas(){
        return preguntasService.obtenerPreguntas();
    }

    /**
     *
     * Agregamos una pregunta a la base de datos y regresa un mensaje si se pudo o no agregar
     * @param t005PreguntaEntity
     * @return String
     */
    @PostMapping("agregar")
    public @ResponseBody String agregarPreguntas(@RequestBody T005PreguntaEntity t005PreguntaEntity){
        return preguntasService.agregarPregunta(t005PreguntaEntity);
    }

    /**
     * Eliminammos una pregunta de la base de datos y regresa un mensaje si se pudo o no eliminar
     * @param id
     * @return String
     */
    @DeleteMapping("eliminar/{id}")
    public @ResponseBody String eliminarPregunta(@PathVariable("id") int id){
        return  preguntasService.eliminarPregunta(id);
    }

    /**
     * Modificamos una tecnologia con su id como parametro y regresa un mensaje
     * si se pudo  no o actualizar correctamente
     * @param t005PreguntaEntity
     * @param id
     * @return String
     */
    @PutMapping("actualizar")
    public @ResponseBody String actualizarPregunta(@RequestBody T005PreguntaEntity t005PreguntaEntity){
        return preguntasService.actualizarPregunta(t005PreguntaEntity);
    }
}
