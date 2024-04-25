function sumar(){
    num1 = parseInt(document.getElementById("num1").value);
    num2 = parseInt(document.getElementById("num2").value);
    resultado = num1 + num2;
    document.getElementById("resultado").value = resultado;
}
function restar(){
    num1 = parseInt(document.getElementById("num1").value);
    num2 = parseInt(document.getElementById("num2").value);
    resultado = num1 - num2;
    document.getElementById("resultado").value = resultado;
}
function multiplicar(){
    num1 = parseInt(document.getElementById("num1").value);
    num2 = parseInt(document.getElementById("num2").value);
    resultado = num1 * num2;
    document.getElementById("resultado").value = resultado;
}
function dividir(){
    num1 = parseInt(document.getElementById("num1").value);
    num2 = parseInt(document.getElementById("num2").value);
    resultado = num1 / num2;
    document.getElementById("resultado").value = resultado;
}