package Bucle_for_01;

import java.util.Scanner;

public class _03Primero_hasta_segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Desde el PRIMER numero HASTA el SEGUNDO");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("Escribe el primero numero");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero");
		int num2 = sc.nextInt();
		System.out.println("----------------------------------------");
		System.out.println("Imprimiendo...\n");
		System.out.println("-----------------------");
		for (int i = num1 ; i <=num2; i++) {
			System.out.println(i);
			System.out.println("-------------------");
		}

	}

}
