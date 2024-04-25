
public class _01Coche {

	public static void main(String[] args) {
		Coches coche1 = new Coches();
		coche1.marca = "Tesla";
		coche1.modelo = "S";
		coche1.matricula = "RHLM";
		coche1.peso = 2050;
		coche1.antiguedad = 0;
		coche1.electrico = true;

		Coches coche2 = new Coches();
		coche2.marca = "Porsche";
		coche2.modelo = "911";
		coche2.matricula = "JCR300";
		coche2.peso = 1785;
		coche2.antiguedad = 1;
		coche2.electrico = false;

		Coches coche3 = new Coches();
		coche3.marca = "Ford";
		coche3.modelo = "GT";
		coche3.matricula = "PLHDVLU";
		coche3.peso = 1460;
		coche3.antiguedad = 0;
		coche3.electrico = false;

		imprimircoche1(coche1);
		imprimircoche2(coche2);
		imprimircoche2(coche3);

	}

	public static void imprimircoche1(Coches coches1) {
		System.out.println("Caracteristicas del primer coche");
		System.out.println("Marca: " + coches1.marca);
		System.out.println("Modelo: " + coches1.modelo);
		System.out.println("Matricula: " + coches1.matricula);
		System.out.println("Peso: " + coches1.peso);
		System.out.println("Antiguedad: " + coches1.antiguedad);
		System.out.println(coches1.electrico);
		System.out.println("----------------------------------");
	}

	public static void imprimircoche2(Coches coche2) {
		System.out.println("Caracteristicas del segundo coche");
		System.out.println("Marca: " + coche2.marca);
		System.out.println("Modelo: " + coche2.modelo);
		System.out.println("Matricula: " + coche2.matricula);
		System.out.println("Peso: " + coche2.peso);
		System.out.println("Antiguedad: " + coche2.antiguedad);
		System.out.println("Electrico: " + coche2.electrico);
		System.out.println("----------------------------------");
	}

	public static void imprimircoche3(Coches coche3) {
		System.out.println("Caracteristicas del segundo coche");
		System.out.println("Marca: " + coche3.marca);
		System.out.println("Modelo: " + coche3.modelo);
		System.out.println("Matricula: " + coche3.matricula);
		System.out.println("Peso: " + coche3.peso);
		System.out.println("Antiguedad: " + coche3.antiguedad);
		System.out.println("Electrico: " + coche3.electrico);
		System.out.println("----------------------------------");
	}
}
