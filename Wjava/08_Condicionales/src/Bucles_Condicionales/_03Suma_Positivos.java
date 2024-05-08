package Bucles_Condicionales;

import java.util.Scanner;

public class _03Suma_Positivos {

	public static void main(String[] args) {
		System.out.println("Suma de números positivos hasta introducir un numero negativo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero para sumarlo");
		System.out.println("Si escribes un numero negativo la suma se parara");
		int num1 = 0;
		int suma = 0;
		int num2 = 0;
		num1 = sc.nextInt();
		if(num1 <= 0) {
			System.out.println("Intoruzca un numero positivo");
		}else{
			System.out.println("Segundo numero para sumar");
			num2 = sc.nextInt();
			if (num2 <= 0) {
				System.out.println("Intoruzca un numero positivo");
			}else {
				while (num2 >= 0) {
					suma = num1 + num2;
					num1 = suma;
					System.out.println("Intoduce otro numero");
					num2 = sc.nextInt();
				}
				System.out.println("--------------------------");
				System.out.println("La suma quedaria---> " + suma);
			}
		}
	}
}
