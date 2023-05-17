package com.exampleAuth0.prueba.controller;

import com.exampleAuth0.prueba.controller.BaseControllerImpl.BaseControllerImpl;
import com.exampleAuth0.prueba.entities.Usuario;
import com.exampleAuth0.prueba.services.Implementation.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {
}
