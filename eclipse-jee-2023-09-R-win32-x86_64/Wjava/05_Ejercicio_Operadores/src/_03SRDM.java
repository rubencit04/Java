import java.util.Scanner;

public class _03SRDM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Calculador de suma, resta, divison y multiplicacion");
		System.out.println("----------------------------------------------------");
		System.out.println("Introduzca el numero que quieres que tenga");
		double num1 = sc.nextDouble();
		System.out.println("Introduzca el otro num que quieres que tenga");
		double num2 = sc.nextDouble();
		
		double suma = num1 + num2;
		double resta = num1 - num2;
		double multi = num1 * num2;
		double div = num1 / num2;
		System.out.println("La suma de "+num1+" y de "+num2+" es "+suma);
		System.out.println("La resta de "+num1+" y de "+num2+" es "+resta);
		System.out.println("La multiplicacion de "+num1+" y de "+num2+" es "+multi);
		System.out.println("La division de "+num1+" y de "+num2+" es "+div);
		
	}

}
