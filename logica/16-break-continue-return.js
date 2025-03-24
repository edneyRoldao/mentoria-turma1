/* 
    BREAK, CONTINUE, LABEL e RETURN
    - formas de interromper a execucao de um fluxo (codigo)
*/


// Label (podemos nomear cada for, assim podemos usar isso para determinar qual for vamos parar)
fora:
for (let i = 0; i < numeros.length; i++) {
    dentro:
    for (let j = 0; j < numeros.length; j++) {
        break fora
    }
}

