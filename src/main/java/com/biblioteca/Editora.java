package com.biblioteca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editora {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String cnpj;
    private String nome;

     public Editora() {
    }

    public Editora(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }  

    public Editora(int id, String cnpj, String nome) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
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
