
public class ConversiónDeTemperatura {

	public static void main(String[] args) {
		int fahrenheit = 30; int celsius = (fahrenheit - 32) *5 / 9;
		System.out.println("Conversor de Temperatura");
		System.out.println("--------------------------------------");
		System.out.println("Grados fahrenheit actuales : "+fahrenheit);
		System.out.println("Conversionado : "+celsius);
		System.out.println("--------------------------------------");
		fahrenheit = 25; celsius = (fahrenheit - 32) *5 / 9;
		System.out.println("Los grados de ayer en fahrenheit eran de : "+fahrenheit);
		System.out.println("Conversionado : "+celsius);
		
		

	}

}
