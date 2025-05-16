/* STRING 
    - é um array de caracteres (é transparente)
    - imutáveis
*/

let s1 = 'meu'
let s2 = 'texto'


// juntar textos (concatenacao)
let texto = s1 + ' ' + s2
console.log(texto); // meu texto

console.log();

// concat
console.log('concat:', s1.concat(s2));


console.log();

// podemos usar concatenacao para converter um numero para string
let n = 0
console.log(typeof(n)); // number
n = '' + n
console.log(typeof(n)); // string

