package _04_ayuda_eclipse;

public class _01_MainEclipse {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Pepe");
		Persona p3 = new Persona("Pepin", 15, 56, false);
		
		//Por defecto, los objetos se imrpimer con el siguiente formato
		//NOMBRE_COMPLETO_CLASE@CODIGO_HASH
		//Pero, si sibreescribimos el metodo "toString()" de la clase
		//podemos darle el formato que queramos
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
