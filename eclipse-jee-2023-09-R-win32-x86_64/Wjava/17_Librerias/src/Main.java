import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matematicas mat = new Matematicas();
		double num1;
		double num2;
		System.out.println("---Calculadora---");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("-----------------");
		System.out.println("Selecciona la opcion");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Escribe el primer numero para sumar");
			num1 = sc.nextDouble();
			System.out.println("Escribe el segundo numero para sumar");
			num2 = sc.nextDouble();
			System.out.println(mat.sumar(num1, num2));
			break;
		case 2:
			System.out.println("Escribe el primer numero para restar");
			num1 = sc.nextDouble();
			System.out.println("Escribe el segundo numero para restar");
			num2 = sc.nextDouble();
			System.out.println(mat.restar(num1, num2));
			break;
		case 3:
			System.out.println("Escribe el primer numero para multiplicar");
			num1 = sc.nextDouble();
			System.out.println("Escribe el segundo numero para multiplicar");
			num2 = sc.nextDouble();
			System.out.println(mat.multiplicar(num1, num2));
			break;
		case 4:
			System.out.println("Escribe el primer numero para dividir para dividir");
			num1 = sc.nextDouble();
			System.out.println("Escribe el segundo numero para dividir");
			num2 = sc.nextDouble();
			System.out.println(mat.dividir(num1, num2));
			
			default:
				System.out.println("Escribe un numero valido del 1-4");
		}
		
			


		



	}

	

}
