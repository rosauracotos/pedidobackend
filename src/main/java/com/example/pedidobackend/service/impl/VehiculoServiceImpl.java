package com.example.pedidobackend.service.impl;

import com.example.pedidobackend.repository.VehiculoRepository;
import com.example.pedidobackend.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;
}
