import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class SocketCliente {
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) {
		System.out.println("        APLICACI�N CLIENTE         ");
		System.out.println("-----------------------------------");		
		
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		try (Scanner sc = new Scanner(System.in);){

			boolean continuar = true;			
			
			do {		
				 System.out.println("Seleccione una operación:");
	             System.out.println("1. Sumar");
	             System.out.println("2. Restar");
	             System.out.println("3. Multiplicar");
	             System.out.println("4. Dividir");
	             System.out.println("5. Salir");System.out.println("---------------------------");
	             int opcion = sc.nextInt();
	             if(opcion == 5) {
	            	 continuar = false;
	            	 break;
	             }
				System.out.println("Introduzca el primer número:");
                double numero1 = sc.nextDouble();
                System.out.println("Introduzca el segundo número:");
                double numero2 = sc.nextDouble();
                sc.nextLine();
                String operacion = "";
                switch (opcion) {
                    case 1:
                        operacion = "Sumar";
                        break;
                    case 2:
                        operacion = "Restar";
                        break;
                    case 3:
                        operacion = "Multiplicar";
                        break;
                    case 4:
                        operacion = "Dividir";
                        break;
                }
                String mensaje = operacion + "," + numero1 + "," + numero2;
                Socket socketAlServidor = new Socket();
                socketAlServidor.connect(direccionServidor);
                System.out.println("CLIENTE: Esperando a que el servidor acepte la conexi�n");
				System.out.println("CLIENTE: Conexion establecida... a " + IP_SERVER 
						+ " por el puerto " + PUERTO);
				PrintStream salida = new PrintStream(socketAlServidor.getOutputStream());
				salida.println(mensaje);
                System.out.println("CLIENTE: Esperando al resultado del servidor...");	
                InputStreamReader entrada = new InputStreamReader(socketAlServidor.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);
				String resultado = bf.readLine();
				System.out.println("CLIENTE: El resultado es: " + resultado);
				System.out.println("¿Quiere continuar? (S/N)");
                String sContinuar = sc.nextLine();
                if (sContinuar.equalsIgnoreCase("n")) {
                    continuar = false;
                }
                socketAlServidor.close();
				
			} while (continuar);			
		}catch (UnknownHostException e) {
			System.err.println("CLIENTE: No encuentro el servidor en la direcci�n" + IP_SERVER);
			e.printStackTrace();
			
		} catch (IOException e) {
			System.err.println("CLIENTE: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("CLIENTE: Error -> " + e);
			e.printStackTrace();
		}
		
		System.out.println("CLIENTE: Fin del programa");
	}
}

