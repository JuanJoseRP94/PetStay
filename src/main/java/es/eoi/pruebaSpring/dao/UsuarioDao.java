package es.eoi.pruebaSpring.dao;

import es.eoi.pruebaSpring.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();
}
