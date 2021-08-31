package com.agilethought.kalahari.controllers;


import com.agilethought.kalahari.models.T013UsuariosRH;
import com.agilethought.kalahari.services.UsuarioRHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuariosrh")
public class UsuariosRHController {
    @Autowired
    UsuarioRHService usuarioRHService;
    @GetMapping
    public ArrayList<T013UsuariosRH> obtenerUsuariosRH() {
        return usuarioRHService.obtenerUsuariosRH();
    }
    @GetMapping("/{id}")
    public Optional<T013UsuariosRH> obtenerUsuariosRHid(@PathVariable String id) {
        return usuarioRHService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public String agregarUsuario(@RequestBody T013UsuariosRH t013UsuariosRH){
        return usuarioRHService.agregarUsuarioRH(t013UsuariosRH);
    }
}
