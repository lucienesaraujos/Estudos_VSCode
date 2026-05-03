function gerar(){
    var numero = document.getElementById ('txtnumero')
    var tabuada = document.getElementById ('seltabuada')

    if(numero.value.length == 0){
        window.alert('Por favor, digite um número')
    } else {
        var num = Number(numero.value)
        var inicio = 0
        tabuada.innerHTML = ''
        
        while (inicio <= 12) {
            var item = document.createElement('option')
            item.text = `${num} x ${inicio} = ${num*inicio}`
            item.value = `tabuada${inicio}`
            tabuada.appendChild(item)
            inicio++
        }
    }
}