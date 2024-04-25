package _01_basico;

public class _02_MainReferencias {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Tony";
		p1.edad = 45;
		p1.peso = 90;
		p1.estaCasado = false;//no haria falta, se inicializa a false
		
		Persona p2 = new Persona();
		p2.nombre = "Natasha";
		p2.edad = 37;
		p2.peso = 65;
		p2.estaCasado = true;
		

	}

}
