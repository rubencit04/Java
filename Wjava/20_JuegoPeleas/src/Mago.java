
public class Mago extends Personanjes{
	private int inteligencia;

	public Mago(String nombre, Arma arma, int vida, int inteligencia) {
		super(nombre, arma, vida);
		this.inteligencia = inteligencia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	@Override
	public String toString() {
		return "Mago [inteligencia=" + inteligencia + "]";
	}
	
}
