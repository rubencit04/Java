import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static final int PUERTO = 2017;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("      APLICACI�N DE SERVIDOR      ");
		System.out.println("----------------------------------");

		InputStreamReader entrada = null;
		PrintStream salida = null;
		Socket socketAlCliente = null;

		InetSocketAddress direccion = new InetSocketAddress(PUERTO);

		try (ServerSocket serverSocket = new ServerSocket()) {
			serverSocket.bind(direccion);

			int peticion = 0;

			while (true) {
				System.out.println("SERVIDOR: Esperando peticion por el puerto " + PUERTO);

				socketAlCliente = serverSocket.accept();
				System.out.println("SERVIDOR: peticion numero " + ++peticion + " recibida");

				entrada = new InputStreamReader(socketAlCliente.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);
				
				String stringRecibido = bf.readLine();
				System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);

				String[] operadores = stringRecibido.split(",");
				String operacion = operadores[0];
				double iNumero1 = Double.parseDouble(operadores[1]);
                double iNumero2 = Double.parseDouble(operadores[2]);
                double resultado = 0;
                switch (operacion) {
				case "Sumar": {
					 resultado = iNumero1 + iNumero2;
                     break;
					
				}case "Restar":{
					resultado = iNumero1 - iNumero2;
                    break;
				}case "Multiplicar":{
					resultado = iNumero1 * iNumero2;
                    break;
				}case "Dividir":
					resultado = iNumero1 / iNumero2;
                    break;
                default:
                	resultado = 000000000000000;
                }
                System.out.println("SERVIDOR: El calculo de los numeros es: " + resultado);
                salida = new PrintStream(socketAlCliente.getOutputStream());
                salida.println("Resultado: "+resultado);	
                socketAlCliente.close();
			}
			
			
		} catch (IOException e) {
			System.err.println("SERVIDOR: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("SERVIDOR: Error -> " + e);
			e.printStackTrace();
		}
	}
}
