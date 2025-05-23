package com.example.pedidobackend.service.impl;

import com.example.pedidobackend.repository.DetallePedidoRepository;
import com.example.pedidobackend.repository.PedidoRepository;
import com.example.pedidobackend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

}
