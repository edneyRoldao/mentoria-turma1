const express = require('express');
const app = express();
const swaggerUi = require('swagger-ui-express');
const swaggerSpec = require('./swagger.config');

app.use(express.json());

// Mock em memória
let users = [
    { id: 1, name: 'Mikasa', email: 'mikasa@email.com', deleted: false },
    { id: 2, name: 'Eren', email: 'eren@email.com', deleted: false },
    { id: 3, name: 'Zeke', email: 'zeke@email.com', deleted: false },
    { id: 4, name: 'Reiner', email: 'reiner@email.com', deleted: false },
];

// Swagger na web
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerSpec));

/**
 * @swagger
 * /users:
 *   get:
 *     summary: Lista usuários ativos com filtro opcional por nome e email
 *     parameters:
 *       - in: query
 *         name: name
 *         schema: { type: string }
 *         description: Filtro parcial por nome
 *       - in: query
 *         name: email
 *         schema: { type: string }
 *         description: Filtro parcial por email
 *       - in: query
 *         name: deleted
 *         schema: { type: string }
 *         description: Buscar os deletados também
 *     responses:
 *       200:
 *         description: Lista de usuários filtrada
 */
app.get('/users', (req, res) => {
    const { name, email, deleted } = req.query;
  
    let result = users;

    if (!deleted || deleted != 'true')
        result = users.filter(u => !u.deleted);
  
    if (name) {
      result = result.filter(u => u.name.toLowerCase().includes(name.toLowerCase()));
    }
  
    if (email) {
      result = result.filter(u => u.email.toLowerCase().includes(email.toLowerCase()));
    }
  
    res.json(result);
  });
  
/**
 * @swagger
 * /users/{id}:
 *   get:
 *     summary: Busca um usuário pelo ID
 *     parameters:
 *       - name: id
 *         in: path
 *         required: true
 *         schema: { type: integer }
 *     responses:
 *       200:
 *         description: Usuário encontrado
 *       404:
 *         description: Usuário não encontrado
 */
app.get('/users/:id', (req, res) => {
  const user = users.find(u => u.id == req.params.id);
  user ? res.json(user) : res.status(404).send('Usuário não encontrado');
});

/**
 * @swagger
 * /users:
 *   post:
 *     summary: Cria um novo usuário
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *             properties:
 *               name: { type: string }
 *               email: { type: string }
 *     responses:
 *       201:
 *         description: Usuário criado com sucesso
 */
app.post('/users', (req, res) => {
  const newUser = { id: Date.now(), ...req.body };
  users.push(newUser);
  res.status(201).json(newUser);
});

/**
 * @swagger
 * /users/{id}:
 *   put:
 *     summary: Atualiza um usuário existente
 *     parameters:
 *       - name: id
 *         in: path
 *         required: true
 *         schema: { type: integer }
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *             properties:
 *               name: { type: string }
 *               email: { type: string }
 *     responses:
 *       200:
 *         description: Usuário atualizado
 *       404:
 *         description: Usuário não encontrado
 */
app.put('/users/:id', (req, res) => {
  const index = users.findIndex(u => u.id == req.params.id);
  if (index >= 0) {
    users[index] = { id: users[index].id, ...req.body };
    res.json(users[index]);
  } else {
    res.status(404).send('Usuário não encontrado');
  }
});

/**
 * @swagger
 * /users/{id}:
 *   delete:
 *     summary: Remove um usuário
 *     parameters:
 *       - name: id
 *         in: path
 *         required: true
 *         schema: { type: integer }
 *     responses:
 *       204:
 *         description: Usuário removido
 *       404:
 *         description: Usuário não encontrado
 */
app.delete('/users/:id', (req, res) => {
  const index = users.findIndex(u => u.id == req.params.id);
  if (index >= 0) {
    users.splice(index, 1);
    res.status(204).send();
  } else {
    res.status(404).send('Usuário não encontrado');
  }
});

/**
 * @swagger
 * /users/{id}/delete:
 *   patch:
 *     summary: "Deleta logicamente um usuário (marca como deleted: true)"
 *     parameters:
 *       - name: id
 *         in: path
 *         required: true
 *         schema:
 *         type: integer
 *     responses:
 *       200:
 *         description: Usuário marcado como deletado
 *       404:
 *         description: Usuário não encontrado
 */
app.patch('/users/:id/delete', (req, res) => {
    const user = users.find(u => u.id == req.params.id);
    if (!user) return res.status(404).send('Usuário não encontrado');
    user.deleted = true;
    res.json({ message: 'Usuário deletado logicamente', user });
  });

// Iniciar servidor
app.listen(3000, () => {
  console.log('Servidor rodando em http://localhost:3000');
  console.log('Swagger disponível em http://localhost:3000/api-docs');
});
