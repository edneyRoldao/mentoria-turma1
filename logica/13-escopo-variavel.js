/* ESCOPO DE VARIAVEL
    - toda variavel tem um ciclo de vida (onde nasce e onde morre)
    - quando temos variaveis iguais em escopo diferentes, o acesso dentro de 
      metodo, if, for e etc... a variavel local tem proferencia
 */

let n1 = 10

function testEscopo(n1) {
    
    for (let n1 = 0; n1 < 4; n1++) {
        console.log(n1);        
    }
    
    console.log(n1);    
}

testEscopo(30)

console.log(n1);
