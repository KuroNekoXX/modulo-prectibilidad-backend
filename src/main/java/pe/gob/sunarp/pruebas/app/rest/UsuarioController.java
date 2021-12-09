package pe.gob.sunarp.pruebas.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.sunarp.pruebas.app.model.UsuarioModel;
import pe.gob.sunarp.pruebas.app.service.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "verUsuario", method = RequestMethod.GET)
    public UsuarioModel verUsuario(@RequestParam String username) {
        return usuarioService.verUsuario(username);
    }
}
