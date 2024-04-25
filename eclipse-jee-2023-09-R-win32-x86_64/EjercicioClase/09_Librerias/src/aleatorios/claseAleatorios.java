package aleatorios;

import java.util.Random;
/**
 * @author UpgradeHub
 */
public class claseAleatorios {
	/**
	 * Metodo que genera un <b>numero aleatorio</b> entre dos numeros 
	 * pasados por parametro
	 * @param n1 el minimo valor posible del rango (incluido)
	 * @param n2 el maximo valor posible del rango (incluid0)
	 * @returno el numero aleatorio general
	 */
	public int numeroAleatorioEntreDosNumeros(int n1, int n2) {
		Random rn = new Random();
		//ponemos n2 + 1 para incluir en n2
		int nAleatorio = rn.nextInt(n1, n2 + 1);
		return nAleatorio;
	}
	/**
	 * Metodo que genera un numero aleatorio entre el 0
	 * y 2^32
	 * @return el numero pseudoaleatorio :)
	 */
	public int numeroAleatorio() {
		Random rn = new Random();
		int nAleatorio = rn.nextInt();
		return nAleatorio;
	}
}
