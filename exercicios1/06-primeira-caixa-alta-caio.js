// Receba um nome completo e transforme a primera letra em maiuscula 

function letraInicialMaiuscula(nomeCompleto) {
    let maiuscula =''
    let proximaLetraDeveSerMaiscula = true

    for (let i = 0; i < nomeCompleto.length; i++) {
        let letraInicial = nomeCompleto.charAt()

        if (proximaLetraDeveSerMaiscula) {
            letraInicial = letraInicial.tolocalUppercase()
            
        }
        
        proximaLetraDeveSerMaiscula = letraInicial == ''    
    }

    return maiuscula
}

letraInicialMaiuscula('caio vinicius')