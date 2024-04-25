import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("----------------Ejercicio3----------------");
		imprimir();
		
		

	}

	public static void  imprimir(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Esribe el primer numero");
		double numero1 = sc.nextDouble();
		System.out.println("Esribe el segundo numero");
		double numero2 = sc.nextDouble();
		String seguir;
		System.out.println("------------------------------------------------------------------");
		System.out.println("Suma---> "+calculadoraSuma(numero1,numero2));
		sc.nextLine();
		sc.nextLine();
		System.out.println("Resta---> "+calculadoraResta(numero1,numero2));
		sc.nextLine();
		System.out.println("Multiplicacion---> "+calculadoraMultiplicacion(numero1,numero2));
		sc.nextLine();
		System.out.println("Division---> "+calculadoraDiv(numero1,numero2));
		System.out.println("------------------------------------------------------------------");
}
	public static double calculadoraSuma(double num1,double num2) {
		double suma = num1 + num2;
		return  suma;
	}
	public static double calculadoraResta(double num1,double num2) {
		double resta = num1 - num2;
		return resta;
	}
	public static double calculadoraMultiplicacion (double num1,double num2) {
		double multi = num1 * num2;
		return multi;
	}
	public static double calculadoraDiv(double num1,double num2) {
		double div = num1 - num2;
		return div;
	}
}
