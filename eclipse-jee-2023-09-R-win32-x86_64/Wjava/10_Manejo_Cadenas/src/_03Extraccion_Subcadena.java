import java.util.Scanner;

public class _03Extraccion_Subcadena {

	public static void main(String[] args) {
		System.out.println("---Longitud de una cadena---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String Cadena = sc.nextLine();
		System.out.println("Introduce el primer indice");
		int indice1 = sc.nextInt();
		System.out.println("Introduce el segundo indice");
		int indice2 = sc.nextInt();
		System.out.println("La sub cadena es---> "+Cadena.substring(indice1,indice2+1));
	}

}	
