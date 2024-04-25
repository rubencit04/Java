package Bucle_while_01;

import java.util.Scanner;

public class _07Factorial {

	public static void main(String[] args) {
		System.out.println("Calcular el numero factorial");
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("------Factorial de "+num+"------");
		int i = num;
		int fact = 1;
		do {
			
			fact *=i;
			i--;
			
		}while(i >= 1);
		System.out.println("Factorial de "+num+" ---> "+fact);
	}

}
