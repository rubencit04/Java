package Bucle_for_01;

import java.util.Scanner;

public class _11Potencia {

	public static void main(String[] args) {
		System.out.println("Calculo de potenica");
		System.out.println("------------------");
		System.out.println("Introduce el numero para hacer la potencia");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Introduce las veces que quieres multiplicarlo para la potencia");
		int exponente = sc.nextInt();
		int potencia = 1;
		System.out.println("----------------------------------");
		for(int i = 1; i <= exponente;i++) {
			potencia *=base; // potencia = potencia*base
		}
		System.out.println(potencia);

	}

}
