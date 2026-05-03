function contar () {
    var inicio = document.getElementById ('txtinicio')
    var fim = document.getElementById ('txtfim')
    var passo = document.getElementById ('txtpasso')
    var resultado = document.querySelector('div#resultado')
    var contagem

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
        resultado.innerHTML = 'Impossível contar!'
        window.alert('[ERRO]Faltam dados!!!')
    } else {
        resultado.innerHTML = 'Contando: <br>'
        var i = Number(inicio.value)
        var f = Number(fim.value)
        var p = Number(passo.value)
        if (p <= 0) {
            window.alert('Passo inválido! Considerando Passo = 1')
            passo = 1
        }
        if (i < f)
            //Contagem crescente
        for(contagem = i; contagem <= f; contagem += p){
            resultado.innerHTML += ` ${contagem} \u{27a1}`
        }else {
            //contagem descrente
            for(contagem = i; contagem >= f; contagem -= p){
                resultado.innerHTML += ` ${contagem} \u{27a1}`
            }
        }
        resultado.innerHTML += `\u{1f3c1}`
    }

}