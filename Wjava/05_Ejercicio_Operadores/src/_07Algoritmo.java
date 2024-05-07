import java.util.Scanner;

public class _07Algoritmo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribir un algoritmo para calcular la nota final de un estudiante,  \r\n"
				+ "\r\n"
				+ "considerando que: \r\n"
				+ "\r\n"
				+ "- Por cada respuesta correcta 5 puntos, por una incorrecta -1 y por  \r\n"
				+ "\r\n"
				+ "respuestas en blanco 0.");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Cuantas respuestas correctas tienes?");
		int RCorr = sc.nextInt();
		System.out.println("Cuantas respuestas incorrectas tienes?");
		int RIncorr = sc.nextInt();
		System.out.println("Cuantas respuestas sin contestar tienes?");
		int RVacias = sc.nextInt();
		System.out.println("--------------------------------------------------------------------");
		int RCT = RCorr * 5;
		int RIT = RIncorr * -1;
		int RVT = RVacias * 0;
		int Total = RCT + RIT + RVT;
		System.out.println("Total de puntos----> "+Total);
		
		
		
		
		
		
	}

}
