package clase_objeto_array3;

import java.util.ArrayList;
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
        e1.jugadores = new ArrayList<>();

        for (int i = 0; i < jugadores; i++) {
            System.out.println("Escribe el nombre del jugador");
            e1.jugadores.add(sc.next());
        }

        
        System.out.println("-----------------------------------------");
        System.out.println("Escriba el nombre del segundo equipo");
        e2.nombre = sc.next();
        System.out.println("-----------------------------------------");
        System.out.println("Escriba cuantos jugadores tiene el segundo equipo");
        jugadores = sc.nextInt();
        System.out.println("-----------------------------------------");
        e2.jugadores = new ArrayList<>();

        for (int i = 0; i < jugadores; i++) {
            System.out.println("Escribe el nombre del jugador");
            e2.jugadores.add(sc.next());
        }

        
        System.out.println("-----------------------------------------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println("-----------------------------------------");

        
        e1.mostrarExistenciaJugador("cr7");
        e2.mostrarExistenciaJugador("messi");
        System.out.println("-----------------------------------------");

     
        e1.mostarjugadores();
        e2.mostarjugadores();
        System.out.println("-----------------------------------------");

       
        e1.numerojugadores(e1.jugadores);
        e2.numerojugadores(e2.jugadores);
        System.out.println("-----------------------------------------");

       
        e1.apto(e1.jugadores);
        e2.apto(e2.jugadores);
        System.out.println("-----------------------------------------");

        e1.mostrarListaIgualJugadores(e2.jugadores);
        System.out.println("-----------------------------------------");


        e1.mostrarEquipoIgual(e2);
    }
}
