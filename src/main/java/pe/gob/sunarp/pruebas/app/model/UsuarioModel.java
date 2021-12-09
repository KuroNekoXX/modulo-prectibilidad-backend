package pe.gob.sunarp.pruebas.app.model;

public class UsuarioModel {
    private Integer cod_usuario;
    private String nombre_completo;
    private String usuario_red;
    private String zona;

    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getUsuario_red() {
        return usuario_red;
    }

    public void setUsuario_red(String usuario_red) {
        this.usuario_red = usuario_red;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
