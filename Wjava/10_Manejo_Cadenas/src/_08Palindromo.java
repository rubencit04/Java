import java.util.Scanner;

public class _08Palindromo {

	public static void main(String[] args) {
		 System.out.println("---Palindromo---");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce una palabra");
	        String Cadena = sc.nextLine();
	        System.out.println("-------------------------");
	        String cadenaInversa = "";
	        for (int i = 0; i < Cadena.length(); i++) {
	            cadenaInversa = Cadena.charAt(i)+cadenaInversa;
	        }  
	        if(Cadena.equalsIgnoreCase(cadenaInversa)){
	        	System.out.println("La palabra "+Cadena+" es palindromo");
	        }else {
	        	System.out.println("La palabra "+Cadena+" no es palindromo");
	        }

	}

}
