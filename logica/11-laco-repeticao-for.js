/* 
    ESTRUTURA REPETICAO - FOR
*/

// caracteristicas lacos de repeticao
// inicializacao, condicao de parada, incremento

let fruits = ['banana', 'maca', 'uva', 'laranja']

for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);    
}

console.log('fim do processo 1');
console.log();
console.log('----------------------------');

// exibindo lista de tras para frente
for (let i = fruits.length - 1; i >= 0; i--) {
    console.log(fruits[i]);    
}

console.log('fim do processo 2');
