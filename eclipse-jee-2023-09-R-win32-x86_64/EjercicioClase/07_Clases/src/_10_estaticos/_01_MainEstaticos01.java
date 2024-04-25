package _10_estaticos;

public class _01_MainEstaticos01 {
	private int atributo1;
	private static int atributo2;
	public static void main(String[] args) {
		presentarse();
		
		//presentarseDinamicamente();
		_01_MainEstaticos01 me = new _01_MainEstaticos01();
		me.presentarseDinamicamente();
		//atributo1 = 9; No se puede
		me.atributo1 = 9;//Asi si se puede 
		
		atributo2 = 10;
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona.numeroPersonas = 2;
	}
	public static void presentarse() {
		atributo2 = 10;
		System.out.println("Hola parte estatica");
	}
	
	public void presentarseDinamicamente() {
		atributo1 = 9;
		this.atributo1 = 9;
		
		atributo2 = 23	;
		_01_MainEstaticos01.atributo2 = 34;
		System.out.println("Hola parte dinamica");
	}
	
}
