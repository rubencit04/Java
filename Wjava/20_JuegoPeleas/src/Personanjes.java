
public class Personanjes {
	private String nombre;
	private Arma arma;
	private int vida;
	
	
	public Personanjes(String nombre, Arma arma, int vida) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.vida = vida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Personanjes [nombre=" + nombre + ", arma=" + arma + ", vida=" + vida + "]";
	}
	public void atacar(Personanjes p) {
		int daño = dañoArma(this);
		p.setVida(getVida() - daño);
		System.out.println(nombre + " ataca a " + p.nombre + " con " + arma.getNombre() +", causando " + daño + " puntos de daño.");
		if(this.vida <= 0) {
			setVida(0);
		}else if(p.getVida() <= 0) {
			p.setVida(0);
		}
		System.out.println("Vida restante de "+p.getNombre() + " es de "+ p.getVida());
	}
	
	 public int dañoArma(Personanjes p) {
	        int a = arma.getDaño();
	     
	        if (p instanceof Mago && this.arma.getNombre().equals("Hechizo")) {
	            a += 5;
	        }
	   
	        else if (p instanceof Guerrero && (this.arma.getNombre().equals("Arco") || this.arma.getNombre().equals("Espada"))) {
	            a += 3;
	        }
	     
	        else if (p instanceof Curandero && this.arma.getNombre().equals("Rezo")) {
	            a += 2; 
	        }
	        return a;
	    }
	}
