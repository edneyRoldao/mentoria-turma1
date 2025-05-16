/* tipo: NUMBER */

let n = 10.50
console.log(n);

// convertendo para inteiro
n = parseInt(n) 

let n2 = 10

// descobrindo o tipo da variavel
let n3 = 10
console.log(typeof(n3));

// realizando a soma com base no tipo
if (typeof(n2) == 'number') 
    console.log(n2 + n3);
else 
    console.log(parseInt(n2) + n3);

console.log('--------------------');
let n5 = 'gfdg22.45zXC'
let n4 = parseFloat(n5) // NaN -> not a number
console.log(n5);
console.log(n4);

// aredondamento
let r = 10.78 / 15.27
let rArredondado = r.toFixed(5)
let rAsNumber = parseFloat(rArredondado)
console.log(rAsNumber);


let n6 = 78.99

n6 = n6.toString()
n6 = n6.replace('.', ',')
console.log('n6', n6);
