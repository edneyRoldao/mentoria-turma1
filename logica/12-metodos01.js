/* METODOS */

// criando uma metodo com retorno
function isCPFValido(cpf) {
    // fazendo um if else em uma unica linha (térnario)
    // v3
    return (cpf.length != 11) ? true : false

    // v2
    // return (cpf.length != 11)
    
    // v1
    // if (cpf.length != 11) {
    //     return false
    // } else {
    //     return true
    // }
}

let cpfEstaValido = isCPFValido("123456789122222")

if (cpfEstaValido) {
    console.log("autoriza a criacao da conta bancaria");    
} else {
    console.log("abertura de conta negada");    
}
