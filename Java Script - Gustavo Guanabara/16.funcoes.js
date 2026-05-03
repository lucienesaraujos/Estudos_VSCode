/*function parouimpar (n) {
    if (n%2 == 0) {
        return 'Par!'
    } else {
        return 'Ímpar!'
    }
}

var resultado = parouimpar(1256)
console.log(resultado)

console.log(parouimpar(1257))*/

/*function calcular (n1, n2) {
    return n1 + n2
}
console.log(calcular(10,5))

//no caso do valor não ser digitado pelo usuário, coloque a var = 0*/

/*var v = function(x) {
    return x*2
}
console.log(v(5))*/

/*function fatorial (n) {
    var fat = 1
    for(let c = n; c > 1;c--){
        fat *=c
    }
    return fat    
}
console.log(fatorial(5))*/

function fatorial (n) {
    if (n == 1){
        return 1
    } else {
        return n * fatorial(n-1)
    }
}
console.log(fatorial(10))