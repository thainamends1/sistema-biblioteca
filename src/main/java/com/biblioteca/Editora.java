package com.biblioteca;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editora {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cnpj", unique = true, nullable = false)
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

    public void create(EditoraDAO editoraDAO) {
        editoraDAO.em.persist(this);
    }

}
