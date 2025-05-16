/* Receba um numero e mostre a sequencia fibonacci

A sequência de Fibonacci é uma série de números onde cada termo é a soma dos dois anteriores, começando geralmente com 0 e 1:
    0,1,1,2,3,5,8,13,21,34,…
 */


function gerarSequenciaFibonacci(seq) {
    const list = []

    for (let i = 0; i < seq; i++) {
        if (i == 0) {
            list.push(0);
            continue
        }
         
        if (i == 1) {
            list.push(1)
            continue
         }

         let ultimoItemList = list[list.length - 1]
         let penultimoItemList = list[list.length - 2]
         let seqAtual = ultimoItemList + penultimoItemList
         list.push(seqAtual)
    }

    console.log(list);    
}

let sequenceFibonacci = parseInt(process.argv[2])
gerarSequenciaFibonacci(sequenceFibonacci)
