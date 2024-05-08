import java.util.Scanner;

public class _02Hipotenusa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Calculador de la hipotenusa de un triángulo rectángulo");
		System.out.println("--------------------------------------------------");
		System.out.println("Introduzca el cateto que quieres que tenga");
		double cateto1 = sc.nextDouble();
		System.out.println("Introduzca el otro cateto que quieres que tenga");
		double cateto2 = sc.nextDouble();
		
		double hipo = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
		System.out.println("La hipotenusa  del triangulo rectangulo es de: "+hipo);

	}

}