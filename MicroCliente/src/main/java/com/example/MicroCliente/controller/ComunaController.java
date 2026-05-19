package com.example.MicroCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroCliente.model.Comuna;
import com.example.MicroCliente.service.ComunaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/comunas")
public class ComunaController {

    @Autowired
    private ComunaService comunaService;

    @GetMapping
    public List<Comuna> listarComunas() {
        return comunaService.getComunas();
    }

    // AGREGAR
    @PostMapping
    public Comuna agregarComuna(@Valid @RequestBody Comuna comuna) {

        return comunaService.saveComuna(comuna);
    }

    // BUSCAR
    @GetMapping("{id_comuna}")
    public Comuna buscarComuna(@PathVariable int id_comuna) {

        return comunaService.getComunaById(id_comuna);
    }

    // ACTUALIZAR
    @PutMapping("{id_comuna}")
    public int actualizarComuna(@PathVariable int id_comuna,
                                @Valid @RequestBody Comuna comuna) {

        comuna.setId_comuna(id_comuna);

        return comunaService.updateComuna(comuna);
    }

    // ELIMINAR
    @DeleteMapping("{id_comuna}")
    public String eliminarComuna(@PathVariable int id_comuna) {

        if (comunaService.deleteComuna(id_comuna) == 1) {
            return "Comuna eliminada correctamente";
        }

        return "Error al eliminar la comuna";
    }
}
