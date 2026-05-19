package com.example.MicroCliente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.MicroCliente.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

    @Query("SELECT g FROM Genero g")
    List<Genero> obtenerGenero();

    @Query("SELECT g FROM Genero g WHERE g.id_genero = :id_genero")
    Genero obtenerGeneroPorId(int id_genero);
}
