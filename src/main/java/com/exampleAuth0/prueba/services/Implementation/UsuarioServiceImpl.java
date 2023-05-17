package com.exampleAuth0.prueba.services.Implementation;

import com.exampleAuth0.prueba.entities.Usuario;
import com.exampleAuth0.prueba.repositories.BaseRepository;
import com.exampleAuth0.prueba.repositories.UsuarioRepository;
import com.exampleAuth0.prueba.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
