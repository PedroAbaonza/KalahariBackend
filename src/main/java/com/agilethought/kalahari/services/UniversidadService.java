package com.agilethought.kalahari.services;

import com.agilethought.kalahari.models.T010UniversidadEntity;
import com.agilethought.kalahari.models.T011GrupoEntity;
import com.agilethought.kalahari.repositories.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UniversidadService {
    @Autowired
    UniversidadRepository universidadRepository;

    public ArrayList<T010UniversidadEntity> obtenerUniversidades() {

        return (ArrayList<T010UniversidadEntity>) universidadRepository.findAll();
    }

    public Optional<T010UniversidadEntity> obtenerPorIdUniversidad(Integer id) {

        return universidadRepository.findById(id);
    }

    public T010UniversidadEntity guardarUniversidad(T010UniversidadEntity universidad) {

        return universidadRepository.save(universidad);
    }

    public boolean eliminarUniversidadPorId(Integer cdUniversidad) {

        if (universidadRepository.existsById(cdUniversidad)) {
            universidadRepository.deleteById(cdUniversidad);
            return !universidadRepository.existsById(cdUniversidad);
        } else {
            return false;
        }
    }


}
