package com.agilethought.kalahari.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Emtodos que debe tener cada cotroler que implemente esta interface
 * @param <U> el tipo de request que oucpara (clases Entity) y en el caso de obtnerdatos() regresa la lista de este objeto
 * @param <V> Por lo general todas son de tipo string y es un mensaje que regresa
 * @param <W> Cundo se requiere un id, y no se sabe de que tipo puede ser
 */
public interface GenericoController <U, V, W> {
    @GetMapping("lista")
    @ResponseBody ArrayList<U> obtnerTodo();
    @PostMapping("agregar")
    @ResponseBody V agregar(@RequestBody U object);
    @DeleteMapping("eliminar/{id}")
    @ResponseBody V eliminar(@PathVariable("id") W id);
    @PutMapping("actualizar")
    @ResponseBody V actualizar(@RequestBody U object);

}
