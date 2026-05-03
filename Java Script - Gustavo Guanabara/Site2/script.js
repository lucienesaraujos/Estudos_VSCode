function carregar() {
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = `Agora são ${hora} horas`
    if (hora>=0 && hora<12) {
        img.src = 'manha.png'
        document.body.style.background = '#f5dfc0'
    } else if (hora>=12 && hora<=18) {
        img.src = 'tarde.png'
        document.body.style.background = '#8ba5b6'
    } else {
        img.src = 'niote.png'
        document.body.style.background = '#253e45'
    }
}

