import java.util.Scanner;

public class _08Multipicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Multiplicacion de elementos en array---");
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int multi = 1;
		 int[] arrayNumeros = new int[cantidad];
		 System.out.println("Cantidad del array es de---> "+cantidad);	
		 System.out.println("--------------------------------------");
		 for(int i = 0; i < cantidad;i++) {
			 arrayNumeros[i] = sc.nextInt();
			 multi *= arrayNumeros[i];	
			
			 }
		 System.out.println("------------------");
		 System.out.println("La multiplicacion de es---> "+multi);
	}

}
