CREATE DATABASE ecommerce;

USE ecommerce;

-- DROP TABLE produto;

CREATE TABLE produto (
	id INT AUTO_INCREMENT PRIMARY KEY ,
    marca VARCHAR (10) NOT NULL,
    descricao VARCHAR (100),
    preco DEC NOT NULL,
    quantidade INT NOT NULL
);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Bautuco", "Bolacha recheada de chocolate", 3.50, 2600);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Nivea", "Creme para corpo", 15.00, 500);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Garoto", "Barra de chocolate de 500g", 7.00, 1500);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Natura", " Shampoo erva doce 1 litro", 35.50, 400);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Macarao", "Ovos 500g", 3.50, 700);

INSERT INTO produto ( marca, descricao, preco, quantidade) 
VALUES ("Vigor","Yorkut de morando 1 litro", 17.56, 500);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Camil", "Feijão carioca", 7.90, 598);

INSERT INTO produto (marca, descricao, preco, quantidade) 
VALUES ("Arin", "Arroz de 5 kilo", 25.00, 4700);

INSERT INTO produto ( marca, preco, quantidade) 
VALUES ( "Kibom", 18.00, 8000);

SELECT * FROM produto WHERE quantidade > 500.00;

SELECT * FROM produto WHERE quantidade < 500.00;

UPDATE produto SET  preco = 23.00, quantidade = 5000 WHERE id = 17;
