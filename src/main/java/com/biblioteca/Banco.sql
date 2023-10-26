CREATE DATABASE sisbiblioteca;
Use sisbiblioteca;

CREATE TABLE editora (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(12) NOT NULL,
    nome VARCHAR(30) NOT NULL,
    senha INT NOT NULL,
    email VARCHAR(50),
);

CREATE TABLE livro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    isbn VARCHAR(20) NOT NULL,
    autor VARCHAR(30) NOT NULL,
    edicao INT NOT NULL,
    ano INT NOT NULL,
    disp VARCHAR(1) NOT NULL,
    id_editora INT NOT NULL,
    id_autor INT NOT NULL,
    FOREIGN KEY (id_editora) REFERENCES editora(id),
    FOREIGN KEY (id_autor) REFERENCES autor(id)
);

CREATE TABLE emprestimo(
    id INT AUTO_INCREMENT PRIMARY KEY,
    dataEmp DATE NOT NULL,
    dataDevolucao DATE NOT NULL,
    id_usuario INT NOT NULL,
    id_livro INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES livro(id),
    FOREIGN KEY (id_livro) REFERENCES livro(id)
);
