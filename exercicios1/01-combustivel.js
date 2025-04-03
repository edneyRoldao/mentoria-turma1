function qualCombustivelEmelhor(valorGasolina, valorAlcool){
    let rendimentoA = valorAlcool * 1.3

    console.log('Este é o rendimento do alcool:', rendimentoA.toFixed(2));

    if(valorGasolina <= rendimentoA){
        console.log('A gasolina é a melhor opcão');
    }else{
        console.log('O alcool é a melhor opção');
    }
}

let g = 5.90
let a = 4.16
qualCombustivelEmelhor(g, a)