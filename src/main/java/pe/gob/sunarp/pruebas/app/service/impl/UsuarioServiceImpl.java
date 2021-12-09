package pe.gob.sunarp.pruebas.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.sunarp.pruebas.app.model.UsuarioModel;
import pe.gob.sunarp.pruebas.app.repository.UsuarioRepository;
import pe.gob.sunarp.pruebas.app.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioModel verUsuario(String username) {
        return null;
    }
}
