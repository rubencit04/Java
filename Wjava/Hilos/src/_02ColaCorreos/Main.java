package _02ColaCorreos;

public class Main {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		ProductorEmail p1 = new ProductorEmail("Producto 1",cola);
		ProductorEmail p2 = new ProductorEmail("Producto 2",cola);
		ProductorEmail p3 = new ProductorEmail("Producto 3",cola);
		
		ConsumidorEmail c1 = new ConsumidorEmail("Consumidor 1",cola);
		ConsumidorEmail c2 = new ConsumidorEmail("Consumidor 2",cola);
		ConsumidorEmail c3 = new ConsumidorEmail("Consumidor 3",cola);
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
		c3.start();

	}

}
