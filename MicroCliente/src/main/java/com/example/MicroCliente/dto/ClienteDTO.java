package com.example.MicroCliente.dto;

import com.example.MicroCliente.model.Comuna;
import com.example.MicroCliente.model.Genero;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ClienteDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotNull(message = "El ID del cliente es obligatorio")
        @Min(value = 1, message = "El ID del cliente debe ser mayor a 0")
        private Integer id_cliente;

        @NotBlank(message = "El nombre es obligatorio")
        @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
        private String nombre;

        @NotBlank(message = "El email es obligatorio")
        @Email(message = "El formato del email no es válido")
        @Size(max = 100, message = "El email no puede superar los 100 caracteres")
        private String email;

        @NotBlank(message = "El teléfono es obligatorio")
        @Size(min = 8, max = 15, message = "El teléfono debe tener entre 8 y 15 caracteres")
        private String telefono;

        @NotNull(message = "La comuna es obligatoria")
        private Comuna comuna;

        @NotBlank(message = "La dirección de envío es obligatoria")
        @Size(min = 5, max = 150, message = "La dirección debe tener entre 5 y 150 caracteres")
        private String direccion_envio;

        @NotNull(message = "El género es obligatorio")
        private Genero genero;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer id_cliente;
        private String nombre;
        private String email;
        private String telefono;
        private Comuna comuna;
        private String direccion_envio;
        private Genero genero;
    }
}