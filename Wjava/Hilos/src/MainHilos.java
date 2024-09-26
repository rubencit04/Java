import java.util.Scanner;

public class MainHilos {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		long num = sc.nextLong();
		HiloThread hilo1 = new HiloThread(num);
		hilo1.setName("Hilo1");
		System.out.println("Escribe el segundo numero");
		long num2 = sc.nextLong();
		HiloThread hilo2 = new HiloThread(num2);
		hilo2.setName("Hilo2");
		System.out.println("Escribe el tercer numero");
		long num3 = sc.nextLong();
		HiloThread hilo3 = new HiloThread(num3);
		hilo3.setName("Hilo3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo1.run();
		hilo2.run();
		hilo3.run();
		
		
	}

}
