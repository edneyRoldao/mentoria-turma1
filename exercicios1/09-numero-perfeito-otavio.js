/* NUMERO PERFEITO 
    Um número perfeito é um número inteiro positivo que é igual 
    à soma de seus divisores próprios positivos (excluindo ele mesmo).
    exemplo: 6
    (1+2+3) = 6
*/

function ehNumeroPerfeito(numero) {
    if (numero <= 1) return false;

    let soma = 0;

    for (let i = 1; i < numero; i++) {
        if (numero % i === 0) {
            soma += i;
        }
    }

    return soma === numero;
}

const result = ehNumeroPerfeito(4)
console.log(result);
