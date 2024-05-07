import java.util.Scanner;

public class _02Promedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Promedio de elementos en array---");
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int suma = 0;
		 int[] arrayNumeros = new int[cantidad];
		 System.out.println("Cantidad del array es de---> "+cantidad);	
		 System.out.println("--------------------------------------");
		 for(int i = 0; i < cantidad;i++) {
			 System.out.println("Introduc un numero");
			 arrayNumeros[i] = sc.nextInt();
			 suma += arrayNumeros[i];	
			
			 }
		 System.out.println("------------------");
		 System.out.println("La media de es---> "+suma/cantidad);
	}

}
