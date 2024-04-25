package Bucles_Condicionales;

import java.util.Scanner;

public class _08Calculadora {

	public static void main(String[] args) {
		System.out.println("-----Calculadora-----");
		System.out.println("------Comandos------");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir del programa");
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Seleccione la operacion que quieras hacer");
		int operar = sc.nextInt();
		char cambiar = 'A';
		do {
		switch(operar) {
		case 1:
			System.out.println("---Sumando---");
			System.out.println("Introduca el primer numero");
			num1 = sc.nextInt();
			System.out.println("Introduca el segundo numero");
			num2 = sc.nextInt();
			System.out.println("----------------------------");
			sumar(num1,num2);
			System.out.println("Quieres cambiar de operacion?(Y/N)");
			cambiar = sc.next().charAt(0);//Recoger Caracter
			if(cambiar == 'Y'|| cambiar == 'y') {
				System.out.println("Seleccione la operacion que quieras hacer");
				operar = sc.nextInt();
				System.out.println("------------------------------------------");
						
			}
			else if(cambiar == 'N'|| cambiar == 'n') {
				break;
			}
			else {
				System.out.println("Me lo tomare como que no quieres cambiar de operacion");
				break;
			}
			break;
		case 2:
			System.out.println("---Restando---");
			System.out.println("Introduca el primer numero");
			num1 = sc.nextInt();
			System.out.println("Introduca el segundo numero");
			num2 = sc.nextInt();
			System.out.println("----------------------------");
			restar(num1,num2);
			System.out.println("Quieres cambiar de operacion?(Y/N)");
			cambiar = sc.next().charAt(0);//Recoger Caracter
			if(cambiar == 'Y'|| cambiar == 'y') {
				System.out.println("Seleccione la operacion que quieras hacer");
				operar = sc.nextInt();
				System.out.println("------------------------------------------");
						
			}
			else if(cambiar == 'N'|| cambiar == 'n') {
				break;
			}
			else {
				System.out.println("Me lo tomare como que no quieres cambiar de operacion");
				break;
			}
			break;
		case 3:
			System.out.println("---Multiplicando---");
			System.out.println("Introduca el primer numero");
			num1 = sc.nextInt();
			System.out.println("Introduca el segundo numero");
			num2 = sc.nextInt();
			System.out.println("----------------------------");
			multiplicar(num1,num2);
			System.out.println("Quieres cambiar de operacion?(Y/N)");
			cambiar = sc.next().charAt(0);//Recoger Caracter
			if(cambiar == 'Y'|| cambiar == 'y') {
				System.out.println("Seleccione la operacion que quieras hacer");
				operar = sc.nextInt();
				System.out.println("------------------------------------------");
						
			}
			else if(cambiar == 'N'|| cambiar == 'n') {
				break;
			}
			else {
				System.out.println("Me lo tomare como que no quieres cambiar de operacion");
				break;
			}
			break;
		case 4:
			System.out.println("---Dividiendo---");
			System.out.println("Introduca el primer numero");
			num1 = sc.nextInt();
			System.out.println("Introduca el segundo numero");
			num2 = sc.nextInt();
			System.out.println("----------------------------");
			dividir(num1,num2);
			System.out.println("Quieres cambiar de operacion?(Y/N)");
			cambiar = sc.next().charAt(0);//Recoger Caracter
			if(cambiar == 'Y'|| cambiar == 'y') {
				System.out.println("Seleccione la operacion que quieras hacer");
				operar = sc.nextInt();
				System.out.println("------------------------------------------");
						
			}
			else if(cambiar == 'N'|| cambiar == 'n') {
				break;
			}
			else {
				System.out.println("Me lo tomare como que no quieres cambiar de operacion");
				break;
			}
		}
		}
		while(operar !=5);
		System.out.println("Gracias po usar la calculadora");
		
	}
	public static void sumar(double num1,double num2) {
		double sumar = num1+num2;
		System.out.println(num1+" + "+num2+" = "+sumar);
	}
	public static void restar(double num1,double num2) {
		double restar = num1-num2;
		System.out.println(num1+" - "+num2+" = "+restar);
	}
	public static void multiplicar(double num1,double num2) {
		double mult = num1*num2;
		System.out.println(num1+" * "+num2+" = "+mult);
	}
	public static void dividir(double num1,double num2) {
		double div = num1/num2;
		System.out.println(num1+" / "+num2+" = "+div);
	}

}
