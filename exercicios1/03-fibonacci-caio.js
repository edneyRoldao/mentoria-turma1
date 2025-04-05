// receba um numero e mostre a sequencia fibonacci 

let numeroA = 0 
let numeroB = 1
let lista = []


function fibonacci(sequencia) {
    for (let contador = 0; contador < sequencia; contador++) {
         let numeroAtual = numeroA + numeroB
                   
         lista.push(contador, numeroAtual)
                
    }
    console.log(lista);
    
}

fibonacci(3)