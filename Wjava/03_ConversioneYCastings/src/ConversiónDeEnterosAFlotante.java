
public class ConversiónDeEnterosAFlotante {

	public static void main(String[] args) {
		//Flotante A Entero
		int entero = 5;
		float flotante = 313F;
		//entero = flotante;//Error
		entero = (int)flotante;//Casting
		System.out.println(entero);//Al ejecutar el programa perdemos informacion
		
		
		//Entero A Flotante
		entero = 10;
		flotante = 88F;
		flotante = entero;//No hace falta hacer el casting ya que float es mas grande que un int
		System.out.println(flotante);//Al ejecutar el programa NO perdemos informacion
		
		
		//Entero A Double
		entero = 15;
		double doble = 94.9;
		doble = entero;//No hace falta hacer el casting
		System.out.println(doble);//Al ejecutar el programa NO perdemos informacion
		
		
		//Double A Entero
		entero = 0;
		doble = 62.9;
		//entero = doble;//Error
		entero = (int)doble;//Casting
		System.out.println(entero);//Al ejecutar el programa SI perdemos informacion
		
		
		//Entero A Char
		char letra = 'A';
		entero = 69;
		//letra = entero;//Error
		letra = (char)entero;//Casting
		System.out.println(letra);//Al ejecutar el programa NO perdemos informacion
		
		
		//Char A Entero
		letra = 'B';
		entero = 1;
		entero = letra;//No hace falta hacer el Casting
		System.out.println(entero);//No perdemos informacion
		
		
		//Entero A String
		String cadena = "Hola";
		entero = 50;
		//cadena = entero;//Error
		//cadena = (string)entero;//Error
		//No se puede pasar de un string a ningun numero ni si quiera haciendo el casting
		
		
		//Char A String
		letra = 'C';
		cadena = "Adios";
		//cadena = letra;//Error
		//cadena = (string)letra;//Error
		//No podemos ni haciendo un casting
		
	}

}
