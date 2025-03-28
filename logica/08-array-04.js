/* ARRAY */

// filtrar somente maiores que 17
function filtrarAdultos(lista = []) {
    const listaFiltrada = []
    for (let i = 0; i < lista.length; i++) {
        const pessoaAtual = lista[i]        
        if (pessoaAtual.idade > 17) {
            listaFiltrada.push(pessoaAtual)
        }        
    }
    return listaFiltrada
} 

const pessoas = [
    { idade: 17, nome: 'Maria'},
    { idade: 21, nome: 'Pedro'},
    { idade: 16, nome: 'Joao'},
    { idade: 18, nome: 'Jose'},
]

const pessoasAdultasV1 = filtrarAdultos(pessoas)

// filtro V2
const pessoasAdultasV2 = pessoas.filter(function (pessoaAtual) {
    return pessoaAtual.idade > 17
})

console.log('v1', pessoasAdultasV1);
console.log('v2', pessoasAdultasV2);

