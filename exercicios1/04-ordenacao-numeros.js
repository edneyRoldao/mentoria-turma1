/*
    04. Exercicio:
    Faça a ordenação de uma lista de números
*/

let listaNumeros = [1, 3, 4, 2, 6, 5, 7]

for(let i = 0; i < listaNumeros.length; i++){
    for(let j = i + 1; j < listaNumeros.length; j++){
        const valorTrocaEmMemoria = listaNumeros[i]        
        if(listaNumeros[i] > listaNumeros[j]) {
            listaNumeros[i] = listaNumeros[j]
            listaNumeros[j] = valorTrocaEmMemoria
        }
    }
}

console.log(listaNumeros);