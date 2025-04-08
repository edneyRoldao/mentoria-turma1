function nomeCompleto(nome){
    let nomeInteiro = ''
    let proximaLetraMaiuscula = true

    for (let i = 0; i < nome.length; i++) {
         let letraAtual = nome.charAt(i)
        if (letraAtual == ' '){
            proximaLetraMaiuscula = true
        }
        if (proximaLetraMaiuscula && letraAtual!=' '){
            nomeInteiro += letraAtual.toUpperCase()
            proximaLetraMaiuscula = false
            
        } else {
            nomeInteiro += letraAtual.toLowerCase()
        }

    } console.log(nomeInteiro);
    

    }

let nomeParam = process.argv[2]    
nomeCompleto(nomeParam)