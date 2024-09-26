package Empresa;

public class Currito extends Empleado {
	private double jornada;
	private double horasextra;
	public double getJornada() {
		return jornada;
	}
	public void setJornada(double jornada) {
		this.jornada = jornada;
	}
	public double getHorasextra() {
		return horasextra;
	}
	public void setHorasextra(double horasextra) {
		this.horasextra = horasextra;
	}
	public Currito(String nombre, char sexo, int edad, Direccion direccion, double salario, double jornada,
			double horasextra) {
		super(nombre, sexo, edad, direccion, salario);
		this.jornada = jornada;
		this.horasextra = horasextra;
	}
	@Override
	public double calcularSuledoEmpleado() {
		
			double sueldoCurrito = getSalario() +(getHorasextra()*50) ;
			return sueldoCurrito;
		
	}
}
