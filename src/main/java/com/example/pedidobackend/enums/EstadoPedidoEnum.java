package com.example.pedidobackend.enums;

import lombok.Getter;

@Getter
public enum EstadoPedidoEnum {

    PENDIENTE(1L, "PENDIENTE"),
    EN_PROCESO(2L, "EN PROCESO"),
    FINALIZADO(3L, "FINALIZADO"),
    ANULADO(4L, "ANULADO");

    private Long id;
    private String nombre;

    EstadoPedidoEnum(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
