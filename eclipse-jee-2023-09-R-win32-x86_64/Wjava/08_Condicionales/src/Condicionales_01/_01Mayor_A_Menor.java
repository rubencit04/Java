package Condicionales_01;
import java.util.Scanner;

public class _01Mayor_A_Menor {

	public static void main(String[] args) {
		System.out.println("-------------------------------Mayor a Menor---------------------------------");
		System.out.println("Este programa te dira cual numero es mayor, menor de los 2 o si es igual");
		System.out.println("-----------------------------------------------------------------------------");
		funcion();
		
	}
	
	public static void funcion () {
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el 1º numero");
			double num1 = sc.nextDouble();
			System.out.println("Introduce el 2º numero");
			double num2 = sc.nextDouble();
			System.out.println("-----------------------------------------------------------------------------");
			if (num1 == num2) {
				System.out.println("Los dos numeros son iguales");
			}
			else if(num1 > num2) {
				System.out.println("El numero "+num1+" es mayor que "+num2);
			}
			else if(num1 < num2) {
				System.out.println("El numero "+num1+" es menor que "+num2);
			}
	}
	
	
}
