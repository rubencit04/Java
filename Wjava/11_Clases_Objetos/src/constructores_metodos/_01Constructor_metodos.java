package constructores_metodos;

import java.util.Scanner;

public class _01Constructor_metodos {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("123", "Black ops", 8, 40, "10/20/2010", false);
		Videojuego v3 = new Videojuego();
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Escribe el id del juego");
		v1.id = sc.next();
		System.out.println("Escribe el nombre del juego");
		v1.nombre = sc.next();
		System.out.println("Escribe la puntuacion del juego");
		v1.puntuacion = sc.nextInt();
		System.out.println("Escribe el precio del juego");
		v1.precio = sc.nextDouble();
		System.out.println("Escribe si es de segunda mano true/false");
		v1.s_mano = sc.nextBoolean();
		System.out.println("--------------------");
		v1.Imprimir();
		System.out.println("--------------------");
		v1.ImprimirNP();
		System.out.println("--------------------");
		v1.libras();
		System.out.println("--------------------");
		v1.fecha();
		System.out.println("--------------------");
		v1.rebaja();
		System.out.println("--------------------");
		v1.apto();
		System.out.println("--------------------");
		v1.naturales();
		System.out.println("--------------------");
		v1.devolver(v2);
		 
		
		
	}

}
