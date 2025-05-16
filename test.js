function transformarPrimeiraLetraCaixaAlta(valor = '') {
    return valor.substring(0,1).toUpperCase() + valor.substring(1).toLowerCase()
}

let nome = 'edney'
console.log(transformarPrimeiraLetraCaixaAlta(nome));

