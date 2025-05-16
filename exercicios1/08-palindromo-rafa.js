
function verificacaoDePalindromo(palavra = '') {
    let palavraInvertida = ''

    for(let i = palavra.length - 1; i >= 0; i--){
        palavraInvertida = palavraInvertida + palavra.charAt(i);
    }
    
    console.log(palavra == palavraInvertida);
}

verificacaoDePalindromo('test123')
