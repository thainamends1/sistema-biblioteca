package com.biblioteca;

import javax.persistence.Table;

@Table(name = "livros")
public class Livro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int ediçao;
    private int ano;
    private char disp;
    private Editora editora;

    public Livro() {
    }

    public Livro(String isbn, String titulo, Autor autor, int ediçao, int ano, char disp, Editora editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
        this.editora = editora;
    }

    public Livro(String titulo, Autor autor, int ediçao, int ano, char disp, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
        this.editora = editora;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
