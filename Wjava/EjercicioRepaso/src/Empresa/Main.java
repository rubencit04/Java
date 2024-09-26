package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		Direccion de = new Direccion("a", "a", "3131");
		Direccion de1 = new Direccion("b", "b", "5141");
		Direccion de2 = new Direccion("c", "c", "44141");
		Currito e1 = new Currito("Paco", 'H', 20, de1, 1110, 202, 20);
		Currito e2 = new Currito("Pedro", 'H', 50, de2, 22220, 101,  21);
		Jefe j1 = new Jefe("Alonso", 'H', 40, de2, 2310, 2, "2planta", listaEmpleados);
		Empresa e  = new Empresa("PedroMans", "44141n", de, listaEmpleados);
		listaEmpleados.add(e2);
		listaEmpleados.add(e1);
		listaEmpleados.add(j1);
		System.out.println(e.calcularSalarioEmpleados());
		System.out.println(e.devolverDirectores());
		System.out.println(e1.calcularSuledoEmpleado());
		System.out.println(e2.calcularSuledoEmpleado());
		System.out.println(j1.calcularSuledoEmpleado());
	}

}
