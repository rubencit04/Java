

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("----------------Calculadora----------------");
		System.out.println("Sumar");
		System.out.println("La suma de numeros flotantes es de----> "+CalculadoraSuma(1.2,2.4));
		System.out.println("La suma de numeros enteros es de----> "+CalculadoraSuma(5,5));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("La resta de numeros flotantes es de----> "+CalculadoraResta(1.2,2.4));
		System.out.println("La resta de numeros enteros es de----> "+CalculadoraResta(5,5));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("La multiplicacion de numeros flotantes es de----> "+CalculadoraMulti(1.2,2.4));
		System.out.println("La multiplicacion de numeros enteros es de----> "+CalculadoraMulti(5,5));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("La division de numeros flotantes es de----> "+CalculadoraDiv(1.2,2.4));
		System.out.println("La division de numeros enteros es de----> "+CalculadoraDiv(5,5));
		System.out.println("----------------------------------------------------------------------");
	}

	public static double CalculadoraSuma(int num1,int num2) {
		double suma = num1 + num2;
		System.out.println(+suma);
		return suma;
	}
	public static double CalculadoraSuma(double num1,double num2) {
		double suma = num1 + num2;
		System.out.println(+suma);
		return suma;
	}
	public static double CalculadoraResta(int num1,int num2) {
		double resta = num1 - num2;
		System.out.println(+resta);
		return resta;
	}
	public static double CalculadoraResta(double num1,double num2) {
		double resta = num1 - num2;
		System.out.println(resta);
		return resta;
	}
	public static double CalculadoraMulti(int num1,int num2) {
		double multi = num1 * num2;
		System.out.println(multi);
		return multi;
	}
	public static double CalculadoraMulti(double num1,double num2) {
		double multi = num1 * num2;
		System.out.println(multi);
		return multi;
	}
	public static double CalculadoraDiv(int num1,int num2) {
		double Div = num1 / num2;
		System.out.println(Div);
		return Div;
	}
	public static double CalculadoraDiv(double num1,double num2) {
		double Div = num1 / num2;
		System.out.println(Div);
		return Div;
	}
}
