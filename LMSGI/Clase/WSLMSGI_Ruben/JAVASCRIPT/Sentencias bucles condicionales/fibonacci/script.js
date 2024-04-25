function secuencia() {
    let N = parseInt(document.getElementById("num").value);
    let F0 = 0;
    let F1 = 1;
    let resultado = "Secuencia Fibonacci:\n";
    resultado += F0 + "\n";
    resultado += F1 + "\n";
    for (let i = 2; i < N; i++) {
        let suma = F1 + F0;
        F0 = F1;
        F1 = suma;
        resultado += suma + "\n";
    }
    document.getElementById("resultado").value = resultado;
}