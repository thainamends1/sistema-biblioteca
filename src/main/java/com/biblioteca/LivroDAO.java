package com.biblioteca;

import java.util.List;
import javax.persistence.EntityManager;

public class LivroDAO implements ICRUD<Livro> {

    private EntityManager em;

    public LivroDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Livro p) {
        this.em.persist(p);
    }

    @Override
    public List<Livro> readAll() {
        String jpql = "SELECT p FROM Livro p";
        return this.em.createQuery(jpql, Livro.class).getResultList();
    }

    @Override
    public void delete(Livro p) {
        em.merge(p);
        this.em.remove(p);
    }

    @Override
    public void update(Livro p) {
        this.em.merge(p);
    }

    @Override
    public void print(List<Livro> listaLivro) {
        System.out.println("\n\n");
        for (Livro item : listaLivro) {
            System.out.println("id: " + item.getId() + " Nome: " + item.getTitulo());
        }
    }

    @Override
    public Livro readId(int id) {
        return this.em.find(Livro.class, id);
    }

    @Override
    public List<Livro> readOthers(String buscarPor, String parametroDeBusca) {
        String jpql = "SELECT p from Livro p WHERE p.xpto = 'ypto'";
        jpql = jpql.replace("xpto", buscarPor);
        jpql = jpql.replace("ypto", parametroDeBusca);
        return this.em.createQuery(jpql, Livro.class).getResultList();
    }
}
