/* Expressoes Regulares 
    - utilizado para validar um campo
    - verificar um padrao
    - extrair dados em massa
    - para susbstituicao
*/

// OBS: Substituindo um telefone

// validando telefone - passo 10
let regex = /\(\d{2}\) \d{4,5}-?\d{4}/g
let textoComTelefones = 'sdfasfda (99) 91234-3333 sdfasdfasdfasd sdfasfda (99) 91234-9999  sdfasfda (99) 91234-8888 sdfasfda (99) 91234-7777  dsadaSDAsd'
console.log(textoComTelefones.replace(regex, '(proibido)'));
