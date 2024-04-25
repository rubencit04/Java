import java.util.ArrayList;

public class Ordenador {
	double precio;
	Procesador procesador;
	TarjetaGrafica tarjetaGrafica;
	PlacaBase placaBase;
	ArrayList<RAM> listaRAMs;
	ArrayList<Periferico> listaPerifericos;
	
	public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void setPlacaBase(PlacaBase placaBase) {
        this.placaBase = placaBase;
    }

    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void setListaRAMs(ArrayList<RAM> listaRAMs) {
        this.listaRAMs = listaRAMs;
    }

    public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }
	
	
	public Ordenador(){
		
	}
	
	 public void CalcularPrecio() {
	        precio = procesador.precio + tarjetaGrafica.precio + tarjetaGrafica.ram.precio + placaBase.precio;
	        for (RAM i : listaRAMs) {
	            precio += i.precio;
	        }
	        for (Periferico i : listaPerifericos) {
	            precio += i.precio;
	        }
	    }

	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaRAMs=" + listaRAMs + ", listaPerifericos=" + listaPerifericos
				+ "]";
	}


	
    }

	
	
	
	
	

