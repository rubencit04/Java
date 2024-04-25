import java.util.Scanner;

public class _01Longitud {

	public static void main(String[] args) {
		System.out.println("---Longitud de una cadena---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String Cadena = sc.nextLine();
		System.out.println("La cadena tiene una longitud de--> "+Cadena.length());
	}

}
