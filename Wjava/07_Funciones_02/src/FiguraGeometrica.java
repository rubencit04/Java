
public class FiguraGeometrica {

	public static void main(String[] args) {
		System.out.println("----------------FiguraGeometrica----------------");
		System.out.println("Area De Un Cuadrado");
		System.out.println("dada  "+calcularArea(20));
		System.out.println("--------------------------------");
		System.out.println("Area De Un Circulo");
		System.out.println("dada  "+calcularArea2(20));
		System.out.println("--------------------------------");
		System.out.println("Area De Un Triangulo");
		System.out.println("dada  "+calcularArea(23, 20));
		System.out.println("--------------------------------");
		System.out.println("Area De Un Pentagono");
		System.out.println("dada  "+calcularArea2(22, 20));
		System.out.println("--------------------------------");
	}

	public static double calcularArea(double lado) {
		double area = lado * lado;
		return area;
	}

	public static double calcularArea2(double radio) {
		final double PI = 3.14;
		double area = PI * (radio * radio);
		return area;
	}

	public static double calcularArea(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}

	public static double calcularArea2(double apotema1, double apotema2) {
		double area = (apotema1 * apotema2) / 2;
		return area;
	}
}
