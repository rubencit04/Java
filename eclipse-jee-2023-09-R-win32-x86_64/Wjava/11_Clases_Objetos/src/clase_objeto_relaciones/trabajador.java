package clase_objeto_relaciones;

public class trabajador {
	String nombre;
	String dni;
	int salario;

	public trabajador() {

	}

	public trabajador(String nombre, String dni, int salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}

	public boolean validardni(String dni) {
		this.dni = dni;
		if (dni.length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int ganaMas(trabajador t) {
		if (t.salario >= this.salario) {
			return t.salario;

		} else {
			return this.salario;
		}
	}

	public String igual(trabajador t) {
		if (t.salario == this.salario && t.nombre.equals(this.nombre) && t.dni.equals(this.dni)) {
			return "Estos dos trabajadores tienen los mismos atributos";
		} else {
			return "Estos dos trabajadores  no tienen los mismos atributos";
		}
	}

	public int getSalario() {
		return salario;
	}

}
