package Empresa;

import java.util.List;

public class Empresa {
	private String Nombre;
	private String Nif;
	Direccion direccion;
	List<Empleado>listaEmpleados;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNif() {
		return Nif;
	}
	public void setNif(String nif) {
		Nif = nif;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public Empresa(String nombre, String nif, Direccion direccion, List<Empleado> listaEmpleados) {
		super();
		Nombre = nombre;
		Nif = nif;
		this.direccion = direccion;
		this.listaEmpleados = listaEmpleados;
	}
	public double calcularSalarioEmpleados () {
		double salario = 0.0;
		for(Empleado e : listaEmpleados) {
			salario += e.getSalario();
			
		}
		return salario;
	}
	public int devolverDirectores () {
		int contador = 0;
		for(Empleado e : listaEmpleados) {
			if(e instanceof Jefe){
				contador++;
			}
		}
		return contador;
	}
	
}
