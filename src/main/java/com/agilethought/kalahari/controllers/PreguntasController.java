package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.dto.PreguntasResponse;
import com.agilethought.kalahari.models.T005PreguntaEntity;
import com.agilethought.kalahari.services.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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
     * Obtenemos la lista de las preguntas sin asignar a un template
     * @return ArrayList<PreguntasResponse>
     */
    @GetMapping("listaSinAsignar")
    public @ResponseBody ArrayList<PreguntasResponse> obtenerPreguntasSinAsignar(){
        return preguntasService.obtenerPreguntasSinAsignar();
    }

    @GetMapping("obtenerPregunta/{id}")
    public @ResponseBody Optional<T005PreguntaEntity> obtenerPreguntaById(@PathVariable("id") Integer id){
        return preguntasService.obtenerPreguntaById(id);
    }

    /**
     *
     * Agregamos una pregunta a la base de datos y regresa un mensaje si se pudo o no agregar
     * @param t005PreguntaEntity
     * @return T005PreguntaEntity
     */
    @PostMapping("agregar")
    public @ResponseBody T005PreguntaEntity agregarPreguntas(@RequestBody T005PreguntaEntity t005PreguntaEntity){
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
     * @return String
     */
    @PutMapping("actualizar")
    public @ResponseBody String actualizarPregunta(@RequestBody T005PreguntaEntity t005PreguntaEntity){
        return preguntasService.actualizarPregunta(t005PreguntaEntity);
    }
}
