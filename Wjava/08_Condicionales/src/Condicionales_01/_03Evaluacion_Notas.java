package Condicionales_01;
import java.util.Scanner;

public class _03Evaluacion_Notas {

	public static void main(String[] args) {
		System.out.println("----------Evaluacion de Notas---------");
			System.out.println("Introduzca la calificacion (0/100)");
			System.out.println("----------------------------------");
			nota();
	}
	
	public static void nota () {
	Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		
		if(nota > 100 || nota < 0) {
			System.out.println("Imposible la nota mimina es de 0 y la maxima es de 100");
		}
		else if(nota >= 50) {
			System.out.println("Aprobado");
		}
		else if(nota < 50) {
			System.out.println("Suspenso");
	
		}
	
	}
}
