import java.util.Scanner;

public class _04Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Calculador de una media");
		System.out.println("----------------------------------------------------");
		System.out.println("Introduzca el numero que quieres que tenga");
		double num1 = sc.nextDouble();
		System.out.println("Introduzca el segundo numero que quieres que tenga");
		double num2 = sc.nextDouble();
		System.out.println("Introduzca el tercer numero que quieres que tenga");
		double num3 = sc.nextDouble();
		double media = (num1+num2+num3)/3;
		
		System.out.println("La media de "+num1+" de "+num2+" y "+num3+" es "+media);

	}

}
