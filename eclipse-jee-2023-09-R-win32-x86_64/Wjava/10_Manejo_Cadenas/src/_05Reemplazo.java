import java.util.Scanner;

public class _05Reemplazo {

	public static void main(String[] args) {
		System.out.println("---Reemplazo Cadenas---");
		Scanner sc = new Scanner(System.in);
		String cadena = "Hola beba, ¿cómo tú te llamas, te llamas?";
		System.out.println("La cadena es la siguiente---> "+cadena);
		System.out.println("------------------------------------------------");
		System.out.println("Que letra quieres cambiar");
		char cambiar = sc.next().charAt(0);
		System.out.println("Por que letra quieres que se reemplace");
		char remplazar = sc.next().charAt(0);
		System.out.println("-------------------------------------------------");
		System.out.println("La nueva cadena quedaria---> "+cadena.replace(cambiar, remplazar));
	}

}
