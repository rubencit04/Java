import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class JuegoServer {
    public static final int PUERTO = 2020;
    public static int puntosCliente;
    public static int puntosServer;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("      APLICACIÓN DE SERVIDOR      ");
        System.out.println("----------------------------------");

        try (ServerSocket serverSocket = new ServerSocket()) {
            serverSocket.bind(new InetSocketAddress(PUERTO));
            System.out.println("SERVIDOR: Esperando petición por el puerto " + PUERTO);

            try (Socket socketAlCliente = serverSocket.accept();
                 InputStreamReader entrada = new InputStreamReader(socketAlCliente.getInputStream());
                 BufferedReader bf = new BufferedReader(entrada);
                 PrintStream salida = new PrintStream(socketAlCliente.getOutputStream())) {

                System.out.println("SERVIDOR: Cliente recibido");
                puntosCliente = 0;
                puntosServer = 0;

                String opcionRecibida;
                while (puntosCliente < 3 && puntosServer < 3) {
                    System.out.println("Tu turno (1 para Piedra, 2 para Papel, 3 para Tijeras):");
                    String opcion = Integer.toString(sc.nextInt()); 
                    salida.println(opcion); 

                    opcionRecibida = bf.readLine();
                    String resultado = determinarGanador(opcion, opcionRecibida);
                    System.out.println(resultado);
                    salida.println(resultado);
                }

                
                if (puntosCliente == 3) {
                    System.out.println("Cliente ganador");
                    salida.println("Cliente ganador");
                } else {
                    System.out.println("Servidor ganador");
                    salida.println("Servidor ganador");
                }
                System.out.println("Partida Finalizada");
                salida.println("Partida Finalizada");

            } catch (IOException e) {
                System.err.println("Error en la conexión con el cliente: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error al iniciar el servidor: " + e.getMessage());
        }
    }

    public static String determinarGanador(String jugador1, String jugador2) {
        int j1 = Integer.parseInt(jugador1); 
        int j2 = Integer.parseInt(jugador2); 

        if (j1 == j2) {
            return "Empate";
        }

        if ((j1 == 1 && j2 == 3) || 
            (j1 == 2 && j2 == 1) || 
            (j1 == 3 && j2 == 2)) {
            puntosServer++;
            return "Servidor gana 1 punto";
        } else {
            puntosCliente++;
            return "Cliente gana 1 punto";
        }
    }
}
