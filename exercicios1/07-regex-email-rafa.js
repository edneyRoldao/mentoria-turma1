let email = /^\w+@{1}\D$/
let verificacaoDeEmail1 = 'rafa.atleta16@yahoo.com.br'
let verificacaoDeEmail2 = 'lidiomar.rosita@gmail.com'
let verificacaoDeEmail3 =  'banana@abx.com'
let verificacaoDeEmail4 =  'ban ana@abx.com'
let verificacaoDeEmail5 =  'banana@abx.comMaisCOisas'
let verificacaoDeEmail6 = 'lidiomar.rosita@@gmail.com'

console.log('Este E-mail é:', email.test(verificacaoDeEmail1));
console.log('Este E-mail é:', email.test(verificacaoDeEmail2));
console.log('Este E-mail é:', email.test(verificacaoDeEmail3));
console.log('Este E-mail é:', email.test(verificacaoDeEmail4));
console.log('Este E-mail é:', email.test(verificacaoDeEmail5));
console.log('Este E-mail é:', email.test(verificacaoDeEmail6));
