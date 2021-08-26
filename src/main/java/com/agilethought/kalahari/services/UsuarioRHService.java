package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.T013UsuariosRH;
import com.agilethought.kalahari.repositories.UsuarioRHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRHService {
    @Autowired
    UsuarioRHRepository usuarioRHRepository;
    public ArrayList<T013UsuariosRH> obtenerUsuariosRH() {
        return (ArrayList<T013UsuariosRH>) usuarioRHRepository.findAll();
    }
    public Optional<T013UsuariosRH> obtenerPorId(String id) {
        return usuarioRHRepository.findById(id);
    }
    public String agregarUsuarioRH(T013UsuariosRH usuariosRH) {
        usuarioRHRepository.save(usuariosRH);
    return "Usuario Agregado";
    }
}
