package com.biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ediçao;
    private int ano;
    private char disp;

    public Livro() {

    }

    public Livro(int id, String titulo, String autor, int ediçao, int ano, char disp) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
    }

    public Livro(String titulo, String autor, int ediçao, int ano, char disp) {
        this.titulo = titulo;
        this.autor = autor;
        this.ediçao = ediçao;
        this.ano = ano;
        this.disp = disp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

}
