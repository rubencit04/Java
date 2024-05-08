
package clase_objeto_array;
import java.util.Arrays;

public class usuario {
    
    private int id;
    private String nombre;
    private int[] valoraciones;

    
    public usuario() {
        this.id = 0;
        this.nombre = " ";
        this.valoraciones = new int[0]; 
    }

    
    public usuario(int id, String nombre, int[] valoraciones) {
        this.id = id;
        this.nombre = nombre;
        this.valoraciones = new int[valoraciones.length];
        for (int i = 0; i < valoraciones.length; i++) {
            this.valoraciones[i] = valoraciones[i];
        }
    }


	@Override
	public String toString() {
		return "usuarioClase [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones)
				+ "]";
	}
    
	
    public double obtenerValoracionMedia() {
        if (valoraciones.length == 0) {
            return 0.0;
        }

        int suma = 0;
        for (int valoracion : valoraciones) {
            suma += valoracion;
        }

        return suma / valoraciones.length;
    }

    
    public void mostrarTodasLasValoraciones() {
        System.out.println("Valoraciones: " + Arrays.toString(valoraciones));
    }

    
    public int contarValoracionesSuperiores(int valorLimite) {
        int contador = 0;
        for (int valoracion : valoraciones) {
            if (valoracion > valorLimite) {
                contador++;
            }
        }
        return contador;
    }

    
    public boolean valoracionSuperaMedia(int valoracion) {
        return valoracion > obtenerValoracionMedia();
    }
    
}