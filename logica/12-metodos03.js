/* FUNCTIONS - formas de declaracao */

// v1
function sum(n1, n1) {
    return n1 + n2
}

// v2 - armazena a funcao em uma variavel
const sum2 = function(n1, n2) {
    return n1 + n2
}


// v3 - arrow function
const sum3 = (n1, n2) => {
    return n1 + n2
}

const sum4 = (n1, n2) => {
    console.log('n1', n1);
    console.log('n2', n2);    
    return n1 + n2
}

for (let i = 0; i < 10; i++) 
    console.log(i);

if (true) console.log('test');
