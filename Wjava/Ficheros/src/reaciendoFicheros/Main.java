package reaciendoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static final String NOMBRE_FICHERO = "usuarios.txt";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el usuario");
		String nombre = sc.nextLine();
		System.out.println("Escribe la contraseña");
		String pass = sc.nextLine();
		
		if(validarUsuario(nombre,pass)) {
			System.out.println("Quieres agregar nuevo usuario? 1 si 2 no");
			int num = sc.nextInt();
			if(num == 1) {
				agregarUsuario(sc);
			}
		}else {
			System.out.println("Usuario o Contraseña incorrectos");
		}
		
	}
	
	 public static boolean validarUsuario(String nombre, String pass) {
	        try {
	            FileReader fr = new FileReader(NOMBRE_FICHERO);
	            BufferedReader br = new BufferedReader(fr);
	            String frase;

	            while ((frase = br.readLine())  != null) {
	                String[] separar = frase.split("/");
	                
	                // Asegurarse de que la línea tenga ambos valores
	                if (separar.length == 2 && separar[0].equals(nombre) && separar[1].equals(pass)) {
	                    return true;
	                }
	            }
	            br.close();
	        } catch (IOException e) {
	            System.out.println("Error al leer el fichero: " + e.getMessage());
	        }
	        return false;
	    }
	 public static void agregarUsuario(Scanner scanner) {
	        System.out.print("Ingrese el nuevo nombre de usuario: ");
	        String nuevoUsuario = scanner.nextLine();
	        System.out.print("Ingrese la contraseña para el nuevo usuario: ");
	        String nuevoPassword = scanner.nextLine();

	        try {
	            FileWriter fr = new FileWriter(NOMBRE_FICHERO, true); 
	            BufferedWriter br = new BufferedWriter(fr);
	            br.write(nuevoUsuario + "/" + nuevoPassword);
	            br.newLine();
	            br.close();
	            System.out.println("Usuario agregado exitosamente.");
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el fichero: " + e.getMessage());
	        }
	    }
	}