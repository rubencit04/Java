import java.util.Scanner;

public class _01PerímetroYArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Calculador de area y perimetro de un rectangulo");
		System.out.println("--------------------------------------------------");
		System.out.println("Introduzca la altura que quieres que tenga");
		double altura = sc.nextDouble();
		System.out.println("Introduzca la base que quieres que tenga");
		double base = sc.nextDouble();
		double perimetro = 2 * (base + altura);
		double area = altura * base;
		System.out.println("La area del rectangulo es de: "+area);
		System.out.println("El perimetro del rectangulo es de: "+perimetro);
		

		
		
		
	}

}
