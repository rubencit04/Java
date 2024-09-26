import java.util.Date;

public class HiloThread extends Thread {
	private long numero;
	
	public HiloThread(long numero) {
		this.numero = numero;
	}
	
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		Date incio = new Date();
		long resultado = 0;		
		int contador = 0;
		for (long i = 2; i < numero; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (numero % i == 0) { 
                contador++; 
                break;
            }
        }

        // Determinar el resultado basado en el contador
        if (contador == 0) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    
			
		
		Date Final = new Date();
		long duracion = Final.getTime() - incio.getTime();
		System.out.println("Hilo: " + Thread.currentThread().getName() + " ha acabado en " + duracion+"ms");
		
	}
}
