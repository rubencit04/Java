package Condicionales_02;
import java.util.Scanner;
public class _04Par_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Par/Impar----------");
		System.out.println("Introduce un numero para saber si es par/impar");
		int numero = sc.nextInt();
		int averiguar = numero %2;
		switch (averiguar) {
		case 0:
			System.out.println("Es Par");
			break;
		case 1:
			System.out.println("Es Impar");
		}
		
	}

}
