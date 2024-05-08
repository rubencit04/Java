package _03_metodos;

//Dentro de una clase, ademas de atributos, pueden realizar funcionalidades
//que se declaran como "metodos". En POO, a las funciones se le llaman
//"metodos".Siguen las mismas reglas de las funciones dque vimos en 
//el ejemplo 02_IntroduccionJava

//Para crear un metodo en Java, se crea igual que una funcion
//pero se quita la palabra "static". Cuando creamos un metodo, el metodo
//esta dentro de un objeto, si creamos una funcion (un metodo con
//la palbara "static"), la funcion  estara fuera del objeto.


public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	public Persona() {
		
	}
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
		
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	//Los metodos van dentro de la clase, y normalmente se ponen depues
	//de los atributos y los constructores
	
	public void presentarse() {
		//"this" es la referencia al propio objeto 
		System.out.println("Mi nombre es: "+this.nombre);
		int edad = 0;
		System.out.println("Mi edad es :"+edad);
		System.out.println("Mi edad es: "+this.edad);
		//podemos poner la "edad" sin "this" siempre y cuando
		//no se haya declarado una variable o un parametro de
		//entrada con el nombre "edad"
		System.out.println("Mi peso es: "+this.peso);
		System.out.println("Estoy cadado?: "+this.estaCasado);
	}
	public void ponerEdad(int edad) {
		if (edad < 0) {
			this.edad = 0;
		}else {
			this.edad = edad;
		}
	}
	public double obtenerPesoEnLibras() {
		double pesoEnLibras = 0;
		pesoEnLibras = this.peso * 2.205;
		return pesoEnLibras;
	}
}

