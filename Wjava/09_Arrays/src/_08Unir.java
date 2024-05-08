import java.util.Scanner;

public class _08Unir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("---Unir en array---");
		System.out.println("Seleccione el numero de huecos para el primer array");
		int cantidad1 = sc.nextInt();
		System.out.println("Seleccione el numero de huecos para el segundo array");
		int cantidad2 = sc.nextInt();
		int suma = cantidad1+cantidad2;
		int[] primerarray = new int[cantidad1];
		int[] segundoarray = new int[cantidad2];
		int[] totalarray = new int[suma];
		int i = 0;
		int suma2 = 0;
		 System.out.println("Cantidad del primer array es de---> "+cantidad1);
		 System.out.println("Cantidad del primer array es de---> "+cantidad2);
		 System.out.println("--------------------------------------");
		 System.out.println("---Primer array---");
		 for(i = 0;i <cantidad1;i++) {
			 System.out.println("Intrduce un numero");
			primerarray[i] = sc.nextInt();
			totalarray[i] = primerarray[i];
		 }
		 System.out.println("---Segunda array---");
		 for(i = 0;i <cantidad2;i++) {
			 System.out.println("Intrduce un numero");
			segundoarray[i] = sc.nextInt();
			totalarray[i+cantidad1] = segundoarray[i];
		 }
		 System.out.println("---Nueva array---");
		 for(i = 0; i <totalarray.length;i++) {
			 suma2 += totalarray[i];
			 System.out.println(totalarray[i]);
		 }
		
		 System.out.println("La suma del nuevo array es de---> "+suma2);
	}

}
