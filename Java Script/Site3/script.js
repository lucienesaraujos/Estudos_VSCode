function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fullano = document.getElementById('txtano')
    var resultado = document.getElementById('resultado')
    if (fullano.value.length == 0 || Number(fullano.value > ano)) {
        window.alert('[ERRO] Verifique os dados e tente novamente')
    } else {
        var fsex  = document.getElementsByName('escsex')
        var idade = ano - Number(fullano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id','foto')
        if (fsex[0].checked) {
            genero = 'Homem'
            if (idade >=0 && idade <13) {
                //criança
                img.setAttribute('src', 'menino.png')
            } else if (idade < 25){
                //jovem
                img.setAttribute('src','garoto.png')
            } else if (idade < 55) {
                //adulto
                img.setAttribute('src','adulto.png')
            } else {
                //idoso    
                img.setAttribute('src','idoso.png')
                }
        } else if (fsex[1].checked) {
            genero = 'Mulher'
            if (idade>=0 && idade<13){
                img.setAttribute('src','menina.png')
            } else if (idade<25){
                img.setAttribute('src','garota.png')
            }else if (idade<55){
                img.setAttribute('src','adulta.png')
            }else {
                img.setAttribute('src','idosa.png')
            }
        }
        resultado.style.textAlign = 'center'
        resultado.innerHTML = `Detectamos ${genero} com ${idade} anos`
        resultado.appendChild(img)
    }
}