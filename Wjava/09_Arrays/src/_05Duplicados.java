import java.util.Scanner;

public class _05Duplicados {

 	public static void main(String[] args) {
 		  Scanner sc = new Scanner(System.in);
 		 // Solicitar al usuario ingresar el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();

        // Crear el array con el tamaño especificado
        int[] numeros = new int[tamano];

        // Solicitar al usuario ingresar los números
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
        }

        // Eliminar duplicados
        int longitudSinDuplicados = tamano;
        for (int i = 0; i < longitudSinDuplicados; i++) {
            for (int j = i + 1; j < longitudSinDuplicados; j++) {
                // Si se encuentra un duplicado, mover los elementos restantes hacia adelante
                if (numeros[i] == numeros[j]) {
                    for (int k = j; k < longitudSinDuplicados - 1; k++) {
                        numeros[k] = numeros[k + 1];
                    }
                    longitudSinDuplicados--;
                    j--;
                }
            }
        }

        // Imprimir el nuevo array sin duplicados
        System.out.print("Nuevo array sin duplicados: ");
        for (int i = 0; i < longitudSinDuplicados; i++) {
            System.out.print(numeros[i] + " ");
        }
	}

}
