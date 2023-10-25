package com.biblioteca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Machado de Assis");
        Editora editora = new Editora(1234, "Penguin-Companhia");
        Livro livro = new Livro("8582850018", "Memorias Postumas de Bras Cubas", autor, 1, 2014, 's', editora);
        Usuario usuario = new Usuario(123456789, "Mario", "mariosilva@gmail.com", "1234");
        
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emFactory.createEntityManager();

        AutorDAO autorDao = new AutorDAO(em);
        EditoraDAO editoraDAO = new EditoraDAO(em);
        LivroDAO livroDao = new LivroDAO(em);

    }
}