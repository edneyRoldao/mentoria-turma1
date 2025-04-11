function isAnagrama(p1 = '', p2 = ''){
    if (p1.length != p2.length)
        return false

    let pEqualizada = ''

    for (let i = 0; i < p1.length; i++) {
        let letraP1 = p1.charAt(i)
        let indexP2 = p2.indexOf(letraP1)

        if (indexP2 == -1) 
            return false
        
        pEqualizada = pEqualizada + p2.charAt(indexP2)
    }

    return pEqualizada == p1
}

function isAnagramaV2(p1 = '', p2 = ''){
    if (p1.length != p2.length) 
        return false

    for (let i = 0; i < p1.length; i++) {
        let letraP1 = p1.charAt(i)
        let indexP2 = p2.indexOf(letraP1)

        if (indexP2 == -1) 
            return false   
    }

    return true
}

let palavra1 = process.argv[2] + ''
let palavra2 = process.argv[3] + '' 
const r = isAnagrama(palavra1, palavra2)

console.log(r);
