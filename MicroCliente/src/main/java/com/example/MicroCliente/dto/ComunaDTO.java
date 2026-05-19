package com.example.MicroCliente.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ComunaDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

    @NotNull(message = "El ID de la comuna es obligatorio")
    @Min(value = 1, message = "El ID de la comuna debe ser mayor a 0")
    private Integer id_comuna;

    @NotBlank(message = "El nombre de la comuna es obligatorio")
    @Size(min = 3, max = 100, message = "El nombre de la comuna debe tener entre 3 y 100 caracteres")
    private String nombre;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Integer id_comuna;
        private String nombre;
    }
}