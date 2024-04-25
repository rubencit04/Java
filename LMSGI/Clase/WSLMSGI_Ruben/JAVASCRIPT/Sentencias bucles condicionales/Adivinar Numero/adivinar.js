let numeroAleatorio = Math.floor(Math.random() * 20) + 1;
function cambiar(){
    numeroAleatorio = Math.floor(Math.random() * 20) + 1;
}
function resolver() {
    let numeroUsuario = parseInt(document.getElementById("numero").value);
    
    if (numeroUsuario === numeroAleatorio) {
        document.getElementById("resultado").value = "¡Felicidades! Has adivinado el número.";
    } else if (numeroUsuario > numeroAleatorio) {
        document.getElementById("resultado").value = "El número es demasiado alto. Intenta de nuevo.";
    } else {
        document.getElementById("resultado").value = "El número es demasiado bajo. Intenta de nuevo.";
    }
}