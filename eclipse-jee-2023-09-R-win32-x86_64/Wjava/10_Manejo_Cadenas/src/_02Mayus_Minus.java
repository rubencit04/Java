import java.util.Scanner;

public class _02Mayus_Minus {

	public static void main(String[] args) {
		System.out.println("---Mayusculas y Minusculas---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String Cadena = sc.nextLine();
		System.out.println("La cadena en mayusculas es--> "+Cadena.toUpperCase());
		System.out.println("La cadena en minusculas es--> "+Cadena.toLowerCase());
	}

}
