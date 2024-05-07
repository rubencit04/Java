package _02_constructores;

//Siempre que queramos construir un objeto, necesitamos de la aydua de lo
//que se conoce como "Constructor"

//Un Constructor en POO es un metodo especial el cual se usa para la creacion
//de los objetos. Es imperativo usar siempre algun constructor para crear un 
//objeto.

//En java se permite crear mas de un constructor. El constructor de un objeto
//en java, sigue la misma regla que los metodos, es decir, la firma de un
//metodo o funcion se puede extrapolar al constructor, perio no podemos cambiar
//el nombre del constructor. EL nombre del constructor SIEMPRE tendra que ser
//el nombre de la clase. Los constructores cuando se crean no devuelven NADA,
//ni siquiera "void"
public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	//En java, si no creamos un constructor, la JVM de java nos proporcionara
	//el llamado "constructor por defecto", que es un constructor sin parametros
	//de entrada.
	
	//El constructor por defecto el siguiente:
	public Persona() {
		//Este seria el constructor por defecto que crea java automaticamente
		//un constructor VACIO
		//OJO!!! Siempre y cuando NO creemos mas constructores
		//Dicho de otra manera, si nosotros no creamos constuctor, java
		//creara el constructor por defecto, en cuanto creemos un constructor
		//java NO creara ningun constructor mas.
		
		//Podemos alterar el comportamiento de un constructor
		System.out.println("Objeto creado");
		
		//Normalmente podemos alterar el comportamiento de un constructor
		//cuando queremos que todos los valores de los objetos empiecen
		//igual
		edad = 18;//De esta manera TODOS los objetos tendran la edad
		//de 18 cuando invoquemos este constructor
		
		this.edad = 18;
	}
	//Podemos tener todos los constructores que queramos, es decir
	//los constructores se pueden SOBRECARGAR	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		//Aqui tenemos un problema, cuando declaramos una variable dentro
		//de un constructor, con el mismo nombre que el atributo, tapamos
		//la visibilidad del atributo.
		
		//Aqui no estamos accediendo al atributo 'nombre', estamos accediendo
		//al parametro de entrada 'nombre'
		//nombre = "Felix";
		//edad = 18;
		
		//Para romper esta problematica podemos usar la palabra reservada "this"
		
		//"this" es una referencia al propio objeto
		//De momento vamos a usar "this" para acceder a los atributos de un objeto
		this.nombre = nombre;
		//El primer nombre es el atributo, el segundo nombre es el parametro
		//de entrada
		
		//Se considera buena practica de programacion referirse a los atributos
		//con "this"
		
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
		
	}
	
	//Constructor solo con el nombre
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	//Aunque ela tributo "apellido" existiera, este constructor
	//no se podria crear porque tiene la misma firma que el constructor
	//del nombre (el de arriba)
	//public Persona (String apellido) {
	//this.apellido = apellido; }
	
}