import java.util.Scanner;

public class _09Eliminar_Elemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     // Array predefinido
        int[] array = {2, 5, 8, 5, 3, 5, 7};

        // Mostrar el array original
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Solicitar al usuario ingresar el valor a eliminar
        System.out.print("Ingresa el valor a eliminar: ");
        int valorEliminar = sc.nextInt();

        // Eliminar todas las ocurrencias del valor en el array
        int cantidadEliminar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorEliminar) {
                cantidadEliminar++;
            }
        }

        // Crear un nuevo array con el tamaño ajustado
        int[] nuevoArray = new int[array.length - cantidadEliminar];
        int indiceNuevoArray = 0;

        // Copiar los elementos al nuevo array, excluyendo las ocurrencias del valor a eliminar
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valorEliminar) {
                nuevoArray[indiceNuevoArray] = array[i];
                indiceNuevoArray++;
            }
        }

        // Mostrar el array resultante
        System.out.print("Array después de eliminar " + valorEliminar + ": ");
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
        System.out.println();
    }
}
