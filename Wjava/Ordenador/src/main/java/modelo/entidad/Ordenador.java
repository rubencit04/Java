package modelo.entidad;
import java.util.ArrayList;

public class Ordenador {
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica tarjetaGrafica;
	private PlacaBase placaBase;
	private ArrayList<RAM> listaRAMs;
	private ArrayList<Periferico> listaPerifericos;
	
	
	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	public ArrayList<RAM> getListaRAMs() {
		return listaRAMs;
	}

	public void setListaRAMs(ArrayList<RAM> listaRAMs) {
		this.listaRAMs = listaRAMs;
	}

	public ArrayList<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}

	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

	public Ordenador(){
		
	}
	
	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaRAMs=" + listaRAMs + ", listaPerifericos=" + listaPerifericos
				+ "]";
	}


	
    }

	
	
	
	
	

