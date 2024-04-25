import java.util.Scanner;

public class _04Invertir {

	public static void main(String[] args) {
		System.out.println("---Invertir array---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int num1 = 0;
		int i = 0;
		int[] arrayNumeros = new int[cantidad];
		int[] inversa = new int [cantidad];
		
		System.out.println("Cantidad del array es de---> " + cantidad);
		System.out.println("--------------------------------------");
		for(i = 0;i < cantidad;i++) {
			System.out.println("Introduce un numero");
			arrayNumeros[i] = sc.nextInt();
			
		}
		System.out.println("---Numeros introducidos---");
		for(i = 0; i < arrayNumeros.length;i++) {
			System.out.println(arrayNumeros[i]);
		}
		System.out.println("---Numeros invertidos---");
		for(i = 0;i < cantidad;i++) {
			  inversa[i] = arrayNumeros[cantidad-1-i];
			  System.out.println(inversa[i]);
		}
		
		
	}

}
