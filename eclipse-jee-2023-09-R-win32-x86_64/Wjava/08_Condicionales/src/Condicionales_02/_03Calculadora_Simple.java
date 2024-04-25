package Condicionales_02;
import java.util.Scanner;

public class _03Calculadora_Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Calculadora Simple----------");
		System.out.println("--------------------------------------");
		System.out.println("---------------Comandos---------------");
		System.out.println("| Sumar---> 1                        |");
		System.out.println("| Restar---> 2                       |");
		System.out.println("| Multiplicar---> 3                  |");
		System.out.println("| Dividir---> 4                      |");
		System.out.println("| Resto de Division---> 5            |");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("Introduce el primer numero");
		double num1 = sc.nextDouble();
		System.out.println("Inroduce el segundo numero");
		double num2 = sc.nextDouble();
		System.out.println("-------------------------------------------");
		System.out.println("Selecciona la operacion que quieras hacer");
		int operacion = sc.nextInt();
		switch (operacion){
		case 1:
			System.out.println("-------Sumando-------");
			System.out.println(+num1+" + "+num2+" -----> "+suma(num1,num2));
			break;
		case 2:
			System.out.println("-------Restando-------");
			System.out.println(+num1+" - "+num2+" -----> "+resta(num1,num2));
			break;
		case 3:
			System.out.println("-------Multiplicando-------");
			System.out.println(+num1+" * "+num2+" -----> "+multi(num1, num2));
			break;
		case 4:
			System.out.println("-------Dividiendo-------");
			System.out.println(+num1+" / "+num2+" -----> "+division(num1, num2));
			break;
		case 5:
			System.out.println("-------Dividiendo para saber el Resto-------");
			System.out.println(+num1+" % "+num2+" -----> "+divisionEntera(num1, num2));
			
		}
		
		
	}

	public static double suma(double num1, double num2) {
		double suma = num1 + num2;
		return suma;
	}

	public static double resta(double num1, double num2) {
		double resta = num1 - num2;
		return resta;
	}

	public static double multi(double num1, double num2) {
		double multi = num1 * num2;
		return multi;
	}

	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	public static double divisionEntera(double num1, double num2) {
		double dive = num1 % num2;
		return dive;
	}
	
}
