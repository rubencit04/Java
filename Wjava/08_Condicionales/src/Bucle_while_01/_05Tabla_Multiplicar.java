package Bucle_while_01;

import java.util.Scanner;

public class _05Tabla_Multiplicar {

	public static void main(String[] args) {
		System.out.println("Tabla de multiplicar");
		System.out.println("--------------------");
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		int i = 1;
		System.out.println("Escribe el numero que quieras para saber su tabla de multiplicar");
		numero = sc.nextInt();
		System.out.println("---------------------------------------------------------------");
		do {
			int tabla = numero * i;
			System.out.println(numero + " x " + i + " = " + tabla);
			i++;
		} while (i <= 10);
		System.out.println("---------------------------------------------------------------");
	}

}
