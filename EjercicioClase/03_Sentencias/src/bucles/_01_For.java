package bucles;

public class _01_For {

	//Existen otro tipo de sentencias de control que sirven para alterar al flujo
	//normal de ejecucion de un programa que son los bucles o sentencias repetitivas
	
	//Con la sentencias "for" podemos repetir un bloque de codigo de 1 a N veces
	
	public static void main(String[] args) {
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("Hola en este tema vamos a hablar de bulces");
		
		//Para hacer repeticiones mejor usamos un bucle, en este caso vamos a 
		//hacerlo con el bucle "for"
		//Para hacer un bucle fro usaremos la parabra reservada for
		//Dentro de la estructura for podemos encontar las siguientes partes
		//1. Inicio de la variable de control de bucle normalmente una variable entera int
		//2. Condicion de ejecucion de bucle. Es decir cuando se tiene que seguir
		//ejecutandp el bucle. Es una expresion booleana
		//3.Incremento de la variable de control de bucle
		//Estas tres partes de la variable entre parentesis y separadas por ";"
		System.out.println("--------For-------");
		for(int i = 1; i <=10;i++)
		System.out.println("Hola en este tema vamos a hablar de bulces");
		System.out.println("--------For100K-------");
		for(int i = 1; i <=100_000;i++)
		System.out.println("Hola en este tema vamos a hablar de bulces");
		
		//Es habitual 
		System.out.println("------------For con bloque----------");
		for (int i =1; i <=1000;i++) {
			System.out.println("Hola en este bucle");
			System.out.println("Vamos a ejecutar varias sentencias");
		}
		System.out.println("------------For usando la variable de control----------");
		for (int i =1; i <=1000;i++) {
			System.out.println("Hola este bucle lo hemos ejecutado "+ i);
			System.out.println("Vamos a ejecutar varias sentencias");
		}//Cuandp salgamos del bucle la variable de control que hayamos
		//creado morira.
		// System.out.println("No puedo acceder a la variable i" + i);
		
		//Imprimir solo los pares
		for (int i = 0; i <=1000; i +=2) {
			System.out.println("Hola este bucle lo hemos ejecutado " + i);
			//i++;//No es buena practica alterar la variable de control de bucle
			//fuera del "for"
		}
			//Normalmente usamos la palabra "iteracion" para referirnos a cada 
			//salto del bucle
		
			//Todas las partes del "for" son optativas
		for (;;) {
			//OJO, cuidado con bucles que no paran porque 
			//podemos hacer un bucle infinito
			System.out.println("Esto es un bucle infinito");
		}
			
		
		
		
		

	}

}
