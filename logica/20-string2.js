/* STRING 
    - é um array de caracteres (é transparente)
    - imutáveis
*/

// Funcoes que usamos eventualmente (charAt, indexOf, compare, endsWith, startsWith, substring)

// substring - serve para extrair um subtexto com base em um range
let s4 = 'primeira turma mentoria'
let s5 = '347354700005555666666'
// parametro 1 (0) -> o index inicial
// parametro 2 (11) -> index final 
console.log(s5.substring(0, 11)); // 34735470000
console.log(s5.substring(11, 15)); // 5555
console.log(s5.substring(15)); // nesse caso, a partir do index inicial até o final da string (666666)



// compare - verifica a ordem lexicografica das palavras
// -1: antes  /  0: igual  /  1: depois 
// let n1 = 'edney'
// console.log(n1.localeCompare('caio')); // 1
// console.log(n1.localeCompare('edney')); // 0
// console.log(n1.localeCompare('Rafa')); // -1

// startsWith (comeca com...)
// endsWith (termina com...)
// let s2 = 'primeira turma mentoria'
// console.log(s2.startsWith('pri'));
// console.log(s2.endsWith('toria'));

// duas formas de verificar se um subtexto está contido detro de um texto
// console.log(s2.includes('@@primeira')); // includes
// console.log(s2.indexOf('@@primeira')); // indexOf
// if (s2.indexOf('primeira') >= 0) console.log('existe');
// if (s2.includes('primeira')) console.log('existe');


// charAt - recupera um caracter com base em um index
// let s1 = 'laranja'
// console.log(s1.charCodeAt(0)); // l

// indexOf - retorna o index com base em um char
// console.log(s1.indexOf('j')); // 0
// console.log(s1.indexOf('a'));
// console.log(s1.indexOf('ran')); // retorna o posicao do r quando encontrar o termo 'ran'
// console.log(s1.indexOf('ba')); // retorna -1
