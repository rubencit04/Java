package Condicionales_01;
import java.util.Scanner;

public class _07Descuento_Compra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Descuento de Compra----------");
		System.out.println("---------------------------------------");
		System.out.println("-----Descuentos-----");
		System.out.println("| +100$----> 10%   |");
		System.out.println("| +50$----->  5%   |");
		System.out.println("| -50$----->  0%   |");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("Introduce el importe total de la compra");
		double total = sc.nextDouble();
		double descuento = total;
		if (total < 50) {
			double resta = total * 0;
			double resta2 = resta - resta*2;
			System.out.println("---------------------------------------");
			System.out.println("| Compra----> "+total+"€     |");
			System.out.println("| Descuento----> "+resta2+"€   |");
			System.out.println("| Total----> "+descuento+"€      |");
			System.out.println("---------------------------------------");

		} else if (total >= 50 & total < 100) {
			double resta = total * 0.05;
			double resta2 = resta - resta*2;
			descuento = total - resta;
			System.out.println("---------------------------------------");
			System.out.println("| Compra----> "+total+"€        |");
			System.out.println("| Descuento----> "+resta2+"€    |");
			System.out.println("| Total----> "+descuento+"€        |");
			System.out.println("---------------------------------------");
		}
		else if (total >= 100) {
			double resta = total * 0.1;
			double resta2 = resta - resta*2;
			descuento = total - resta;
			System.out.println("---------------------------------------");
			System.out.println("| Compra----> "+total+"€      |");
			System.out.println("| Descuento----> "+resta2+"€   |");
			System.out.println("| Total----> "+descuento+"€       |");
			System.out.println("---------------------------------------");
		}
	}

}
