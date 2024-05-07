package constructores_metodos2;

import java.util.Scanner;

public class _01Maincoche {

	public static void main(String[] args) {
		coche coche = new coche();
		coche coche2 = new coche("L14", "bmw", "bmw10", 2000.0, "17/08/1991", 30000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la id del coche");
		coche.id = sc.next();
		System.out.println("Escribe la marca del coche");
		coche.marca = sc.next();
		System.out.println("Escribe modelo del coche");
		coche.modelo = sc.next();
		System.out.println("Escribe precio del coche");
		coche.precio = sc.nextDouble();
		System.out.println("Escribe la fecha de matriculacion del coche");
		coche.fecha_matriculacion = sc.next();
		System.out.println("Escribe los kilometros del coche");
		coche.kilometros = sc.nextInt();
		System.out.println("--------------------------------------");
		coche.bisiesto();
		System.out.println("--------------------------------------");
		coche.devolver();
		System.out.println("--------------------------------------");
		coche.primo();
		System.out.println("--------------------------------------");
		coche.kilometrosrestantes();
		System.out.println("--------------------------------------");
		coche.caracteristicas();
		System.out.println("--------------------------------------");
		coche.diferencia(coche2);
		System.out.println("--------------------------------------");
		coche.mascaro(coche2);
		
	}

}
