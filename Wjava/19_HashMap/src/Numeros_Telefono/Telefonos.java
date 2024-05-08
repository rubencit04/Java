package Numeros_Telefono;

import java.util.HashMap;
import java.util.Scanner;

public class Telefonos {

	public static void main(String[] args) {
		HashMap<String, Integer>  numerosTelefonos = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("--Escribe 5 numeros telefonos--");
		System.out.println("1. Telefono");
		numerosTelefonos.put("Pedro", sc.nextInt());
		System.out.println("2. Telefono");
		numerosTelefonos.put("Manuel", sc.nextInt());
		System.out.println("3. Telefono");
		numerosTelefonos.put("Omar", sc.nextInt());
		System.out.println("4. Telefono");
		numerosTelefonos.put("Gabriel", sc.nextInt());
		System.out.println("5. Telefono");
		numerosTelefonos.put("Alejandro", sc.nextInt());
		numerosTelefonos.forEach((k,v)->{
			System.out.println(" Nombre: "+k.toString());
			System.out.println(" Telf: "+v.toString());
		});
	}

}
