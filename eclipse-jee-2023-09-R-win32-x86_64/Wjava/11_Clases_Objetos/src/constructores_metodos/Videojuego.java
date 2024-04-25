package constructores_metodos;

public class Videojuego {
	String id;
	String nombre;
	int puntuacion;
	double precio;
	String fecha;
	boolean s_mano;

	public Videojuego() {
		this.fecha = "01/01/1970";
	}

	public Videojuego(String id, String nombre, int puntuacion, double precio, String fecha, boolean s_mano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha = fecha;
		this.s_mano = s_mano;
	}

	public Videojuego(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public void Imprimir() {
		System.out.println("Id: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Puntuacion: " + this.puntuacion);
		System.out.println("Precio: " + this.precio);
		System.out.println("Segunda mano??: " + this.s_mano);

	}

	public void ImprimirNP() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Puntuacion: " + this.puntuacion);
	}

	public void libras() {
		double libras = 0;
		libras = this.precio * 0.74;
		System.out.println("Precio en libras: " + libras);
	}

	public String invertirfecha(String fecha) {
		System.out.println("Fecha en YYYY-MM-DD " + this.fecha);
		 String[] partesFecha = this.fecha.split("/");
		 String nuevaFecha = partesFecha[2] + "-" + partesFecha[1] + "-" + partesFecha[0];
	     return nuevaFecha;
	}
	 public void fecha() {
	        // Utilizar el método invertirFormatoFecha() si se desea mostrar en formato "YYYY-MM-DD"
	        System.out.println("Fecha en formato YYYY-MM-DD: " + invertirfecha(fecha));
	    }

	public void rebaja() {
		if (this.s_mano == true) {
			double rebaja = this.precio * 0.3;
			double resultado = this.precio - rebaja;
			System.out.println("Como el juego es de segunda mano recibes un 30% de descuento!!!");
			System.out.println("Precio rebajado: " + resultado);
		} else {
			System.out.println("Precio del juego: " + this.precio);
		}

	}

	public void apto() {
		if (this.puntuacion >= 5) {
			System.out.println("El juego es apto para jugar");

		} else {
			System.out.println("Este videojuego no es apto para jugar");
		}
	}

	public void naturales() {
		System.out.println("Numeros naturales desde " + this.puntuacion + " hasta 10");
		for (int i = this.puntuacion; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public boolean devolver(Videojuego v) {
		//TODO hay que comparar el precio de estte videojuego (this) con el precio del videojugo (v)
			if (v.precio > this.precio) {
				return true;
			}else {
				return false;
			}
			
		
	}
}
