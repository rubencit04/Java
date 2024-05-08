package Bucles_Condicionales;

import java.util.Scanner;

public class _07Generador_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Generador de secuencia Fibonacci----");
		System.out.println("Inroduce la N");
		int N = sc.nextInt();
		int F0 = 0;
		int F1 = 1;
		System.out.println(F0);
		System.out.println(F1);
		for(int i = 1; i < N;i++) {
			int suma = F1 + F0;
			F0 = F1;
			F1 = suma;
			System.out.println(F1);
			
		}
			
			
			
			
		}
		
			
		
		
	}	
	

