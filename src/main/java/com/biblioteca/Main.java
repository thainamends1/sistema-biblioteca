package com.biblioteca;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //Autor autor = new Autor("Daniel Kahneman");
        Editora editora = new Editora(1234, "Penguin-Companhia");
        // Livro livro = new Livro("8582850018", "Memorias Postumas de Bras Cubas", autor, 1, 2014, 's', editora);
        // Usuario usuario = new Usuario(123456789, "Mario", "mariosilva@gmail.com", "1234");
        // Emprestimo emprestimo = new Emprestimo(LocalDate.now(), LocalDate.parse("2023-10-30"), livro, usuario);

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emFactory.createEntityManager();

        //AutorDAO autorDao = new AutorDAO(em);
        EditoraDAO editoraDao = new EditoraDAO(em);
        // LivroDAO livroDao = new LivroDAO(em);
        // UsuarioDAO usuarioDao = new UsuarioDAO(em);
        // EmprestimoDAO emprestimoDao = new EmprestimoDAO(em);

        em.getTransaction().begin();
            //autorDao.create(autor);
            editoraDao.create(editora);
            // livroDao.create(livro);
            // usuarioDao.create(usuario);
            // emprestimoDao.create(emprestimo);
        em.getTransaction().commit();
        em.close();
    }
}