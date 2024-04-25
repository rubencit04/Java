package Bucles_Condicionales;

import java.util.Scanner;

public class _06Numeros_Pimos {

	public static void main(String[] args) {
		System.out.println("Verificador de números primos");
		System.out.println("--------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("----Un numero es primo si solamente es divisible por si mismo y por 1----");
		System.out.println("-Intoduce un numero-");
		int numero = sc.nextInt();
		int saber = 0;
		int contador = 0;
		//Tiene que dar 0 el resto de un numero solo con si mismo y el 1 ejemplo: 
		//3/3 resto = 0 Si 3/2 = 1 3/1 = 0 ES PRIMOO
		//Si el resto da 0 mas de 2 veces no es primo
		while(numero ==0) {
			System.out.println("El 0 no se puede dividir entre sí mismo, prueba con otro");
			System.out.println("-Intoduce un numero-");
			numero = sc.nextInt();
		}
		for(int i = numero; i >=1;i--) {
		 saber = numero%i;
			System.out.println("resto--> "+saber);
			if(saber == 0) {
				contador++;
		}
			
		}
		if(contador > 2) {
			System.out.println("-------------------");
			System.out.println(numero+" no es primo");
		}else if(contador == 2) {
			System.out.println("-------------------");
			System.out.println(numero+" es primo");
			}else {
				System.out.println("---------------");
				System.out.println("El 1 no es primo, solo tiene un divisor");
				
			}

	}

}
