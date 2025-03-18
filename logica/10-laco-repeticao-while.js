/* 
    ESTRUTURA REPETICAO - WHILE (enquanto)
*/

// incremento/decremento, condicao de parada.

let n = 1
while /* enquanto */ (n < 10) {
    console.log('esse e um bloco de codigo que esta em um laco  de repeticao while', n);
    n++
}

console.log('fim do laco');
// condicao de parada: n < 10
// incremento: n++
// sem condicao de parada, fica em loop infinito

// usando o WHILE para percorrer cada item da minha lista
let list = ['Edney', 'Maria', 'Joao', 'Rebecca', 'Pedro'] // minha tem 4 elementos

let index = 0
while (index < list.length) {
    console.log(list[index]);
    index++
}

console.log(list.length);
console.log("fim do loop");
