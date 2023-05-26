package es.eoi.pruebaSpring.controllers;

import es.eoi.pruebaSpring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Juancho");
        usuario.setApellido("Romero");
        usuario.setEmail("juancho.rom.pal@gmail.com");
        usuario.setTelefono("75932378");

        Usuario usuario2 = new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("Santiago");
        usuario2.setApellido("Tasset");
        usuario2.setEmail("juancho.rom.pal@gmail.com");
        usuario2.setTelefono("75932378");

        Usuario usuario3 = new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("Alba");
        usuario3.setApellido("Valverde");
        usuario3.setEmail("juancho.rom.pal@gmail.com");
        usuario3.setTelefono("75932378");

        Usuario usuario4 = new Usuario();
        usuario4.setId(321L);
        usuario4.setNombre("Alejandro");
        usuario4.setApellido("Saponi");
        usuario4.setEmail("juancho.rom.pal@gmail.com");
        usuario4.setTelefono("75932378");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
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
