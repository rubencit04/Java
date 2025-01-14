package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlacaBase {
	@Value(value="Asus")
	private String marca;
	@Value(value="ATX")
	private String tipo;
	@Value(value="1233")
	private double precio;
	
	public PlacaBase(){
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
}
