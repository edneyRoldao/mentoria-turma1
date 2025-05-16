/* 
    Estrutura IF 
*/

// 1.000.000,05 BR
// 1,000,000.05 US
let imc = 24.999999999999999

if (imc < 18.5) {
    console.log('abaixo de peso');    
} else if ((imc >= 18.5) && (imc < 25)) {
    console.log('peso normal');    
} else if ((imc >= 25) && (imc < 30)) {
    console.log('excesso de peso');    
} else {
    console.log('obesidade');    
}
