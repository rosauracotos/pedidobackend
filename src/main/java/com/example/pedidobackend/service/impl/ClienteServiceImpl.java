package com.example.pedidobackend.service.impl;

import com.example.pedidobackend.repository.ClienteRepository;
import com.example.pedidobackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

}
