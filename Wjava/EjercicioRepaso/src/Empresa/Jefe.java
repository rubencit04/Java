package Empresa;

import java.util.List;

public class Jefe extends Empleado {
	private int numeroempleados;
	private String despacho;
	List<Empleado>listaempleadosacargo;
	public int getNumeroempleados() {
		return numeroempleados;
	}
	public void setNumeroempleados(int numeroempleados) {
		this.numeroempleados = numeroempleados;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public List<Empleado> getListaempleadosacargo() {
		return listaempleadosacargo;
	}
	public void setListaempleadosacargo(List<Empleado> listaempleadosacargo) {
		this.listaempleadosacargo = listaempleadosacargo;
	}
	public Jefe(String nombre, char sexo, int edad, Direccion direccion, double salario, int numeroempleados,
			String despacho, List<Empleado> listaempleadosacargo) {
		super(nombre, sexo, edad, direccion, salario);
		this.numeroempleados = numeroempleados;
		this.despacho = despacho;
		this.listaempleadosacargo = listaempleadosacargo;
	}
	public double calcularSuledoEmpleado() {
		double salario = this.getSalario();
		for(Empleado e : listaempleadosacargo) {
			salario += e.getSalario() * 0.1;
		}
	return salario;
	
}
	
}
