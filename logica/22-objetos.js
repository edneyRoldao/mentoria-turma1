/* OBJECT
*/

// seria um agrupamento de variaveis
let person = {
    age: 18,
    name: 'Maria',
    address: {
        street: 'Rua Voluntarios da Patria'
    }
}

// para acessar os campos de um objeto
console.log(person.age);
console.log(person['name']);
console.log(person.address.street);
console.log(person['address']['street']);


// adicionar propriedade ao objeto
person['lastName'] = 'Socorro'

// remover um campo
delete person.lastName


// percorrer os campos de um objeto
console.log();
for (let key in person) {
    console.log(key, person[key]);    
}
