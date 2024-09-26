package _01Excepciones;

public class edadNoPermitida extends Exception{
	public edadNoPermitida(String mensaje) {
        super(mensaje);
	}
}
