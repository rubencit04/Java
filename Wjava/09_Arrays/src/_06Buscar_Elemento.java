
import java.util.Scanner;

public class _06Buscar_Elemento {

	public static void main(String[] args) {
		int[] numeros = {2,7,1,33,27};
		System.out.println("---Buscar elementos---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para ver si se ecuentra");
		int numero = sc.nextInt();
		int i = 0;
		boolean esta = false;
		System.out.println("-------------------------------------------");
		for(i = 0;i< numeros.length;i++) {
			if(numero == numeros[i]) {
				esta = true;
			}
			
		}
		
		if(esta) {
			System.out.println(numero+" coincide con el array");
	}else {
		System.out.println(numero+" no coincide en el array");
	}
	//Otra forma
		System.out.println("---Otra forma---");
		for(i = 0; i< numeros.length;i++) {
			if(numero == numeros[i]) {
				System.out.println(numero+" coincide con el array");
				break;
			}
		}
		if(i == numeros.length) {
			System.out.println(numero+" no coincide en el array");
		}
	
	}
	}