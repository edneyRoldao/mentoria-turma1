DROP DATABASE sistema_banco;
CREATE DATABASE sistema_banco;

USE sistema_banco;

DROP TABLE IF EXISTS eventos_conta;
DROP TABLE IF EXISTS contas;
DROP TABLE IF EXISTS pessoas;

CREATE TABLE pessoas (
	id 				BIGINT 			NOT NULL AUTO_INCREMENT	,
	nome 			VARCHAR(100)	NOT NULL				,
	dt_nascimento	DATE 			NOT NULL				,
	documento 		VARCHAR(11) 	NOT NULL				,
	endereco		VARCHAR(255)	NOT NULL				,
	dt_criacao 		TIMESTAMP 		NOT NULL DEFAULT NOW()	,
	email			VARCHAR(255) 	NOT NULL UNIQUE			,
	PRIMARY KEY (id)										,
	INDEX documento_idx (documento ASC)
);

CREATE TABLE contas (
	id 				BIGINT 			NOT NULL AUTO_INCREMENT	,
	numero			BIGINT 			NOT NULL  UNIQUE		,
	saldo			DECIMAL(14,2)	NOT NULL DEFAULT 0		,
	dt_criacao 		TIMESTAMP 		NOT NULL DEFAULT NOW()	,
	id_pessoa		BIGINT 			NOT NULL				,
	PRIMARY KEY (id)										,
	CONSTRAINT fk_contas_pessoas FOREIGN KEY (id_pessoa) REFERENCES pessoas(id)
);

CREATE TABLE eventos_conta (
	id 				BIGINT 										NOT NULL AUTO_INCREMENT	,
	operacao        ENUM ('SAQUE', 'DEPOSITO', 'TRANSFERENCIA')	NOT NULL				,
	dt_criacao 		TIMESTAMP 									NOT NULL DEFAULT NOW()	,
	id_conta		BIGINT										NOT NULL				,
	PRIMARY KEY (id)																	,
	CONSTRAINT fk_eventos_conta_contas FOREIGN KEY (id_conta) REFERENCES contas(id)
);

-- DDL
ALTER TABLE pessoas DROP COLUMN endereco;
ALTER TABLE pessoas ADD CONSTRAINT UNIQUE(documento);
ALTER TABLE contas MODIFY saldo DECIMAL(15,2);
ALTER TABLE eventos_conta ADD COLUMN valor DECIMAL(11,2);
