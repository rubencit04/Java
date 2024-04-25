import java.util.ArrayList;

class Directores extends Empleados {
    ArrayList<Empleados> listaEmpleados;

    public Directores(String DNI, String nombre, double sueldoBase) {
        super(DNI, nombre, sueldoBase);
        this.listaEmpleados = new ArrayList<>();
    }


	public double calcularSalarioTotal() {
		return getSb() + (100*listaEmpleados.size());
	}

	public void agregarEmpleadoACargo(Empleados empleado) {
        listaEmpleados.add(empleado);
    }
	
	
}
