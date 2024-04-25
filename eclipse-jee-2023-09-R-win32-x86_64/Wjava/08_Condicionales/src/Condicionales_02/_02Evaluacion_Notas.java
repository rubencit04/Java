package Condicionales_02;

import java.util.Scanner;

public class _02Evaluacion_Notas {

	public static void main(String[] args) {
		System.out.println("----------Evaluacion de Notas---------");
		System.out.println("Introduzca la calificacion (0/100)");
		System.out.println("----------------------------------");
		nota();
	}
	public static void nota() {
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		String nota1 = (nota < 50)? "Estas suspenso": "Estas aprobado"; 
		System.out.println(nota1);
	}
	
}
