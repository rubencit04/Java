
public class Curandero extends Personanjes {
	private int sabiduria;

	public Curandero(String nombre, Arma arma, int vida, int sabiduria) {
		super(nombre, arma, vida);
		this.sabiduria = sabiduria;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public String toString() {
		return "Curandero [sabiduria=" + sabiduria + "]";
	}

	
}
