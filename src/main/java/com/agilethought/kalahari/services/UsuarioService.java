package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<T000UsuariosEntity> obtenerUsuarios() {
        return (ArrayList<T000UsuariosEntity>) usuarioRepository.findAll();
    }
}
