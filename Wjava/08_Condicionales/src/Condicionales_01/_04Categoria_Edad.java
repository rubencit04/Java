package Condicionales_01;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class _04Categoria_Edad {

	public static void main(String[] args) {
		System.out.println("----------Categoria de Edad----------");
		System.out.println("Introduce la edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("-----------Tipos Categorias-----------");
		System.out.println("| Niño---> 0-12                      |");
		System.out.println("| Adolescente---> 13-19               |");
		System.out.println("| Adulto---> 20-64                   |");
		System.out.println("| Adulto Mayor---> 65-->             |");
		System.out.println("--------------------------------------");

		if (edad > 100) {
			System.out.println("Estas Muerto");
		} else if (edad >= 0 & edad <= 12) {
			System.out.println("Eres un Niño");
		} else if (edad >= 13 & edad <= 19) {
			System.out.println("Eres un Adolescente");
		} else if (edad >= 20 & edad <= 64) {
			System.out.println("Eres un Adulto");
		} else if (edad >= 64) {
			System.out.println("Eres un Adulto Mayor");
		}

	}

}
