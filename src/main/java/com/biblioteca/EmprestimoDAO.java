package com.biblioteca;

import java.util.List;
import javax.persistence.EntityManager;

public class EmprestimoDAO implements ICRUD<Emprestimo> {
    EntityManager em;

    public EmprestimoDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Emprestimo p) {
        this.em.persist(p);
    }

    @Override
    public List<Emprestimo> readAll() {
        String jpql = "SELECT p FROM Emprestimo p";
        return this.em.createQuery(jpql, Emprestimo.class).getResultList();
    }

    @Override
    public void delete(Emprestimo p) {
        em.merge(p);
        this.em.remove(p);
    }

    @Override
    public void update(Emprestimo p) {
        this.em.merge(p);
    }

    @Override
    public void print(List<Emprestimo> listaEmprestimo) {
        System.out.println("\n\n");
        for (Emprestimo item : listaEmprestimo) {
            System.out.println("nome usuario: " + item.getUsuario().getNome() + " Titulo do livro: "
                    + item.getLivro().getTitulo());
        }
    }

    @Override
    public Emprestimo readId(int id) {
        return this.em.find(Emprestimo.class, id);
    }

    @Override
    public List<Emprestimo> readOthers(String buscarPor, String parametroDeBusca) {
        String jpql = "SELECT p from Emprestimo p WHERE p.xpto = 'ypto'";
        jpql = jpql.replace("xpto", buscarPor);
        jpql = jpql.replace("ypto", parametroDeBusca);
        return this.em.createQuery(jpql, Emprestimo.class).getResultList();
    }
}
