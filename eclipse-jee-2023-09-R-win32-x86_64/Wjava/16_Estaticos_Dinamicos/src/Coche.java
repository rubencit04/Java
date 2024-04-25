
public class Coche {
	private int id;
	private String matricula;
	private String marca;
	private static int contadorID = 0;
	public static final String MARCA_TOYOTA = "TOYOTA";
	public static final String MARCA_RENAULT = "RENAULT";

	public Coche() {
		this.id = contadorID++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	public static int mostrarValorActualContadorID() {
		return contadorID;
	}
	public static void resetearContadorID() {
		contadorID = 0;
	}


}
