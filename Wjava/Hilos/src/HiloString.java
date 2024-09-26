import java.util.Date;

public class HiloString implements Runnable{
	private String cadena;
	private long resultado;
	public HiloString(String cadena, long resultado) {
		this.cadena = cadena;
		this.resultado = resultado;
	}
	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		Date inicio = new Date();
		for(int i = 0; i < resultado;i++ ) {
			System.out.println(cadena);
		}
		
		Date Final = new Date();
		long duracion = Final.getTime() - inicio.getTime();
		System.out.println("Hilo: " + Thread.currentThread().getName() + " ha acabado en " + duracion+"ms");
	}

}
