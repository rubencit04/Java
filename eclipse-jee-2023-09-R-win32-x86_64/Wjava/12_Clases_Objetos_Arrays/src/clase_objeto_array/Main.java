
package clase_objeto_array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        usuario[] usuarios = new usuario[3];

        
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Introduce los datos para el Usuario " + (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Nombre: ");
            String nombre = scanner.next();

            System.out.print("Número de Valoraciones: ");
            int numValoraciones = scanner.nextInt();
            int[] valoraciones = new int[numValoraciones];

            System.out.println("Introduce las valoraciones (del 1 al 10):");
            for (int j = 0; j < numValoraciones; j++) {
                System.out.print("Valoración " + (j + 1) + ": ");
                valoraciones[j] = scanner.nextInt();
            }

            
            usuarios[i] = new usuario(id, nombre, valoraciones);
        }

        
        for (usuario usuario : usuarios) {
            System.out.println("Información del usuario:");
          
            System.out.println("Valoración Media: " + usuario.obtenerValoracionMedia());
            usuario.mostrarTodasLasValoraciones();

            int valoracionLimite = 5;
            System.out.println("Cantidad de Valoraciones que superan " + valoracionLimite + ": " +
                               usuario.contarValoracionesSuperiores(valoracionLimite));

            int valoracionEvaluada = 6;
            System.out.println("La valoración " + valoracionEvaluada + " supera la media: " + usuario.valoracionSuperaMedia(valoracionEvaluada));
        }

        
    }
}