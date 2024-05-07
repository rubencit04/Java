import java.util.Scanner;

public class _08SueldoTrabajador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Calcula el sueldo de un trabajador, cuyo valor es su sueldo base  \r\n"
				+ "\r\n"
				+ "más un número de horas extra trabajadas. Cada hora trabajada extra se pagará a 40€. ");
		System.out.println("--------------------------------------------------");
		double HExtra = 40;
		System.out.println("Introduzca el sueldo base");
		double SBase = sc.nextDouble();
		System.out.println("Introduzca las horas extras hechas");
		double Horas = sc.nextDouble();
		double Dinero = HExtra * Horas + SBase;
		System.out.println("--------------------------------------------------");
		System.out.println("El sueldo es de "+SBase+" con las horas extra hechas "+Horas+" son de "+Dinero+" Euros");

	}

}
