
public class Personajes {
	private Arma Arma;
	private String nombre;
	private int vida;
	
	public Personajes(String nombre, Arma arma, int puntosDeVida) {
        this.nombre = nombre;
        this.Arma = arma;
        this.vida = puntosDeVida;
    }
	public Arma getArma() {
		return Arma;
	}
	public void setArma(Arma arma) {
		Arma = arma;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Personajes [Arma=" + Arma + ", nombre=" + nombre + ", vida=" + vida + "]";
	}
	 public void atacar(Personajes p) {
	        int danioBase = Arma.getDanio() + inteligencia; 
	        System.out.println(nombre + " ataca a " + p.nombre + " con " + p.Arma.getNombre() + "!");
	        System.out.println("Daño base: " + danioBase);

	        p.recibirDanio(danioBase);
	    }
	 
	 public void recibirDanio(int cantidad) {
	        vida -= cantidad;
	        System.out.println(nombre + " recibe " + cantidad + " puntos de daño.");
	        if (vida <= 0) {
	            System.out.println(nombre + " ha sido derrotado!");
	        }
	 }
}
