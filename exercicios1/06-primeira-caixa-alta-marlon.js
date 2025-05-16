function formatarNome(nomeCompleto = '') {
    let nomeFormatado = ''

    const nomes = nomeCompleto.split(" ")

    for (let i = 0; i < nomes.length; i++) {
        let nome = transformarPrimeiraLetraCaixaAlta(nomes[i])
        nomeFormatado = nomeFormatado + ' ' + nome
    }

    return nomeFormatado
}

function transformarPrimeiraLetraCaixaAlta(valor = '') {
    return valor.substring(0,1).toUpperCase() + valor.substring(1).toLowerCase()
}

let nomeParam = process.argv[2]    
const formatacaoNome = formatarNome(nomeParam);
console.log('seu nome formatado: ', formatacaoNome);
