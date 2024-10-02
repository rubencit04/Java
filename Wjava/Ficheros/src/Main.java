import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static final String NOMBRE_FICHERO = "usuarios.txt";

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File fn = new File("usuarios.txt");// Apuntar al fichero definido de manera relativa
		if (!fn.exists()) {// Averiguamos si existe
			//Creamos el fichero
			fn.createNewFile();
			//También podemos crear un directorio, normalmente le quitamos la 
			//extension al fichero (fn)
			// fn.mkdir();
			System.out.println("Creado el archivo " + fn.getName());
		}
		System.out.println("Ingrese el usuario");
		String usuario = sc.nextLine();
		System.out.println("-----------");
		System.out.println("Ingrese la contraseña");
		String contraseña = sc.nextLine();
		
		if (validarUsuario(usuario, contraseña)) {
            System.out.println("¡Bienvenido " + usuario + "!");
            System.out.println("¿Desea agregar un nuevo usuario? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                agregarNuevoUsuario(sc);
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        

		

	}
	
	 public static boolean validarUsuario(String usuario, String password) {
	        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_FICHERO))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split("/");
	                if (partes[0].equals(usuario) && partes[1].equals(password)) {
	                    return true;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error al leer el fichero: " + e.getMessage());
	        }
	        return false;
	    }
	 
	 private static void agregarNuevoUsuario(Scanner scanner) {
	        System.out.print("Ingrese el nuevo nombre de usuario: ");
	        String nuevoUsuario = scanner.nextLine();
	        System.out.print("Ingrese la contraseña para el nuevo usuario: ");
	        String nuevoPassword = scanner.nextLine();

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_FICHERO, true))) {
	            bw.write(nuevoUsuario + "/" + nuevoPassword);
	            bw.newLine();
	            System.out.println("Usuario agregado exitosamente.");
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el fichero: " + e.getMessage());
	        }
	    }
	}
	