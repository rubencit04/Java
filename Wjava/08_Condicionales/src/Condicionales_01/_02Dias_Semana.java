package Condicionales_01;
import java.util.Scanner;

public class _02Dias_Semana {

	public static void main(String[] args) {
		System.out.println("----------Dias de la Semana---------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero del 1 al 7");
			int numero = sc.nextInt();
			
			if (numero == 1) {
				System.out.println("Lunes");
			}
			else if (numero ==  2) {
				System.out.println("Martes");
			}
			else if (numero == 3) {
				System.out.println("Miercoles");
			}
			else if (numero ==  4) {
				System.out.println("Jueves");
			}
			else if (numero ==  5) {
				System.out.println("Viernes");
			}
			else if (numero == 6) {
				System.out.println("Sábado");
			}
			else if (numero ==  7) {
				System.out.println("Domingo");
			}

	}

}
