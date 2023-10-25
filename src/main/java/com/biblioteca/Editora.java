package com.biblioteca;

public class Editora {
    private int cnpj;
    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    public Editora(int cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public Editora() {

    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
