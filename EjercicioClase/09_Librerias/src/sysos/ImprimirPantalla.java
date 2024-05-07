package sysos;

public class ImprimirPantalla {
	/**
	 * Metodo que imprime por pantalla el "consola: "
	 * y luego concatena el valor pasado por parametro
	 * @param s la cadena que queremos imprimir
	 */
	public void imprimir(String s) {
		System.out.println("consola: " + s);
	}
	/**
	 * Metodo que imprime por pantalla "consola: "
	 * y luego concatena el valor pasado por parametro
	 * @param n el entero que se quiere imprimir
	 */
	public void imprimir(int n) {
		System.out.println("consola: " + n);
	}
}
