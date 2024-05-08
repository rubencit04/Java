
public class Curanderos extends Personajes{
	private int sabiduria;

	 public Curanderos(String nombre, Arma arma, int puntosDeVida, int sabiduria) {
	        super(nombre, arma, puntosDeVida);
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
		return "Curanderos [sabiduria=" + sabiduria + "]";
	}
	
}
