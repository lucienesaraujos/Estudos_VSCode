let numero = document.querySelector('input#txtnumero')
let lista = document.querySelector('select#txtselecao')
let resultado = document.querySelector('div#resultado')
let valores = []

function isNumber(n){
    if(Number(n) >= 1 && Number(n) <= 100){
        return true
    } else {
        return false
    }
}

function inSelecao (n,l) {
    if (l.indexOf (Number(n)) != -1) {
        return true
    } else {
        return false
    }
}

function adicionar (){
    if(isNumber(numero.value) && !inSelecao(numero.value, valores)) {
        valores.push(Number(numero.value))
        let item = document.createElement('option')
        item.text = `Valor ${numero.value} adicionado`
        lista.appendChild(item)
        resultado.innerHTML = ''
    } else {
        window.alert('Valor inválido ou já inserido na lista!')
    }
    numero.value = ''
    numero.focus()
}

function finalizar() {
    if (valores.length == 0) {
        window.alert('Adicione números antes de Finalizar!')
    } else {
        let totalinformado = valores.length
        let maior = valores[0]
        let menor = valores [0]
        let soma = 0
        let media = 0
        for (let pos in valores) {
            soma += valores[pos]
            if (valores[pos] > maior)
                maior = valores[pos]
            if (valores[pos] < menor)
                menor = valores[pos]
        }
        media = soma/totalinformado
        resultado.innerHTML = ''
        resultado.innerHTML += `<p>Ao todo, temos ${totalinformado} números informados</p>` 
        resultado.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
        resultado.innerHTML += `<p>O menor valor informado foi ${menor}</p>`
        resultado.innerHTML += `<p>A soma de todos os valores informados é ${soma}</p>`
        resultado.innerHTML += `<p>A média dos valores informados é ${media}</p>`
    }

}