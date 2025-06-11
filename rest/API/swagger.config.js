const swaggerJsdoc = require('swagger-jsdoc');

const options = {
  definition: {
    openapi: '3.0.0',
    info: {
      title: 'API de Usuários',
      version: '1.0.0',
      description: 'Exemplo de API RESTful com CRUD e Swagger. host: http://localhost:3000',
    },
  },
  apis: ['./server.js'], // Caminho dos comentários Swagger
};

module.exports = swaggerJsdoc(options);
