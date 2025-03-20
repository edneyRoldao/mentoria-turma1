/* MEDOTOS RECURSIVOS (auto invocaveis) */

function meuFor(list, index) {
    if (index < list.length) {
        console.log(list[index]);
        meuFor(list, ++index) // invocando a si mesmo
    }
    
    return
}

const names = ['maria', 'joao', 'jose']

meuFor(names, 0)
