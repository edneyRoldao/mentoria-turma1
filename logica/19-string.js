/* STRING 
    - é um array de caracteres
    - imutáveis
*/

// Funcoes mais importantes (length*, replace, split, includes, replaceAll, toLowerCase, toUpperCase, trim)
// trim - remove espacos no inicio e fim de uma string
let s6 = '      meu texto      '
console.log(s6.trim());

// replaceAll - substituicao de valores (todos que encontrar)
// como mudar o padrao de um numero decimal usando replace
let valorProduto = '12,000,000,000.45'
valorProduto = valorProduto.replaceAll(',', '@') // 12@000@000@000.45
valorProduto = valorProduto.replaceAll('.', ',') // 12@000@000@000,45
valorProduto = valorProduto.replaceAll('@', '.') // 12.000.000.000,45
console.log(valorProduto);


// let s4 = 'my first text using string in javascript'
s4 = s4.toUpperCase()
console.log(s4);

s4 = s4.toLowerCase()
console.log(s4);



// includes - verifica se um termo(palavra) está contido em um texto(string)
// * deixando todo mundo em caixa baixa (minusculo) antes de comparar, pois é case insensitive
let s3Comparacao = 'StRiNg'
s3Comparacao = s3Comparacao.toLowerCase()
let s3 = 'my first text using string in javascript'
s3 = s3.toLowerCase()
console.log('includes:', s3.includes(s3Comparacao));
console.log('--------------------');


// length - verifica o tamanho da string
let s = 'meu primeiro texto'
console.log('length', s.length);
console.log('--------------------');

// replace - substituicao de valores
let s1 = "10.45"
s1 = s1.replace('.', ',')
console.log('replace', s1);
console.log('--------------------');


// split - corta o texto e transforma em array
let s2 = 'banana,maca,uva,pera'
s2 = s2.split(',')
console.log('split', s2);
console.log('--------------------');
