package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.models.T013UsuariosRH;
import com.agilethought.kalahari.repositories.UsuarioRHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
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

    public T013UsuariosRH obtenerPoremail(String email) {
       return usuarioRHRepository.getUsuarioByEmail(email);
    }

    public String aumentoCount(String email) {
        usuarioRHRepository.aumentoCont(email);
        return "intento aumentado";
    }

    public String disableUsuariorh(String email) {
        Date fecha = new Date();
        /*SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        Date dateString = sdf.format(fecha);*/
        System.out.println(fecha);
        usuarioRHRepository.disableUsuario(email, fecha);
        return (email+"  usuario bloqueado");
    }

    public String enableUsuariorh(String email) {
        usuarioRHRepository.enableUsuariorh(email);
        return (email+"  usuario desbloqueado");
    }
}
