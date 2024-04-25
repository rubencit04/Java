
public class ConversiónDeMoneda {

	public static void main(String[] args) {
		//Formula para coversion utilizada * b = c, y a = c/b.
		System.out.println("Conversion de Moneda//USD a EUR");
		System.out.println("-------------------------------");
		System.out.println("1 USD = 0.85EUR");
		int USD = 2;
		final double EUR = 0.85;
		double conversion = USD * EUR;
		System.out.println("Con "+USD+" USD tienes "+conversion+" EUR");
	
	}

}
 