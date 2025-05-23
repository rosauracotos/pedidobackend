package com.example.pedidobackend.service.impl;

import com.example.pedidobackend.repository.UsuarioRepository;
import com.example.pedidobackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

}
