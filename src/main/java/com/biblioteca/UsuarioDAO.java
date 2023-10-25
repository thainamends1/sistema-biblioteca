package com.biblioteca;

import java.util.List;
import javax.persistence.EntityManager;

public class UsuarioDAO implements ICRUD<Usuario> {

    private EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Usuario p) {
        this.em.persist(p);
    }

    @Override
    public List<Usuario> readAll() {
        String jpql = "SELECT p FROM Usuario p";
        return this.em.createQuery(jpql, Usuario.class).getResultList();
    }

    @Override
    public void delete(Usuario p) {
        em.merge(p);
        this.em.remove(p);
    }

    @Override
    public void update(Usuario p) {
        this.em.merge(p);
    }

    @Override
    public void print(List<Usuario> listaUsuario) {
        System.out.println("\n\n");
        for (Usuario item : listaUsuario) {
            System.out.println("id: " + item.getCpf() + " Nome: " + item.getNome());
        }
    }

    @Override
    public Usuario readId(int id) {
        return this.em.find(Usuario.class, id);
    }

    @Override
    public List<Usuario> readOthers(String buscarPor, String parametroDeBusca) {
        String jpql = "SELECT p from Usuario p WHERE p.xpto = 'ypto'";
        jpql = jpql.replace("xpto", buscarPor);
        jpql = jpql.replace("ypto", parametroDeBusca);
        return this.em.createQuery(jpql, Usuario.class).getResultList();
    }
}