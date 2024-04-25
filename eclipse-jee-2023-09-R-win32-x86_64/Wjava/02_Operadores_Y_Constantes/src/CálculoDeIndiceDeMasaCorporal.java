
public class CálculoDeIndiceDeMasaCorporal {

	public static void main(String[] args) {
		System.out.println("Cálculo de Índice de Masa Corporal (IMC)");
		System.out.println("En metros");
		int peso = 80;
		double altura = 1.80;
		double IMC = peso / (altura * altura);
		System.out.println("Pesando "+peso+" y midiendo "+altura+"M"+" el IMC es de "+IMC);

	}

}
