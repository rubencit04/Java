package _01Excepciones;

public class nombreVacioNoPermitido extends RuntimeException{
	public nombreVacioNoPermitido(String mensaje) {
        super(mensaje);
	}

}
