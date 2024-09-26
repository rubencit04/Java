import java.util.Scanner;

public class MainHilosB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		long num = sc.nextLong();
		HiloThread Hilo1 = new HiloThread(num);
		Thread t1 = new Thread(Hilo1);
		t1.setName("Hilo1");
		System.out.println("Escribe el segundo numero para que imprima desde ese numero hasta 1Billon");
		long num2 = sc.nextLong();
		HiloMostrar Hilo2 = new HiloMostrar(num2);
		Thread t2 = new Thread(Hilo2);
		t2.setName("Hilo2");
		System.out.println("Escribe la cadena mostrar tantas veces el String como la resta entre el primer número y el segundo número");
		String cadena = sc.next();
		long resultado = 0;
		if(num > num2) {
			resultado = num - num2;
		}else {
			resultado = num2 - num;
		}
		
		HiloString Hilo3 = new HiloString(cadena,resultado);
		Thread t3 = new Thread(Hilo3);
		t3.setName("Hilo3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
