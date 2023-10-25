package com.biblioteca;

import java.util.List;
import javax.persistence.EntityManager;

public class EditoraDAO implements ICRUD<Editora> {
    EntityManager em;

    public EditoraDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Editora p) {
        this.em.persist(p);
    }

    @Override
    public List<Editora> readAll() {
        String jpql = "SELECT p FROM Editora p";
        return this.em.createQuery(jpql, Editora.class).getResultList();
    }

    @Override
    public void delete(Editora p) {
        em.merge(p);
        this.em.remove(p);
    }

    @Override
    public void update(Editora p) {
        this.em.merge(p);
    }

    @Override
    public void print(List<Editora> listaEditora) {
        System.out.println("\n\n");
        for (Editora item : listaEditora) {
            System.out.println("CNPJ: " + item.getCnpj() + " Nome: " + item.getNome());
        }
    }

    @Override
    public Editora readId(int id) {
        return this.em.find(Editora.class, id);
    }

    @Override
    public List<Editora> readOthers(String buscarPor, String parametroDeBusca) {
        String jpql = "SELECT p from Editora p WHERE p.xpto = 'ypto'";
        jpql = jpql.replace("xpto", buscarPor);
        jpql = jpql.replace("ypto", parametroDeBusca);
        return this.em.createQuery(jpql, Editora.class).getResultList();
    }
}
