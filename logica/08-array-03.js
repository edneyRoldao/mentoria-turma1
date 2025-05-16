/* ARRAY - funcoes
  - declaracao de uma funcao que verifica se o elemento existe em uma lista
 */

// declaracao de uma funcao que verifica se o elemento existe em uma lista
function existe(list, element) {
    for (let i = 0; i < list.length; i++) {
        const item = list[i] // elemento corrente
        if (item == element) {
            return true
        }
    }
    return false
}

// invocar a funcao
const fruit = 'banana'
const fruits = ['banana', 'maca', 'uva', 'laranja']

// v1 - hard (na mao)
let r = existe(fruits, fruit)
console.log(r);

// v2
// some - retorno true se pelo menos um elemento da lista atender a condicao
let r2 = fruits.some((item) => {
    return item == fruit
})
console.log(r2);

//////////
// fruits.every 
