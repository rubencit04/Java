package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Procesador {
	@Value(value="Intel")
	private String marca;
	@Value(value="i5")
	private String modelo;
	@Value(value="4")
		private int numeroNucleos;
	@Value(value="100")
		private double precio;
		
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

		public int getNumeroNucleos() {
			return numeroNucleos;
		}

		public void setNumeroNucleos(int numeroNucleos) {
			this.numeroNucleos = numeroNucleos;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public Procesador(){
			
		}

		@Override
		public String toString() {
			return "Procesador [marca=" + marca + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos
					+ ", precio=" + precio + "]";
		}
		
}
