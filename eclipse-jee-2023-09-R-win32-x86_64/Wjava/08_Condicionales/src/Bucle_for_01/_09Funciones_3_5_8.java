package Bucle_for_01;

import java.util.Scanner;

public class _09Funciones_3_5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Desde el PRIMER numero HASTA el SEGUNDO");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("Imprimiendo...\n");
		System.out.println("-----------------------");
		primer(4,9);
		System.out.println("Tabla de multiplicar");
		System.out.println("--------------------");
		segundo(4);
		System.out.println("Calcular el numero factorial");
		System.out.println("------------------------------");
		tercer(3);
		
		
	}
	public static void primer(int num1,int num2) {
		for (int i = num1 ; i <=num2; i++) {
			System.out.println(i);
			System.out.println("-------------------");
		}
	}
		public static void segundo(int numero) {
			System.out.println("-----Tabla de multiplicar del "+numero+"--------");
			for (int mult = 1; mult <=10;mult++) {
				int tabla = numero * mult;
				System.out.println(numero+" * "+mult+" = "+tabla);
				System.out.println("-----------");
			}
		}
		public static void tercer(int fact) {
			int mult = 1;
			for (int i = fact; i >= 1; i--) {
				mult *= i;
			}
			System.out.println("Factorial de "+fact+"---> "+mult);
		}
	

}
