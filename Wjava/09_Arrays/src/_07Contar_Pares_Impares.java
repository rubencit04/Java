import java.util.Scanner;

public class _07Contar_Pares_Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Contar pares y impares de un array---");
		System.out.println("Seleccione el numero de huecos para el array");
		int cantidad = sc.nextInt();
		int i = 0;
		 int[] arrayNumeros = new int[cantidad];
		 int[] arrayPares = new int[cantidad];
		 int[] arrayImpares = new int[cantidad];
		 System.out.println("Cantidad del array es de---> "+cantidad);	
		 System.out.println("--------------------------------------");
		 for(i = 0;i <cantidad;i++) {
			 System.out.println("Introduce un numero");
			 arrayNumeros[i] = sc.nextInt();
			 if(arrayNumeros[i] %2==0) {
				arrayPares[i] = arrayNumeros[i];
				
			 }else {
				 arrayImpares[i] = arrayNumeros[i];
				 
			 }
		 }
		 System.out.println("-------------------------");
		 System.out.println("Con array poniendo el numero");
		 for(i = 0; i <cantidad;i++) {
			 if(arrayPares[i]!=0){
			 System.out.println("Par---> "+arrayPares[i]);
			 }
		 }
		 for(i = 0; i < cantidad;i++) {
			 if(arrayImpares[i]!=0){
				 System.out.println("Impar---> "+arrayImpares[i]);
				 }
			
		 }
		 int par = 0;
		 int impar = 0;
		 for(i = 0; i < cantidad;i++) {
			 if(arrayNumeros[i] %2==0){
				 par++;
			 }else{
				 impar++;
			 }
		 }
		 System.out.println("Con contadores");
		 System.out.println("Pares--> "+par);
		 System.out.println("Impares--> "+impar);
	}

}
