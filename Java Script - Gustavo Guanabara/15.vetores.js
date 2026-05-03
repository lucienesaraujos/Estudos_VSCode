var numero = [250,265,289, 301, 325,350]

/*console.log(`O conteúdo do vetor são os números: ${numero}`)

numero[3] = 301
console.log(`O conteúdo do vetor são os números: ${numero}`)

numero.push(325)
console.log(`O conteúdo do vetor são os números: ${numero}`)

numero.length // mostra quantos espaços de memória estam em uso

numero.sort() // organiza os componentes do array em ordem crescente, a posição que coloca importa, se posicionado depois o que for acrescentado ficará fora de ordem

console.log(`O vetor tem ${numero.length} posições`)
console.log(`O primeiro valor do vetor é ${numero[0]}`)*/

/*for(var pos = 0; pos < numero.length; pos++) //<= com length gera um último valor undefined
    // console.log(numero[pos]) ou
    console.log(`A posição ${pos} tem o valor ${numero[pos]}`)*/

/*for(var pos in numero){
    console.log(numero[pos])
}*/
var pos = numero.indexOf(759) 
/*console.log(`O valor 350 está na posição ${pos}`)
var pos = numero.indexOf(430)
console.log(`O valor 430 está na posição ${pos}`) //em JS -1 significa que não foi encontrado*/
if (pos == -1) {
    console.log(`O valor não foi encontrado`)
} else {
    console.log(`O valor 430 está na posição ${pos}`)
}
