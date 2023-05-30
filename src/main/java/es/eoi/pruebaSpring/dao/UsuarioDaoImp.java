package es.eoi.pruebaSpring.dao;

import es.eoi.pruebaSpring.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }
}
