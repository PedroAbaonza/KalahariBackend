package com.agilethought.kalahari.controllers;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.repositories.UsuarioRepository;
import com.agilethought.kalahari.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("")
    public ArrayList<T000UsuariosEntity> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }
}
