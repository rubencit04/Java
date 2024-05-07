import java.util.ArrayList;

public class MainOrdenador {
	public static void main(String[] args) {
		ArrayList<RAM> listaram = new ArrayList<>();
		ArrayList<Periferico> listaperiferico = new ArrayList<>();
		System.out.println("---Creacion Ordenador---");

		Procesador p = new Procesador();
		p.precio = 100;
		p.marca = "Intel";
		p.modelo = "i5";
		p.numeroNucleos = 4;

		PlacaBase Pb = new PlacaBase();
		Pb.marca = "ASUS";
		Pb.tipo = "ATX";
		Pb.precio = 1233;

		TarjetaGrafica Tg = new TarjetaGrafica();
		Tg.marca = "NVIDIA";
		Tg.modelo = "GTX 1660";
		Tg.nucleosCUDA = 8;
		Tg.precio = 2222;

		RAM ramTarjetaGrafica = new RAM();
		ramTarjetaGrafica.capacidad = 500;
		ramTarjetaGrafica.marca = "Corsair";
		ramTarjetaGrafica.precio = 333;

		Tg.ram = ramTarjetaGrafica;

		RAM ram1 = new RAM();
		ram1.capacidad = 131;
		ram1.marca = "Kingston";
		ram1.precio = 122;

		RAM ram2 = new RAM();
		ram2.capacidad = 1312;
		ram2.marca = "Crucial";
		ram2.precio = 3123;
		
		RAM ram3 = new RAM();
        ram3.capacidad = 800;
        ram3.marca = "G.Skill";
        ram3.precio = 500;

        RAM ram4 = new RAM();
        ram4.capacidad = 1600;
        ram4.marca = "Corsair";
        ram4.precio = 800;

		listaram.add(ram1);
		listaram.add(ram2);
		listaram.add(ram3);
	    listaram.add(ram4);
		
		Periferico periferico1 = new Periferico();
		periferico1.tipo = "Teclado";
		periferico1.marca = "Logitech";
		periferico1.precio = 222;

		Periferico periferico2 = new Periferico();
		periferico2.tipo = "Ratón";
		periferico2.marca = "SteelSeries";
		periferico2.precio = 111;

		listaperiferico.add(periferico1);
		listaperiferico.add(periferico2);

		Ordenador o1 = new Ordenador();

		o1.setProcesador(p);
		o1.setPlacaBase(Pb);
		o1.setTarjetaGrafica(Tg);
		o1.setListaRAMs(listaram);
		o1.setListaPerifericos(listaperiferico);

		o1.CalcularPrecio();

		System.out.println(o1.toString());
	}
}
