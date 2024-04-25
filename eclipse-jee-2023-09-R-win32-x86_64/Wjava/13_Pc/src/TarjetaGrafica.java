
public class TarjetaGrafica {
	String marca;
	String modelo;
	int nucleosCUDA;
	double precio;
	RAM ram;
	
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
