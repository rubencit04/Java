package bbdddao;

public class Coche {
	private int id;
	private String marca;
	private String modelo;
	private String tipo_motor;
	private int kilometros;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getTipo_motor() {
		return tipo_motor;
	}
	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", tipo_motor=" + tipo_motor
				+ ", kilometros=" + kilometros + "]";
	}
}
