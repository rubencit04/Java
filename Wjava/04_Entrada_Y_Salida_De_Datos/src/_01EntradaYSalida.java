import java.util.Scanner;

public class _01EntradaYSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Crea el scanner para que el usuario pueda escribir en el programa
		
		//Long > Int
		//Double > Float > Int
		//Byte > Int
		
		System.out.println("Escribe una frase");
		String frase = sc.nextLine();//Espera hasta que el usuario introudzca la frase y solo recogera la informacion de un string sino dara error
		System.out.println("La frase es: "+frase);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un numero");
		int num = sc.nextInt();//Espera hasta que el usuario introudzca un numero y solo recogera (int) sino dara error
		System.out.println("El numero es: "+num);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un double");
		double db = sc.nextDouble();//Espera hasta que el usuario introudzca un double y solo recogera (double,float,int) sino dara error
		System.out.println("El double es: "+db);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un float");
		float flo = sc.nextFloat();//Espera hasta que el usuario introudzca un float y solo recogera  (float,int) sino dara error
		System.out.println("El float es: "+flo);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un long");
		long lon = sc.nextLong();//Espera hasta que el usuario introudzca un long y solo recogera (long,int) sino dara error
		System.out.println("El float es: "+lon);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un booleano (true o false)");
		boolean boo = sc.nextBoolean();//Espera hasta que el usuario introudzca un booleano y solo recogera (true,false) sino dara error
		System.out.println("El booleano es: "+boo);
		System.out.println("--------------------------------------");
		
		System.out.println("Escribe un byte");
		byte bte = sc.nextByte();//Espera hasta que el usuario introudzca un byte y solo (byte,int) sino dara error
		System.out.println("El byte es: "+bte);
	}

}
