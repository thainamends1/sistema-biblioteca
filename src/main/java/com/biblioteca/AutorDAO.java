package com.biblioteca;

import java.util.List;
import javax.persistence.EntityManager;

public class AutorDAO implements ICRUD<Autor> {

    private EntityManager em;

    public AutorDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Autor p) {
        this.em.persist(p);
    }

    @Override
    public List<Autor> readAll() {
        String jpql = "SELECT p FROM Autor p";
        return this.em.createQuery(jpql, Autor.class).getResultList();
    }

    @Override
    public void delete(Autor p) {
        em.merge(p);
        this.em.remove(p);
    }

    @Override
    public void update(Autor p) {
        this.em.merge(p);
    }

    @Override
    public void print(List<Autor> listaAutor) {
        System.out.println("\n\n");
        for (Autor item : listaAutor) {
            System.out.println("Id: " + item.getId() + " Nome: " + item.getNome());
        }
    }

    @Override
    public Autor readId(int id) {
        return this.em.find(Autor.class, id);
    }

    @Override
    public List<Autor> readOthers(String buscarPor, String parametroDeBusca) {
        String jpql = "SELECT p from Autor p WHERE p.xpto = 'ypto'";
        jpql = jpql.replace("xpto", buscarPor);
        jpql = jpql.replace("ypto", parametroDeBusca);
        return this.em.createQuery(jpql, Autor.class).getResultList();
    }
}
