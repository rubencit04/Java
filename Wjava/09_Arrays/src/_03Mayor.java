import java.util.Scanner;

public class _03Mayor {

	public static void main(String[] args) {
		System.out.println("---Mayor elemento---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int num1 = 0;
		int i = 0;
		int[] arrayNumeros = new int[cantidad];
		
		System.out.println("Cantidad del array es de---> " + cantidad);
		System.out.println("--------------------------------------");
		for (i = 0; i < cantidad; i++) {
			System.out.println("Introduce un valor");
			arrayNumeros[i] = sc.nextInt();
			if(arrayNumeros[i]>num1) {
				num1 = arrayNumeros[i];
			}
							
		}
		System.out.println("---------------------------");
		System.out.println("El mayor del array es "+num1);
	
		
			
			
		}
}
