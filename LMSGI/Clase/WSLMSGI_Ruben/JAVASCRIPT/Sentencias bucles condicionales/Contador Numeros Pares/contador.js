function contar(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let contador = 0;
    if(num1 > num2){
        let temp = num1;
        num1 = num2;
        num2 = temp;

    }
    for(let i = num1; i <= num2; i++){
        if(i %2===0){
            contador++;
            
        }
       
    }
    
    document.getElementById("resultado").value = contador;
}