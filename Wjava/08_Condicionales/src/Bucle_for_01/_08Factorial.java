package Bucle_for_01;

import java.util.Scanner;

public class _08Factorial {

	public static void main(String[] args) {
		System.out.println("Calcular el numero factorial");
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero que quieras hacer el factorial");
		int fact = sc.nextInt();
		int mult = 1;
		System.out.println("----Numero Factorial----");
		for (int i = fact; i >= 1; i--) {
			mult *= i;
		}
		System.out.println(mult);

	}

}
