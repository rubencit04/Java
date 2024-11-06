package _02ColaCorreos;

public class ConsumidorEmail extends Thread {
	private String nombre;
	public Cola cola;
	public ConsumidorEmail(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run() {
		while(true) {
			try {
			Email email = cola.getMensaje();
			System.out.println(nombre + " ha consumido el mensaje: " + email);
			Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
