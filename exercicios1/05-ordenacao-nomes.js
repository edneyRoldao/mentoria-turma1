let listaNomes = [
    {nome: 'Rafa'},
    {nome: 'Obama'},
    {nome: 'Lidia'},
    {nome: 'Andre'},
]

for(let i = 0; i < listaNomes.length; i++){
    for(let j = i + 1; j < listaNomes.length; j++){
        const valorTrocaEmMemoria = listaNomes[i]        
        if(listaNomes[i].nome.localeCompare(listaNomes[j].nome) > 0){
            listaNomes[i] = listaNomes[j]
            listaNomes[j] = valorTrocaEmMemoria
        }
    }
}

console.log(listaNomes);