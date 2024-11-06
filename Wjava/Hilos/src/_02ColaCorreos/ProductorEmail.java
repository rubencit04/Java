package _02ColaCorreos;


public class ProductorEmail extends Thread {
	public String nombre;
	public Cola cola;
	
	public ProductorEmail(String nombre, Cola cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run(){
		GeneradorEmail ge = new GeneradorEmail();
		for(int i = 1;i <= 10;i++){
			Email email = ge.generarEmail();
			System.out.println(nombre + " ha producido el coche " + email);
			cola.addMensaje(email);
		}
	}

	 
}
