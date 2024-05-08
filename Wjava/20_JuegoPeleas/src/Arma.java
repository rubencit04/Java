
public class Arma {
	private int daño;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public Arma(int daño, String nombre) {
		super();
		this.daño = daño;
		this.nombre = nombre;
	}
	
}
