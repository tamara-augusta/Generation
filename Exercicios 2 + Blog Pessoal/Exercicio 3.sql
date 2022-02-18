-- MySQL Script generated by MySQL Workbench
-- Wed Feb 16 21:11:07 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_farmacia_do_bem,
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_farmacia_do_bem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_farmacia_do_bem,` DEFAULT CHARACTER SET utf8 ;
USE `db_farmacia_do_bem,` ;

-- -----------------------------------------------------
-- Table `db_farmacia_do_bem`.`tb_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_farmacia_do_bem,`.`tb_produto` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `cliente` VARCHAR(255) NOT NULL,
  `produto` VARCHAR(255) NOT NULL,
  `valor` INT NOT NULL,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;

 DROP TABLE `db_farmacia_do_bem,`.`tb_produto`;
-- -----------------------------------------------------
-- Table `db_farmacia_do_bem`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_farmacia_do_bem,`.`tb_categoria` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `funcionario` VARCHAR(255) NOT NULL,
  `farmacia` VARCHAR(255) NULL,
  `fabricante` VARCHAR(255),
  `comida` VARCHAR(255),
  `desconto` INT,
  `tb_produto_id` BIGINT,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_categoria_tb_produto_idx` (`tb_produto_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_categoria_tb_produto`
    FOREIGN KEY (`tb_produto_id`)
    REFERENCES `db_farmacia_do_bem,`.`tb_produto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

drop table `db_farmacia_do_bem,`.`tb_categoria`;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



INSERT INTO tb_produto (cliente, produto, valor)
VALUES ("Josefa", "esmalte", 9.00 );

INSERT INTO tb_produto (cliente, produto, valor)
VALUES ("JoaoP", "parecetamol", 2.00 );

INSERT INTO tb_produto (cliente, produto, valor)
VALUES ("Pamela", "advil", 4.00 );

INSERT INTO tb_produto (cliente, produto, valor)
VALUES ("Giuliane", "chocolate", 5.00 );

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Fabi", "Não", "Nestle", "Leite infantil", 14.00, 2);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Gulio", "Sim", "Jonhson", "Dipirina", 0, 3);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Claudio", "Sim", "Jonhson", "Frauda", 2.00, 4);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Roberto", "Não", "Nestle", "Chocolate", 0.00, 2);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Maria", "Não", "Bautuco", "Bolacha", 0.00, 4);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("José", "Sim", "Nao identificado", "Advil", 1.00, 4);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Francisco", "Sim", "Não identificado", "Dipirina", 1.00, 2);

INSERT INTO tb_categoria (funcionario, farmacia, fabricante, comida, desconto, tb_produto_id)
VALUES ("Fabi", "Sim", "Nestle", "Leite desnatado", 8.00, 4);

SELECT * FROM tb_produto WHERE valor > 50.00;

SELECT * FROM tb_produto WHERE valor between 6.00 and 60.00;

SELECT * FROM tb_categoria WHERE funcionario LIKE 'f%';

SELECT 
	*
FROM 
	tb_produto
	INNER JOIN tb_categoria 
		ON tb_produto.id = tb_categoria.tb_produto_id;

SELECT * FROM tb_categoria WHERE desconto = "6.00";

