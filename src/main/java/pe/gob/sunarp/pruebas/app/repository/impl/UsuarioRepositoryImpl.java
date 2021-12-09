package pe.gob.sunarp.pruebas.app.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.gob.sunarp.pruebas.app.mapper.UsuarioModelMapper;
import pe.gob.sunarp.pruebas.app.model.UsuarioModel;
import pe.gob.sunarp.pruebas.app.repository.UsuarioRepository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UsuarioModel verUsuario(String username) {
        String sql = "SELECT A.ID_USER_SYSTEM,A.NOMBRE_COMPLETO,A.USERNAME,A.ZONA FROM HELPDESK.MDA_USER_SYSTEM A WHERE A.USERNAME=UPPER(?)";
        UsuarioModel u = new UsuarioModel();
        u = jdbcTemplate.queryForObject(sql,new UsuarioModelMapper(), username);
        return u;
    }
}
