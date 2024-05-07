package Condicionales_02;
import java.util.Scanner;
public class _01Mayor_A_Menor {

	public static void main(String[] args) {
		System.out.println("-------------------------------Mayor a Menor---------------------------------");
		System.out.println("Este programa te dira cual numero es mayor, menor de los 2 o si es igual");
		System.out.println("-----------------------------------------------------------------------------");
		escaner()
;	}
	public static void escaner () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introudce el primer numero para saber si es mayor,menor o igual");
		double num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero para saber si es mayor, menor o igual");
		double num2 = sc.nextInt();
		System.out.println("------------------------------------------------------------------");
		
		String total = (num1<=num2)? (num1+" es menor o igual que "+num2):(num1+" es mayor o igual que "+num2);
		System.out.println(total);
	}
}
	

