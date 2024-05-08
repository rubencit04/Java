package Condicionales_01;
import java.util.Scanner;

public class _06Par_Impar {

	public static void main(String[] args) {
		System.out.println("----------Par/Impar----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es par/impar");
		int numero = sc.nextInt();

		// Si el resto es 0 el numero es Par
		if (numero % 2 == 0) {
			System.out.println("Par");
		}
		// Si el resto es 1 el numero es Impar
		else if (numero % 2 == 1) {
			System.out.println("Impar");
		}

	}

}
