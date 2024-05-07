import java.util.Scanner;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		// Es muy habitual en las app tener entradas de datos del usuario
		//y salidas de datos una vez procesada la informacion
		
		//En java tenemos dos maneras de presentar la informacion:
		//1. System.out -> Salida estandar de consola
		//2. System.err -> Salida de errores de consola
		
		//Una vez que trabajemos con una salida, podemos usar algun metodo
		//para imprimir por ella, como por ejemplo el metodo println
		System.out.println("Salida estandar de consola");
		System.err.println("Salida de errores de consola");//SYSERR + CTRL Y ESPACIO

		//Ojo: system.out y system.err trabajan con flujos diferentes
		//de salidas por lo tanto si dos sentencias estan muy juntas
		//puede qeu salgan de manera diferente
		
		//En java tenemos una manera de recoger informacion a traves de
		//la consola, y es con la clase System.in
		//Lamentablemente debemos de apoyarnos en otras clases para
		//poder recoger la informacion a partir de este system.in
		//El caso mas habitual es mediante la clase scanner
		
		//Para ello debemos de crearnos una variable de tipo scanner
		//y su correspondiente objeto diciendole que lea de system.in
		// Para utilizar esta clase debemos de importar el paquede donde
		//se encuentra y las importaciones de paquetes se ponen al principio
		//de la clase
		//Ej: import java.util.Scanner;
		//El concepto de paquete es muy similar al concepto de directorio
		Scanner sc = new Scanner(System.in);
		//Si ponekos Scan y pulsamos ctrl + espacio nos debe importar
		//autamaticamente la clase
		
		//Una vez creada la variable y el objeto podemos empezar a usar
		//metodos del objeto para capturar la informacion.
		//Son funcionalidades que pueden aplicar los objetos.
		//Invocamos un metodo de un objeto mediante el operador "."
		
		//Mediante el metodo "nextLine()"
		//El programa se quedara parado en esa linea hasta que el usuario introducza 
		//una frase para leer y pulse "enter"
		//Nota: podemos observar como el programa sigue en ejecicion
		//porque hay un cuadrado rojo en eclipse en la pantalla de la consola
		System.out.println("Introduzca una frase para leer");
		//Normalmente el valor que introduzca el usuario debemos
		//de almacenarla en algun lugar
		//En este caso como queremos leer una frase vamos a utilizar
		//Un "String"
		//El metodo "nextLine()" devuelve un String es por ellos que usamos
		//una variable String para almacenar el resultado.
		String frase = sc.nextLine();
		System.out.println("El usuario ha introducido la frase: "+frase);
		
		//Una vez creado el Scanner no es necesario crearlo mas 
		frase = sc.nextLine();
		System.out.println("La segunda frase introducida es:  "+frase);
		
		System.out.println("Introduzca un numero");
		String s1 = sc.nextLine();
		System.out.println("Otro numero");
		String s2 = sc.nextLine();
		String s3 = s1 + s2;
		System.out.println("La concatenacion de s1 y s2 es: "+s3);
		
		//La clase Scanner tiene metodos para recoger distintos tipos de datos
		//Si queremos recoger un entero debemos utilizar "nextInt()"
		//No podemoa guardar un "int" en una variable string
		//String s4 = 4;//Error
		System.out.println("Introduzca un numero");
		int n1 = sc.nextInt();
		System.out.println("Introduzca un numero");
		int n2 = sc.nextInt();
		int n3 = n1+n2;//Suma
		System.out.println("El resultado de n1 y n2 es: "+n3);
		
		//Otro metodo
		System.out.println("Introduzca un Long");
		long l1 = sc.nextLong();
		System.out.println("El numero long es:"+l1);
		
		//Ojo por teclado se pone el punto flotante por ','
		//pero en java se guarda con '.'
		System.out.println("Introduzca un double (la coma flotante va separada por ','):");
		double d1 =sc.nextDouble();
		System.out.println("El numero double es : "+d1);
		
		System.out.println("Introduzca un float");
		float f1 = sc.nextFloat();
		System.out.println("EL numero float es :" +f1);
		
		
		//Ojo Si recojes un tipo de dato y lo guardas en otro diferente
		//puede dar error
		System.out.println("introduzca un numero, ojo un numero");
		//Si decimos a java que queremos recojer un numero y es un string
		//daria una excepcion en tiempo de ejecucion concretamente
		//java.util.inputmismatchexception
		//Puede tambien ocurrir si poneis un "nextInt()" y poneis un "double"
		int n4 = sc.nextInt();//Importante solo podemos poner por teclado un "int"
		System.out.println("el numero es "+n4);
		
		//OJO!!! IMPORTANTE!!! ALERTA!!!
		//La clase escaner tiene un pequeño problema. Siempre que queramos recoger
		//una cadena despues de haber recogido cualquier dato que no sea cadena
		//Ejemplo, recogemos un int y luego una cadena
		//Ejemplo, recogemos un double y luego una cadena
		//En este caso, debemos de recoger dos veces la cadena para que no de
		//problemas
		
		System.out.println("Introduzca la cadena a recoger");
		//Como el ultimo dato que recogimos con Scanner fue in 'int'
		//ahora debemos de hacer 2 nextLine() para que el segundo funcione
		sc.nextLine();
		String cadena = sc.nextLine();
		System.out.println("La cadena recogida es: "+cadena);
		
		
		
		
		
		
		
		
		
		
		
	}

}
