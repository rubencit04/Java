
package Bucle_while_01;

import java.util.Scanner;

public class _09Potencia {

	public static void main(String[] args) {
		System.out.println("Calculo de potencia");
		System.out.println("------------------");
		System.out.println("Introduce la base");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Intoduce el numero exponencial");
		int exponente = sc.nextInt();
		int potencia = 1;
		int i = 1;
		do {
			potencia *= base; 
			i++;
		}while(i <=exponente);
		System.out.println("-------------------------------");
		System.out.println(base+"^"+exponente+" = "+potencia);
	}

}
