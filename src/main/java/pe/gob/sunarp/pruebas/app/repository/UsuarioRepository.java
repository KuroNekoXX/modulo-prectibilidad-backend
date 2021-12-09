package pe.gob.sunarp.pruebas.app.repository;

import pe.gob.sunarp.pruebas.app.model.UsuarioModel;

public interface UsuarioRepository {
    public UsuarioModel verUsuario(String username);
}
