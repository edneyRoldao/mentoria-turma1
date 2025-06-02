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
