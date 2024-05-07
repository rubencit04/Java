package Bucles_Condicionales;

import java.util.Scanner;

public class _02Temperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Convertidor de temperatura---------");
		System.out.println("---------Comandos---------");
		System.out.println("1.->Celsius--->Fahrenheit");
		System.out.println("2.->Fahrenheit--->Celsius");
		System.out.println("--------------------------");
		System.out.println("Seleccione el comando");
		int seleccion = sc.nextInt();
		System.out.println("------------------------");
		switch (seleccion){
		case 1: {
			//Grados Fahrenheit = (grados celsius × 9/5) +32.°F
			System.out.println("Indica los grados Celsius");
			int celsius = sc.nextInt();
			System.out.println("-------------------");
			int Fah = (celsius * 9/5)+32;
			System.out.println(+celsius+"°C ---> "+Fah+"°F");
			break;
		}
		case 2: {
			//Grados Celsius = (grados Fahrenheit − 32) × 5/9.
			System.out.println("Indica los grados Fahrenheit");
			int Fah = sc.nextInt();
			System.out.println("-------------------");
			int celsius = (Fah - 32) * 5/9;
			System.out.println(+Fah+"°F ---> "+celsius+"°C");
			break;
			}
		default:{
			System.out.println("Seleccione unicamente el 1 o el 2");
		}
		}

	}

}
