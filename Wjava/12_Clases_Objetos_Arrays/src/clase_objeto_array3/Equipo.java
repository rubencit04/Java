package clase_objeto_array3;


import java.util.List;

public class Equipo {
    String nombre;
    List<String> jugadores;

    public Equipo() {
        nombre = null;
        jugadores = null;
    }

    public Equipo(String nombre, List<String> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
    }

    public void mostarjugadores() {
        System.out.println("Los nombre de los jugadores son: " + jugadores);
    }

    public void mostrarExistenciaJugador(String jugador) {
        boolean existe = jugadores.contains(jugador);

        if (existe) {
            System.out.println("El jugador " + jugador + " existe en el equipo.");
        } else {
            System.out.println("El jugador " + jugador + " no existe en el equipo.");
        }
    }

    public void numerojugadores(List<String> jugadores) {
        this.jugadores = jugadores;
        int contador = jugadores.size();
        System.out.println("El equipo tiene " + contador + " jugadores");
    }

    public void apto(List<String> jugadores) {
        if (this.jugadores.size() >= 7) {
            System.out.println("El equipo es apto, hay 7 o mas jugadores");
        } else {
            System.out.println("El equipo no es apto, no hay 7 jugadores");
        }
    }

    public void mostrarListaIgualJugadores(List<String> otraLista) {
        if (this.jugadores.size() != otraLista.size()) {
            System.out.println("Las listas de jugadores no son iguales.");
            return;
        }

        for (int i = 0; i < this.jugadores.size(); i++) {
            if (!this.jugadores.get(i).equals(otraLista.get(i))) {
                System.out.println("Las listas de jugadores no son iguales.");
                return;
            }
        }

        System.out.println("Las listas de jugadores son iguales.");
    }

    public void mostrarEquipoIgual(Equipo otroEquipo) {
        if (!this.nombre.equals(otroEquipo.nombre) || this.jugadores.size() != otroEquipo.jugadores.size()) {
            System.out.println("Los equipos no son iguales.");
            return;
        }

        for (int i = 0; i < this.jugadores.size(); i++) {
            if (!this.jugadores.get(i).equals(otroEquipo.jugadores.get(i))) {
                System.out.println("Los equipos no son iguales.");
                return;
            }
        }

        System.out.println("Los equipos son iguales.");
    }
}
