function primo() {
    let numero = document.getElementById("numero").value;
    let saber = 0;
    let contador = 0;
    //Tiene que dar 0 el resto de un numero solo con si mismo y el 1 ejemplo: 
    //3/3 resto = 0 Si 3/2 = 1 3/1 = 0 ES PRIMOO
    //Si el resto da 0 mas de 2 veces no es primo
    for (let i = numero; i >= 1; i--) {
        saber = numero % i;
        if (saber == 0) {
            contador++;
        }

    }
    if (contador > 2) {
        document.getElementById("resultado").value = "No Es Primo";
    } else {
        document.getElementById("resultado").value = "Es Primo";

    }
}
