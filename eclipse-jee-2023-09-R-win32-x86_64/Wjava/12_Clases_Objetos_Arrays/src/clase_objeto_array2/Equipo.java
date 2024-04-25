package clase_objeto_array2;

public class Equipo {
	String nombre;
	String[] jugadores;
	
	public Equipo() {
		nombre = null;
		jugadores = null;
	}
	public Equipo(String nombre, String[] jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
	public void mostarjugadores() {
		System.out.println("Los nombre de los jugadores son: "+jugadores);
	}
	public void mostrarExistenciaJugador(String jugador) {
	    boolean existe = false;

	    for (int i = 0; i < jugadores.length; i++) {
	        if (jugadores[i].equals(jugador)) {
	            existe = true;
	            break;
	        }
	    }

	    if (existe) {
	        System.out.println("El jugador " + jugador + " existe en el equipo.");
	    } else {
	        System.out.println("El jugador " + jugador + " no existe en el equipo.");
	    }
	}
	public void numerojugadores(String[] jugadores) {
		this.jugadores = jugadores;
		int contador = 0;
		for(int i = 0;i <= jugadores.length; i++) {
		contador++;
		}
		System.out.println("El equipo tiene "+(contador-1)+" jugadores");
		
	}
	public void apto(String[] jugadores) {
		if(this.jugadores.length >= 7) {
			System.out.println("El equipo es apto hay 7 o mas jugadores");
		}else {
			System.out.println("El equipo no es apto no hay 7 jugadores");
		}
		
	}
	public void mostrarListaIgualJugadores(String[] otraLista) {
	    if (this.jugadores.length != otraLista.length) {
	        System.out.println("Las listas de jugadores no son iguales.");
	        return;
	    }

	    for (int i = 0; i < this.jugadores.length; i++) {
	        if (!this.jugadores[i].equals(otraLista[i])) {
	            System.out.println("Las listas de jugadores no son iguales.");
	            return;
	        }
	    }

	    System.out.println("Las listas de jugadores son iguales.");
	}

	public void mostrarEquipoIgual(Equipo otroEquipo) {
	    if (!this.nombre.equals(otroEquipo.nombre)) {
	        System.out.println("Los equipos no son iguales.");
	        return;
	    }

	    if (this.jugadores.length != otroEquipo.jugadores.length) {
	        System.out.println("Los equipos no son iguales.");
	        return;
	    }

	    for (int i = 0; i < this.jugadores.length; i++) {
	        if (!this.jugadores[i].equals(otroEquipo.jugadores[i])) {
	            System.out.println("Los equipos no son iguales.");
	            return;
	        }
	    }

	    System.out.println("Los equipos son iguales.");
	}
} 
