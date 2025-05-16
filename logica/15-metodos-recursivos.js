/* MEDOTOS RECURSIVOS (auto invocaveis) */

function countDown(n) {
    if (n <= 0) { // stop condition
        return
    }

    console.log(n); // print
    
    n = n - 1 // increment

    countDown(n) // auto invocation
} 

countDown(5) // starting