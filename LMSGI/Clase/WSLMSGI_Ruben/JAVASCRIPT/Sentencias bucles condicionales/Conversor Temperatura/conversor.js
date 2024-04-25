function convertir(){
    let opcion = document.getElementById("opcion").value;
    let temp = document.getElementById("temp").value;
    let resultado = 0;
    if(opcion === "Celsius/Fahrenheit"){
        resultado = (temp * 9/5)+32;
        document.getElementById("resultado").value = resultado;
    }else{
        resultado = (temp - 32)* 5/9;
        document.getElementById("resultado").value = resultado;
    }
}   