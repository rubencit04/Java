package _04_ayuda_eclipse;

public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		super();//Esta palabra esta relacionada con la herencia
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}

	//Los IDES en general nos ayudan mucho a la creacion de codigo
	//En concreto Eclipse nos puede ayudar en la creacion de los
	//constructores
	
	//Podemos crear todos los constructores que queramos
	
	public Persona() {
	super();
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	

	//Sobreescribimos el meto toString
	//public String toString() {
	//return "Me llamo: "+this.nombre; 
	//}
	
	//Eclipse tambien nos ayuda en sobreescribir el metodo toString()
	//Para crear este constructor 
		//-> boton derecho sobre donde queremos crearlo
		//-> seleccionamos "source" 
		//-> seleccionamos "Generate toString()"
		//A continuacion elegimos los atributos con los que queremos crear
		//el metodo
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
}


