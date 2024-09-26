package Empresa;

public abstract class Empleado {
	private String Nombre;
	private char Sexo;
	private int edad;
	Direccion direccion;
	private double salario;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Empleado(String nombre, char sexo, int edad, Direccion direccion, double salario) {
		super();
		Nombre = nombre;
		Sexo = sexo;
		this.edad = edad;
		this.direccion = direccion;
		this.salario = salario;
	}
	
	public abstract double calcularSuledoEmpleado();
}
