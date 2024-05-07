import java.util.Scanner;

public class _09Conteo_Caracteres {

	public static void main(String[] args) {
		System.out.println("---Conteo de caraacteres---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String Cadena = sc.nextLine();
        System.out.println("Introduce el caracter que quieres que se cuente");
        char caracter = sc.nextLine().charAt(0);
        System.out.println("-------------------------");
        int cuenta = 0;
        for(int i = 0; i < Cadena.length();i++) {
        	char caractercomprobar = Cadena.charAt(i);
        	if(caractercomprobar == caracter) {
        		cuenta++;
        	}
        }
       System.out.println("Esta cadena contiene "+cuenta+" "+caracter);
        
	}

}
