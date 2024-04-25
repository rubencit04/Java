package Bucles_Condicionales;

import java.util.Random;
import java.util.Scanner;

public class _05Adivinar_Numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Juego adivina el número");
		System.out.println("-----------------------------");
		Random r = new Random();
		System.out.println("Escribe un numero del 1 al 10");
		int numero = sc.nextInt();
		int valorDado = r.nextInt(10) + 1;// Genera un número aleatorio del 1 al 10, ambos incluidos.
		do {
			if (numero < valorDado) {
				System.out.println("Muy bajo");
				System.out.println("Intentalo de nuevo, vuelve a probar con otro numero");
				numero = sc.nextInt();

			} else if (numero > valorDado) {
				System.out.println("Muy alto");
				System.out.println("Intentalo de nuevo, vuelve a probar con otro numero");
				numero = sc.nextInt();
			}
			System.out.println("----------------------");
		} while (numero != valorDado);
		System.out.println("Adivinaste que el numero es---> " + valorDado);

	}

}
