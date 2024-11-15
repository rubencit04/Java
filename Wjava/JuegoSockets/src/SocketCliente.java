package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {

    public static final int PUERTO = 2020;
    public static final String IP_SERVER = "172.26.100.200";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("        PIEDRA, PAPEL, TIJERAS        ");
        System.out.println("-----------------------------------");

        InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
        try (Socket socketAlServidor = new Socket()) {
            System.out.println("Conectando...");
            socketAlServidor.connect(direccionServidor);
            System.out.println("Conectado");

            try (InputStreamReader isr = new InputStreamReader(socketAlServidor.getInputStream());
                 BufferedReader br = new BufferedReader(isr);
                 PrintStream ps = new PrintStream(socketAlServidor.getOutputStream())) {

                boolean resultado = true;

                while (resultado) {
                    int eleccion = menu();

                    System.out.println("Elección del mia: " + eleccion);

                    String eleccionJugador = br.readLine();
                    System.out.println("Eleccion ruben: " + eleccionJugador);

                    // Enviar elección al servidor
                    ps.println(eleccion);

                    // Leer respuesta del servidor
                    String cadenaRespuesta = br.readLine();
                    System.out.println("Respuesta del servidor: " + cadenaRespuesta);

                    // Verificar si se debe terminar la conexión
                    if (cadenaRespuesta.equals("Partida Finalizada")) {
                        System.out.println("Terminando conexión con el servidor...");
                        resultado = false;
                        socketAlServidor.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();  // Cerrar el scanner
        }
    }

    private static int menu() {
        System.out.println("Elige que quieres sacar:");
        System.out.println("1 - Piedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tijeras");

        int opcion;
        do {
            System.out.print("Introduce tu elección (1, 2 o 3): ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);

        return opcion;
    }
}
