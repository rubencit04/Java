package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TarjetaGrafica {
	@Value(value="Corsair")
	private String marca;
	@Value(value="GTX 1660")
	private String modelo;
	@Value(value="8")
	private int nucleosCUDA;
	@Value(value="2222")
	private double precio;
	@Autowired
	private RAM ram;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNucleosCUDA() {
		return nucleosCUDA;
	}
	public void setNucleosCUDA(int nucleosCUDA) {
		this.nucleosCUDA = nucleosCUDA;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public TarjetaGrafica(){
		
	}
	 public void setRAM(RAM ram) {
	        this.ram = ram;
	    }
	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCUDA=" + nucleosCUDA + ", precio="
				+ precio + ", ram=" + ram + "]";
	}
	 
}
