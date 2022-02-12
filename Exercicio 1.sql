CREATE DATABASE rh;

USE rh;

-- DROP TABLE funcionarios;

CREATE TABLE funcionarios (
	id INT AUTO_INCREMENT PRIMARY KEY , 
    nome VARCHAR(70) NOT NULL,
    salario DEC NOT NULL,
    email VARCHAR (70),
    telefone VARCHAR(11)
);

INSERT INTO funcionarios (nome, salario, email, telefone) 
VALUES ("Maria Josefa", 2100.00, "maria.j@gmail.com","11987886637");

INSERT INTO funcionarios (nome, salario, email, telefone) 
VALUES ("Fabio Pires", 15000.00, "fabiopoires@gmail.com","11976879637");

INSERT INTO funcionarios (nome, salario, email, telefone) 
VALUES ("Henzo Kimbol", 3500.00, "kimboll@gmail.com","11996786609");

INSERT INTO funcionarios (nome, salario, email, telefone) 
VALUES ("Sariana Guler", 150000.00, "guler@gmail.com","11934567890");

INSERT INTO funcionarios (nome, salario) 
VALUES ("Juliano Martins", 1500.00);

INSERT INTO funcionarios (nome, salario) 
VALUES ("Briana Valeus", 5000.00);

SELECT * FROM funcionarios WHERE salario > 2000.00;

SELECT * FROM funcionarios WHERE salario < 2000.00;

UPDATE funcionarios SET email = "martins@gmail.com", telefone = "11998487743" WHERE id = 5;