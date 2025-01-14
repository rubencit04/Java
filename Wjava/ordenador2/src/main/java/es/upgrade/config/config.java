package es.upgrade.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import es.upgrade.modelo.entidad.Ordenador;
import es.upgrade.modelo.entidad.Periferico;
import es.upgrade.modelo.entidad.PlacaBase;
import es.upgrade.modelo.entidad.Procesador;
import es.upgrade.modelo.entidad.RAM;
import es.upgrade.modelo.entidad.TarjetaGrafica;

@Configuration
@ComponentScan(basePackages = {"es.upgrade"})
public class config {

	@Bean
	@Scope("prototype")
	public ArrayList<RAM> listaram() {
		RAM ram = new RAM();
		ArrayList<RAM> listaram = new ArrayList<>();
		ram.setCapacidad(500);
		ram.setMarca("corsair");
		ram.setPrecio(300);
		listaram.add(ram);
		return listaram;
		
	}
	
	@Bean
	@Scope("prototype")
	public ArrayList<Periferico> listaperiferico() {
		Periferico periferico = new Periferico();
		ArrayList<Periferico> listaperiferico = new ArrayList<>();
		periferico.setMarca("Logitech");
		periferico.setPrecio(222);
		periferico.setTipo("Teclado");
		listaperiferico.add(periferico);
		return listaperiferico;
		
	}
	
	@Bean
	public Ordenador ordenador(Procesador procesador, TarjetaGrafica tj, PlacaBase pb) {
		Ordenador o = new Ordenador();
		o.setListaPerifericos(listaperiferico());
		o.setListaRAMs(listaram());
		o.setPlacaBase(pb);
		o.setProcesador(procesador);
		o.setTarjetaGrafica(tj);
		o.setPrecio(200);
		return o;
		
	}
	
}
