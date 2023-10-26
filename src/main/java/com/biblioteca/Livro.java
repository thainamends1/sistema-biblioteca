package com.biblioteca;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String isbn;
    private String titulo;
    private int ediçao;
    private int ano;
    private char disp;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editora editora;
    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> listaEmprestimo;

    public Livro() {
    }

    public Livro(String isbn, String titulo, int ediçao, int ano, char disp, Autor autor, Editora editora,
            List<Emprestimo> listaEmprestimo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
        this.autor = autor;
        this.editora = editora;
        this.listaEmprestimo = listaEmprestimo;
    }

    public Livro(int id, String isbn, String titulo, int ediçao, int ano, char disp, Autor autor, Editora editora,
            List<Emprestimo> listaEmprestimo) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
        this.autor = autor;
        this.editora = editora;
        this.listaEmprestimo = listaEmprestimo;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdiçao() {
        return ediçao;
    }

    public void setEdiçao(int ediçao) {
        this.ediçao = ediçao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getDisp() {
        return disp;
    }

    public void setDisp(char disp) {
        this.disp = disp;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Emprestimo> getListaEmprestimo() {
        return listaEmprestimo;
    }

    public void setListaEmprestimo(List<Emprestimo> listaEmprestimo) {
        this.listaEmprestimo = listaEmprestimo;
    }

    
}
