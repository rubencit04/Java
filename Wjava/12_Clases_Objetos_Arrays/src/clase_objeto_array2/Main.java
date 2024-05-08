package clase_objeto_array2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el nombre del primer equipo");
		e1.nombre = sc.next();
		System.out.println("-----------------------------------------");
		System.out.println("Escriba cuantos jugadores tiene el primer equipo");
		int jugadores = sc.nextInt();
		System.out.println("-----------------------------------------");
		String[] nombres = new String[jugadores];
		System.out.println("Escriba el nombre del jugador");
		nombres[0] = sc.next();
		System.out.println("-----------------------------------------");
		for(int i = 1; i <= nombres.length-1;i++) {
			System.out.println("Escribe el otro nombre del jugador");
			nombres[i] = sc.next();
		}
		System.out.println("-----------------------------------------");
		System.out.println("Escriba el nombre del segundo equipo");
		e2.nombre = sc.next();
		System.out.println("-----------------------------------------");
		System.out.println("Escriba cuantos jugadores tiene el primer equipo");
		 jugadores = sc.nextInt();
		 System.out.println("-----------------------------------------");
		String[] nombres2 = new String[jugadores];
		System.out.println("Escriba el nombre del jugador");
		nombres2[0] = sc.next();
		for(int i = 1; i <= nombres2.length-1;i++) {
			System.out.println("Escribe el otro nombre del jugador");
			nombres2[i] = sc.next();
		}
		System.out.println("-----------------------------------------");
		e1.toString();
		e2.toString();
		System.out.println("-----------------------------------------");
		e1.mostrarExistenciaJugador("cr7");
		e2.mostrarExistenciaJugador("messi");
		System.out.println("-----------------------------------------");
		e1.mostarjugadores();
		e2.mostarjugadores();
		System.out.println("-----------------------------------------");
		e1.numerojugadores(nombres);
		e2.numerojugadores(nombres);
		System.out.println("-----------------------------------------");
		e1.apto(nombres);
		e2.apto(nombres);
		System.out.println("-----------------------------------------");
		e1.mostrarListaIgualJugadores(nombres2);
		System.out.println("-----------------------------------------");
		e1.mostrarEquipoIgual(e2);
	}
	
}
