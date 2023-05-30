package es.eoi.pruebaSpring.controllers;

import es.eoi.pruebaSpring.dao.UsuarioDao;
import es.eoi.pruebaSpring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Juancho");
        usuario.setApellido("Romero");
        usuario.setEmail("juancho.rom.pal@gmail.com");
        usuario.setTelefono("75932378");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "usuario453545")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juancho");
        usuario.setApellido("Romero");
        usuario.setEmail("juancho.rom.pal@gmail.com");
        usuario.setTelefono("75932378");
        return usuario;
    }
    @RequestMapping(value = "usuario45353")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juancho");
        usuario.setApellido("Romero");
        usuario.setEmail("juancho.rom.pal@gmail.com");
        usuario.setTelefono("75932378");
        return usuario;
    }
    @RequestMapping(value = "usuario453543")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juancho");
        usuario.setApellido("Romero");
        usuario.setEmail("juancho.rom.pal@gmail.com");
        usuario.setTelefono("75932378");
        return usuario;
    }
}
