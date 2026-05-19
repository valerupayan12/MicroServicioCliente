package com.example.MicroCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroCliente.model.Genero;
import com.example.MicroCliente.repository.GeneroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GeneroService {

    @Autowired
    // LLAMA AL REPOSITORY
    private GeneroRepository generoRepository;

    // OBTENER TODOS
    public List<Genero> getGenero() {
        return generoRepository.obtenerGenero();
    }

    // OBTENER POR ID
    public Genero getGenero(int id_genero) {

        Genero genero = generoRepository.obtenerGeneroPorId(id_genero);

        if (genero != null) {
            return genero;
        } else {
            return new Genero();
        }
    }

    // ELIMINAR POR ID
    public int deleteGenero(int id_genero) {
        return generoRepository.eliminarGenero(id_genero);
    }

    // GUARDAR GENERO
    public Genero saveGenero(Genero genero) {
        return generoRepository.guardarGenero(genero);
    }

    // MODIFICAR GENERO
    public int updateGenero(Genero genero) {
        return generoRepository.modificarGenero(genero);
    }
}
