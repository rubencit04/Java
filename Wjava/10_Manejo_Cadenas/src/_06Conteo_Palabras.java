import java.util.Scanner;

public class _06Conteo_Palabras {

	public static void main(String[] args) {
		System.out.println("---Conteo palabras---");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] fraseDividida = frase.split("\\s+");//Expresión regular para dividir la frase por cualquier carácter de espacio en blanco
		System.out.println("Palabras--> "+fraseDividida.length);
		
	}
}

	


