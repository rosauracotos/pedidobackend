package com.example.pedidobackend.service;

import com.example.pedidobackend.entity.Operario;
import com.example.pedidobackend.util.RespuestaControlador;
import com.example.pedidobackend.util.dto.OperarioBusquedaRequestDTO;
import com.example.pedidobackend.util.dto.OperarioBusquedaResponseDTO;

public interface OperarioService {

    RespuestaControlador guardar (Operario operario);

    RespuestaControlador actualizar(Operario operario);

    RespuestaControlador eliminar(Long id);

    Operario getById(Long id);

    OperarioBusquedaResponseDTO busquedaPaginada(OperarioBusquedaRequestDTO dto);

}
