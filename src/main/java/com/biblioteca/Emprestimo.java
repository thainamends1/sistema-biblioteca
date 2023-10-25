package com.biblioteca;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private LocalDate dataEmp;
    private LocalDate dataDevolucao;
    @ManyToOne
    private Livro isbn_livro;
    @ManyToOne
    private Usuario cpf_usuario;

    public Emprestimo() {
    }

    public Emprestimo(int id, LocalDate dataEmp, LocalDate dataDevolucao, Livro isbn_livro, Usuario cpf_usuario) {
        this.id = id;
        this.dataEmp = dataEmp;
        this.dataDevolucao = dataDevolucao;
        this.isbn_livro = isbn_livro;
        this.cpf_usuario = cpf_usuario;
    }

    public Emprestimo(LocalDate dataEmp, LocalDate dataDevolucao, Livro isbn_livro, Usuario cpf_usuario) {
        this.dataEmp = dataEmp;
        this.dataDevolucao = dataDevolucao;
        this.isbn_livro = isbn_livro;
        this.cpf_usuario = cpf_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(LocalDate dataEmp) {
        this.dataEmp = dataEmp;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getIsbn_livro() {
        return isbn_livro;
    }

    public void setIsbn_livro(Livro isbn_livro) {
        this.isbn_livro = isbn_livro;
    }

    public Usuario getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(Usuario cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

}
