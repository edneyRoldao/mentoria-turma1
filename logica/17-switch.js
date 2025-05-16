/* SWITCH (mais utilizado quando trabalhamos com o tipo ENUM)
    enum -> vamos falar disso no módulo de backend
*/

const category = "sdfasdfasdf"

switch (category) {
    case "ELETRONIC":
        console.log("c1 - faz algo quando:", category);
        break
    case "GROCERIES":
        console.log("c2 - faz algo quando:", category);
        break     
    case "ALIMENTOS":
        console.log("c3 - faz algo quando:", category);     
        break
    default:
        console.log("opcao invalida");        
}
