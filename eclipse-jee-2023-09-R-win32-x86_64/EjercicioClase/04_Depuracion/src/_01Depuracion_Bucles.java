import java.util.Scanner;

public class _01Depuracion_Bucles {

	public static void main(String[] args) {
		//Podemos depurar sentencias de control con la misma
		//metodologia
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num1 = sc.nextInt();
		if(num1==0) {
			int num2 = 56;
			System.out.println("El numero es 0");
		}
		
		for(int i = 0; i <=10;i++) {
			System.out.println("La variable del control de bucle es: "+i);
			if(i == 50) {
				System.out.println(12/num1);
			}
		}
		
		System.out.println("Fin de programa");
	}

}
