package com.example.MicroCliente.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GeneroDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

    @NotNull(message = "El ID del género es obligatorio")
    @Min(value = 1, message = "El ID del género debe ser mayor a 0")
    private Integer id_genero;

    @NotBlank(message = "El nombre del género es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre del género debe tener entre 3 y 50 caracteres")
    private String nombre_genero;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Integer id;
        private String descripcion;
    }
}
