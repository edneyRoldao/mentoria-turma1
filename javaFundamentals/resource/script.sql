CREATE DATABASE mentoria1_db;

USE mentoria1_db;

DROP TABLE IF EXISTS contatos;

CREATE TABLE contatos (
	id 				BIGINT 			NOT NULL AUTO_INCREMENT         ,
	nome 			VARCHAR(100)	NOT NULL				        ,
	tipo            VARCHAR(50)     NOT NULL DEFAULT('TELEFONE')    ,
	valor			VARCHAR(255)	NOT NULL				        ,
	PRIMARY KEY (id)
);

INSERT INTO contatos (id, nome, tipo, valor)
VALUES (1, 'joao', 'TELEFONE', '1198888777');

SELECT  c.id    ,
        c.nome  ,
        c.tipo  ,
        c.valor
FROM contatos c;

UPDATE contatos c
	SET valor = '2199996666',
	SET tipo = 'TELEFONE'
WHERE c.id = 1;

DELETE FROM contatos c
WHERE c.id = 1;