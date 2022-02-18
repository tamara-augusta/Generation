CREATE DATABASE tb_classe;

USE tb_classe;

CREATE TABLE gameonline (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_jogador VARCHAR (10) NOT NULL,
    pontuacao int NOT NULL,
	medalhas int NOT NULL

);


CREATE TABLE tb_personagem (
	id INT AUTO_INCREMENT PRIMARY KEY, 
    nome VARCHAR (30) NOT NULL,
    rg INT (14) NOT NULL,
    cpf INT (14) NOT NULL,
    email VARCHAR (16),
    especialidade VARCHAR (30) NOT NULL,
    fk_gameonline INT,
    FOREIGN KEY (fk_gameonline) REFERENCES gameonline (id)

);

INSERT INTO gameonline (nome_jogador, pontuacao, medalhas)
VALUES ("Wolverine", "2000", "657");

INSERT INTO gameonline (nome_jogador, pontuacao, medalhas)
VALUES ("Vampira", "5000", "809");

INSERT INTO gameonline (nome_jogador, pontuacao, medalhas)
VALUES ("Cinetro", "1500", "280");

INSERT INTO gameonline (nome_jogador, pontuacao, medalhas)
VALUES ("Valdemor", "490", "97");

INSERT INTO gameonline (nome_jogador, pontuacao, medalhas)
VALUES ("Cycyne", "759", " 150");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade, fk_gameonline)
VALUES ("Valquiria Amadeus", 342897648, 57489857624, "valam@gmail.com", "Backend", 2);

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Valquiria Amadeus", 342897648, 57489857624, "valam@gmail.com", "Backend");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Tone Juliano", 784328976, 98569857624, "tone@gmail.com", "Frondend");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Maria Victoria", 342853648, 57484763624, "victoria@gmail.com", "Full Stack");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Julio Tomais", 342463783, 48757463876, "julio@gmail.com", "Desenvolvedor RPA");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Gomes Silva", 456363783, 34678463876, "silva@gmail.com", "DevOps");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Juana Pereira", 784963783, 33680463876, "pereira@gmail.com", "DevOps");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Gomes Silva", 456363783 , 34678463876, "silva@gmail.com", "DevOps");

INSERT INTO tb_personagem ( nome, rg, cpf, email, especialidade)
VALUES ("Douglas Augusto", 469863783, 56788463876, "dogusto@gmail.com", "DevJava");

SELECT * FROM gameonline WHERE pontuacao > 2000.00;

SELECT * FROM gameonline WHERE pontuacao < 2000.00;

SELECT * FROM gameonline WHERE nome_jogador LIKE 'c%';

SELECT nome_jogador, especialidade
FROM tb_personagem 
INNER JOIN gameonline ON tb_personagem.fk_gameonline = gameonline.id;

SELECT * FROM tb_personagem WHERE especialidade = "DevOps";