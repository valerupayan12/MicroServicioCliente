package com.example.MicroCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroCliente.model.Comuna;
import com.example.MicroCliente.repository.ComunaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ComunaService {

    @Autowired
    // SE LLAMA AL REPOSITORIO PARA PODER USAR SUS FUNCIONES
    private ComunaRepository comunaRepository;

    // OBTENER COMUNAS
    public List<Comuna> getComunas() {
        return comunaRepository.obtenerComunas();
    }

    // OBTENER COMUNA POR ID
    public Comuna getComunaById(int id_comuna) {

        Comuna comuna = comunaRepository.buscarComuna(id_comuna);

        if (comuna != null) {
            return comuna;
        } else {
            return new Comuna();
        }
    }

    // CREAR COMUNA
    public Comuna saveComuna(Comuna comuna) {
        return comunaRepository.save(comuna);
    }

    // ACTUALIZAR COMUNA
    public int updateComuna(Comuna comuna) {

        comunaRepository.save(comuna);

        return 1;
    }

    // ELIMINAR COMUNA
    public int deleteComuna(int id_comuna) {

        Comuna comuna = getComunaById(id_comuna);

        if (comuna != null) {
            comunaRepository.delete(comuna);
            return 1;
        } else {
            return 0;
        }
    }
}
