function verificarEmails(emailValido){
    let regex  = /^[\w.-]+@[\w]+\.[\w]+(\.\w{2})?$/
    
    if (regex.test(emailValido)) {
        console.log('Seu E-mail é valido:', emailValido);
    }else{
        console.log('Seu E-mail é inválido');
    }
}
const emailRecebido = process.argv[2]; 
verificarEmails(emailRecebido);


// - /^[\w.-]+@[\w]+\.[\w]+(\.\w+)?$/
// - /^[\w.-]+@[\w]+\.[\w]+(\.br)?$/