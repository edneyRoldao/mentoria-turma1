/* STRING 
    - é um array de caracteres (é transparente)
    - imutáveis
*/

// Funcoes que usamos eventualmente (charAt, indexOf, compare, endsWith, startsWith, substring)

// charAt - recupera um caracter com base em um index
let s1 = 'laranja'
console.log(s1.charCodeAt(0));

// indexOf - retorna o index com base em um char
console.log(s1.indexOf('j')); // 0
console.log(s1.indexOf('a'));
console.log(s1.indexOf('ran')); // retorna o posicao do r quando encontrar o termo 'ran'
console.log(s1.indexOf('ba')); // retorna -1
