package Bucles_Condicionales;

import java.util.Scanner;

public class _01Contador_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Contador de Números Pares----");
		System.out.println("---------------------------------");
		System.out.println("----Rango de de números pares----");
		System.out.println("Escribe el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero");
		int num2 = sc.nextInt();
		System.out.println("----Rango de "+num1+" a "+num2+" en numeros pares----");
		int digref = 0;
		if(num1 <= num2 ) {
		if(num1 %2==0) {
			for(int i = num1; i <=num2;i+=2) {
				System.out.println(i);
				digref++;
			}
		}else {
			for(int i = num1+1; i <=num2;i+=2) {
				System.out.println(i);
				digref++;
			}
		}	
		}else if(num1 >= num2) {
			if(num1 %2==0) {
				for(int i = num1; i >=num2;i-=2) {
					System.out.println(i);
					digref++;
				}
			}else {
				for(int i = num1-1; i >=num2;i-=2) {
					System.out.println(i);
					digref++;
				}
			}	
			
		}
		System.out.println("--------------");
		System.out.println("Numeros pares--> " + digref);

		//Otra forma
		System.out.println("---Otra Forma---");
		int digref2 = 0;
		System.out.println("Escribe el primer numero");
		int num3 = sc.nextInt();
		System.out.println("Escribe el segundo numero");
		int num4 = sc.nextInt();
		System.out.println("----Rango de "+num3+" a "+num4+" en numeros pares----");
		if(num3 <= num4 ) {
		for (int j = num3; j <=num4;j++) {
			if(j%2==0) {
				System.out.println(j++);
			digref2++;
			}
			else{
				continue;
			}
			}
		}else if(num3 >= num4) {
			for (int j = num3; j >=num4;j--) {
				if(j%2==0) {
					System.out.println(j--);
				digref2++;
				}
				else{
					continue;
				}
				}
		}
		System.out.println("--------------");
		System.out.println("Numeros pares--> "+digref2);
	}

}
	
