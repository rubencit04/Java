import java.util.Scanner;

public class _01Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Suma de elementos en array---");
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int suma = 0;
		 int[] arrayNumeros = new int[cantidad];
		 System.out.println("Cantidad del array es de---> "+cantidad);	
		 System.out.println("--------------------------------------");
		 for(int i = 0; i < cantidad;i++) {
			 System.out.println("Introduce un numero");
			 arrayNumeros[i] = sc.nextInt();
			 suma += arrayNumeros[i];	
			
			 }
		 System.out.println("------------------");
		 System.out.println("La suma de es---> "+suma);
	}

}
