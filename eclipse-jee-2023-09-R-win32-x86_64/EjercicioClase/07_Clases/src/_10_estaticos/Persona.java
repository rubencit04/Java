package _10_estaticos;

public class Persona {
	public static String nombre;
	public int edad;
	
	public static int numeroPersonas;
	
	public Persona() {
		super();
	}
	
	public boolean esMayorEdad() {
		System.out.println("El numero personas "+numeroPersonas);
		if(this.edad >=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void imprimirNumeroPersonas() {
		System.out.println(numeroPersonas);
		//this.edad;
		//edad
	}
	
	public static void imprimirEdad() {
		//System.out.println(this.edad);
		//System.out.println(edad);
		
	}
}
