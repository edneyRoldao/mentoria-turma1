function isPalindromo(palavra) {
    let j = 0
    for (let i = parseInt((palavra.length -1)/2); i >= 0; i--) {
        if (palavra[j] != palavra[i]) {
            console.log("FALSO");
            return            
        }
        j++
    }
    console.log("VERDADEIRO");    
}

isPalindromo('ovo')
isPalindromo('test')
isPalindromo('VERDADEIRO')
