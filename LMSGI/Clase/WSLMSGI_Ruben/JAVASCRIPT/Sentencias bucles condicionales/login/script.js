function login(){
    let usuario = document.getElementById("usuario").value;
    let pass = document.getElementById("pass").value;

    if(usuario === "goku" && pass === "Vegeta777"){
        alert("Bienvenido")
    }else{
       alert("Contraseña Incorrecta")
    }
}