
public class Guerrero extends Personanjes{
	private int fuerza;

	public Guerrero(String nombre, Arma arma, int vida, int fuerza) {
		super(nombre, arma, vida);
		this.fuerza = fuerza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return "Guerrero [fuerza=" + fuerza + "]";
	}
	
}
