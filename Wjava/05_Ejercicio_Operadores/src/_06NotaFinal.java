import java.util.Scanner;

public class _06NotaFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Un alumno desea saber cuál será su calificación final en la materia de  \r\n"
				+ "\r\n"
				+ "Entornos de Desarrollo. Dicha calificación se compone de los siguientes porcentajes: \r\n"
				+ "\r\n"
				+ "* 55% del promedio de sus tres calificaciones parciales. \r\n"
				+ "\r\n"
				+ "* 30% de la calificación del examen final. \r\n"
				+ "\r\n"
				+ "* 15% de la calificación de un trabajo final. \r\n"
				+ "\r\n"
				+ "Habrá que pedir los datos de las calificaciones parciales, del examen final y del trabajo final ");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Escribe la nota del parcial 1");
		double parcial1 = sc.nextDouble();
		System.out.println("Parcial 1---> "+parcial1);
		System.out.println("----------------------------------");
		System.out.println("Escribe la nota del parcial 2");
		double parcial2 = sc.nextDouble();
		System.out.println("Parcial 1---> "+parcial1);
		System.out.println("Parcial 2---> "+parcial2);
		System.out.println("----------------------------------");
		System.out.println("Escribe la nota del parcial 3");
		double parcial3 = sc.nextDouble();
		System.out.println("Parcial 1---> "+parcial1);
		System.out.println("Parcial 2---> "+parcial2);
		System.out.println("Parcial 2---> "+parcial3);
		System.out.println("----------------------------------");
		double parciales = (parcial1+parcial2+parcial3)/3*0.55;
		System.out.println("El 55% de los parciales es----> "+parciales);
		System.out.println("----------------------------------");
		System.out.println("Escribe la nota del examen final");
		double EFinal = sc.nextDouble();
		double EFinalT = EFinal * 0.30;
		System.out.println("El 30% media del examen final es-----> "+EFinalT);
		System.out.println("----------------------------------");
		System.out.println("Escribe la nota del trabajo");
		double Trabajo = sc.nextDouble();
		double TNota = Trabajo * 0.15;
		System.out.println("El 15% trabajo final es----> "+TNota);
		System.out.println("----------------------------------");
		double NTotal = TNota + EFinalT + parciales;
		System.out.println("La nota total del curso es----> "+NTotal);
		
	}

}
