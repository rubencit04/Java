package Bucle_while_01;

import java.util.Scanner;

public class _03Primero_Hasta_Segundo {

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
		System.out.println("------"+num1+" hasta "+num2+"------");
		while(num1 <=num2)
			System.out.println("Numero---> "+num1++);
			System.out.println("-------------");
		
		
			
	}

}
