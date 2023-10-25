CREATE DATABASE sis-biblioteca;
Use sis-biblioteca;

CREATE TABLE livros (
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
 
CREATE TABLE editora (
    cnpj INT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL

);