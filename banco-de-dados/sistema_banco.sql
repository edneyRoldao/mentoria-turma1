-- SQL

-- label
SELECT 
	p.nome AS 'nome pessoa',
	p.documento AS 'doc pessoa'
FROM pessoas p;

SELECT * FROM pessoas p;

SELECT * FROM pessoas p WHERE p.nome = 'Maria';

SELECT * FROM pessoas p WHERE p.id = 22;

SELECT * FROM pessoas p WHERE p.id IN (1, 13, 22);

SELECT * FROM pessoas p WHERE p.id BETWEEN 20 AND 30;

-- busca dos nomes que terminam com a letra o
SELECT * FROM pessoas p WHERE p.nome LIKE '%o'

-- busca dos nomes que iniciam com a letra R
SELECT * FROM pessoas p WHERE p.nome LIKE 'R%'

SELECT * FROM pessoas p WHERE p.nome LIKE '%RI%'

SELECT * FROM pessoas w WHERE w.documento IS NULL;

SELECT * FROM eventos_conta ec 
WHERE (ec.operacao = 'SAQUE' AND 
      ec.valor > 100) OR 
(ec.operacao = 'DEPOSITO' AND 
      ec.valor <100)
ORDER BY ec.id ASC; 

-- contando total de contas
SELECT COUNT(c.id) AS 'total contas'
FROM contas c;

SELECT * FROM contas c;

SELECT SUM(c.saldo) FROM contas c 
WHERE c.dt_criacao 
BETWEEN '2025-05-30 00:00:00' AND '2025-05-31 23:59:59';


SELECT MIN(c.saldo) FROM contas c;

SELECT MAX(c.saldo) FROM contas c; 



-- precisamos exibir: 
-- nome cliente, pessoas
-- numero conta, contas
-- operacao, eventos_conta
-- valor, eventos_conta
-- somente depositos

SELECT * FROM contas;
SELECT * FROM pessoas;

SELECT	p.nome,
		c.numero,
		ec.operacao,
		ec.valor
FROM pessoas p INNER JOIN contas c ON (p.id = c.id_pessoa) INNER JOIN eventos_conta ec ON (c.id = ec.id_conta)
WHERE ec.operacao = 'DEPOSITO';


INSERT INTO sistema_banco.pessoas
(nome, dt_nascimento, documento , email)
VALUES('Edney', '1982-05-10', '30040433399', 'edy@mail.com');


SELECT * FROM pessoas p WHERE p.id = 23;
SELECT * FROM contas c where c.id_pessoa = 23;

SELECT	p.nome		AS 'nm_cliente', 
		c.numero	AS 'nr_conta'
FROM pessoas p INNER JOIN contas c ON (p.id = c.id_pessoa)

SELECT	p.nome		AS 'nm_cliente', 
		c.numero	AS 'nr_conta'
FROM pessoas p LEFT JOIN contas c ON (p.id = c.id_pessoa)
