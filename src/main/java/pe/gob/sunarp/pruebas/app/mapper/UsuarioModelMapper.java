package pe.gob.sunarp.pruebas.app.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.gob.sunarp.pruebas.app.model.UsuarioModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioModelMapper implements RowMapper<UsuarioModel>{
    @Override
    public UsuarioModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        UsuarioModel u = new UsuarioModel();
        u.setCod_usuario(rs.getInt("id_user_system"));
        u.setNombre_completo(rs.getString("nombre_completo"));
        u.setUsuario_red(rs.getString("username"));
        u.setZona(rs.getString("zona"));
        return u;
    }
}
