package Personas;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	private static String nombre;
	private static int edad;
	private static double peso;
	private static int opcion;
	private static HashMap<String, Persona> personas = new HashMap<>();
	public static void main(String[] args) {
		sc = new Scanner(System.in);
			menu();
			System.out.println("Introduce La Opcion");
			opcion = sc.nextInt();
		do {
			switch(opcion) {
			case 1:
				System.out.println("Introduce la edad");
				edad = sc.nextInt();
				System.out.println("Introduce el peso");
				peso = sc.nextDouble();
				System.out.println("Introduce el nombre");
				nombre = sc.next();
				verificarNombre(nombre);
				Persona p = new Persona(nombre,edad,peso);
				personas.put(p.getNombre(), p);
				System.out.println("--------------------");
				menu();
				System.out.println("Introduce La Opcion");
				opcion = sc.nextInt();
				
				break;
			case 2:
				System.out.println("Mostrando listas de personas");
				personas.forEach((k,v)->{
					System.out.println("Datos: "+v.toString());
				});
				menu();
				System.out.println("Introduce La Opcion");
				opcion = sc.nextInt();
				break;
			case 3:
				System.out.println("Escriba el nombre para buscar");
				buscarNombre();
				menu();
				System.out.println("Introduce La Opcion");
				opcion = sc.nextInt();
				break;
			case 4:
				opcion = 4;
				
			}
		}
		while(opcion != 4);
		}
	
	public static void menu() {
		System.out.println("1. Introducir Persona");
		System.out.println("2. Mostrar Personas");
		System.out.println("3. Buscar Persona Por Nombre");
		System.out.println("4. Salir del programa");
		System.out.println("-----------------------------");
	}
	
	public static void verificarNombre(String nombre) {
		personas.forEach((k,v)-> {
			if(k.equals(nombre)) {
				System.out.println("Este nombre se va a sobreescribir estas seguro(Y/N)??");
				char sobr = sc.next().charAt(0);
				if(sobr == 'y' || sobr == 'Y'){
					System.out.println("Introduce la edad");
					v.setEdad(sc.nextInt());
					System.out.println("Introduce el peso");
					v.setPeso(sc.nextDouble());
					
				}else {
					System.out.println("Operacion Cancelada");
				}
			}
		});
		
	}
	
	public static void buscarNombre() {
		String buscador = sc.next();
		personas.forEach((k,v)-> {
			if(k.equals(buscador)) {
				System.out.println("Este nombre esta en la lista");
				}else {
					System.out.println("No se ha podido encontrar el nombre indicado");
				}
			
		});
	}
}
