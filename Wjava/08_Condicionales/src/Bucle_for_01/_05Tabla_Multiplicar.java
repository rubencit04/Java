package Bucle_for_01;

import java.util.Scanner;

public class _05Tabla_Multiplicar {

	public static void main(String[] args) {
		System.out.println("Tabla de multiplicar");
		System.out.println("--------------------");
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero que quieras que aparezca la tabla de multiplicar");
		int numero = sc.nextInt();
		System.out.println("------------");
		System.out.println("-----Tabla de multiplicar del "+numero+"--------");
		for (int mult = 1; mult <=10;mult++) {
			int tabla = numero * mult;
			System.out.println(numero+" * "+mult+" = "+tabla);
			System.out.println("-----------");
		}
		

	}

}
