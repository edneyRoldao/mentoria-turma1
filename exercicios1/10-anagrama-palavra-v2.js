
function isAnagrama(p1, p2) {
    // ordenando palavra 1
    let p1Ordenada = ordenarPalavra(p1)
  
    // ordenando palavra 2  
    let p2Ordenada = ordenarPalavra(p2)

    // comparando as palavras
    return p1Ordenada == p2Ordenada
}

function ordenarPalavra(p = '') {
    // colocando as letras da palavra em um array real
    let pLista = []    
    for(let i = 0; i < p.length; i++) {
        let letra = p[i]
        pLista.push(letra)
    }

    // ordenando a lista com as letras
    for(let i = 0; i < pLista.length; i++) {
        for(let j = i + 1; j < pLista.length; j++) {
            if (pLista[i].localeCompare(pLista[j]) > 0) {
                let aux = pLista[j]
                pLista[j] = pLista[i]
                pLista[i] = aux
            }
        }
    }

    // transformando o array de letras ordenadas em uma palavra
    let palavraOrdenada = ''
    for(let i = 0; i < pLista.length; i++) {
        palavraOrdenada = palavraOrdenada + pLista[i]
    }

    return palavraOrdenada
}

let palavra1 = process.argv[2] + ''
let palavra2 = process.argv[3] + '' 
const r = isAnagrama(palavra1, palavra2)
console.log(r);

