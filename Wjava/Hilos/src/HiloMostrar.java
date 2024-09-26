import java.util.Date;

public class HiloMostrar implements Runnable {
	private long numero;
	public HiloMostrar(long numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		Date inicio = new Date();
		
		for(long i = numero; i <= 1000000000; i++) {
			System.out.println(i);
		}
		Date Final = new Date();
		long duracion = Final.getTime() - inicio.getTime();
		System.out.println("Hilo: " + Thread.currentThread().getName() + " ha acabado en " + duracion+"ms");
	}
	

	
}
	

