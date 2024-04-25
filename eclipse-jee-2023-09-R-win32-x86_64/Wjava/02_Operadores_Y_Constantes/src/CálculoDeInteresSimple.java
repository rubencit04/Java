
public class CálculoDeInteresSimple {

	public static void main(String[] args) {
		int principal = 100;
		double tasa = 0.15;
		int tiempo = 5;
		double interes =  principal * tasa * tiempo;
		System.out.println("Intereses Simples\n");
		System.out.println("Los intereses de este producto valiendo "+principal+" con una tasa de "+tasa+" y el tiempo de "+tiempo+" son de : "+interes);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		principal = 200;
		tasa = 0.02;
		tiempo = 9;
		interes = principal * tasa * tiempo;
		System.out.println("Los intereses de este producto valiendo "+principal+" con una tasa de "+tasa+" y el tiempo de "+tiempo+" son de : "+interes);
		
	}

}
