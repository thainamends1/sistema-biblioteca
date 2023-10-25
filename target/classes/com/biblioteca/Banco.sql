CREATE DATABASE sisbiblioteca;
Use sisbiblioteca;

CREATE TABLE editora (
    cnpj INT PRIMARY KEY NOT NULL,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE usuario(
    cpf INT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    senha INT NOT NULL,
    email VARCHAR(50),
);

CREATE TABLE livro (
    isbn VARCHAR(100) PRIMARY KEY,
    autor VARCHAR(30) NOT NULL,
    edicao INT NOT NULL,
    ano INT NOT NULL,
    disp VARCHAR(1) NOT NULL,
    cnpj_editora INT NOT NULL,
    id_autor INT NOT NULL,
    FOREIGN KEY (id_autor) REFERENCES autor(id),
    FOREIGN KEY (cnpj_editora) REFERENCES editora(cnpj)
);

CREATE TABLE emprestimo(
    id INT AUTO_INCREMENT PRIMARY KEY,
    dataEmp DATE NOT NULL,
    dataDevolucao DATE NOT NULL,
    isbn_livro VARCHAR(100) NOT NULL,
    cpf_usuario INT NOT NULL,
    FOREIGN KEY (isbn_livro) REFERENCES livro(isbn),
    FOREIGN KEY (cpf_usuario) REFERENCES usuario(cpf)
);