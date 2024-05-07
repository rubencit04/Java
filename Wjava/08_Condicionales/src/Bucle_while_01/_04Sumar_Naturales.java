package Bucle_while_01;

public class _04Sumar_Naturales {

	public static void main(String[] args) {
		System.out.println("Sumar lso 100 numeros naturales");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("Esta es la suma de los 100 numeros naturales\n");
		int suma = 0;
		int i = 1;
		while(i <=100) {
			i++;
			suma+=i;
		}
		System.out.println(suma);
		
	}

}
