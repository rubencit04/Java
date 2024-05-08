
public class CalculadoraAreaYPerimetro {

	public static void main(String[] args) {
		//Primero
		System.out.println("Primer rectangulo");
		System.out.println("--------------------------------------------");
		int longitud = 4; int ancho = 8; int area = longitud * ancho;
		System.out.println("El area del primer rectangulo es : "+area);
		int perimetro = 2 * (longitud + ancho);
		System.out.println("El perimetro del primer rectangulo es: "+perimetro);
		
		//Segundo
		System.out.println("\nSegundo rectangulo");
		System.out.println("--------------------------------------------");
		longitud = 2;ancho = 2;
		perimetro = 2 * (longitud + ancho);
		area = longitud * ancho;
		System.out.println("El area del segundo rectangulo es : "+area);
		System.out.println("El perimetro del segundo rectangulo es : "+perimetro);

	}

}
