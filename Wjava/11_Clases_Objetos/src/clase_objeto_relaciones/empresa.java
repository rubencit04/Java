package clase_objeto_relaciones;

import java.util.Arrays;

public class empresa {
	String nombre;
	String nif;
	String[] trabajadores;

	public empresa() {

	}

	public empresa(String nombre, String nif, String[] trabajadores) {
		this.nombre = nombre;
		this.nif = nif;
		this.trabajadores = trabajadores;
	}

	@Override
	public String toString() {
		return "empresa [nombre=" + nombre + ", nif=" + nif + ", trabajadores=" + Arrays.toString(trabajadores) + "]";
	}

	public void datosTrabajadores(String[] trabajadores) {
		this.trabajadores = trabajadores;
		for (int i = 0; i < this.trabajadores.length; i++) {
			System.out.println(this.trabajadores[i]);
		}
	}

	public void devolverTrabajadores(String[] trabajadores) {
		this.trabajadores = trabajadores;
		int contador = 0;
		for (int i = 0; i < this.trabajadores.length; i++) {
			contador++;
		}
	}

	public boolean validarDni(String dni) {
		for (int i = 0; i < this.trabajadores.length; i++) {
			if (this.trabajadores[i].equals(dni)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadtrabajadores() {
			return this.trabajadores.length;
	}
	
	public double obtenerSalarioTotal() {
	    double salarioTotal = 0;
	    for (String trabajador : this.trabajadores) {
	    	String[] partes = trabajador.split(",");
	        salarioTotal += Double.parseDouble(partes[2].trim());
	    }
	    return salarioTotal;
	}
	
	public int masde3k() {
		int contador = 0;
		for(String trabajador : this.trabajadores) {
			String[] partes = trabajador.split(",");
			double salario = Double.parseDouble(partes[2].trim());
			if(salario > 3000) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public int menossmi() {
		int contador = 0;
		for(String trabajador : this.trabajadores) {
			String[] partes = trabajador.split(",");
			double salario = Double.parseDouble(partes[2].trim());
			int smi = 950;
			if(salario <= 950) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public int masparametro(int cantidad) {
		int contador = 0;
		for(String trabajador : this.trabajadores) {
			String[] partes = trabajador.split(",");
			double salario = Double.parseDouble(partes[2].trim());
			if(salario > cantidad) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public boolean todosTrabajadoresConDniValido() {
	    for (String trabajador : this.trabajadores) {
	        String[] partes = trabajador.split(",");
	        if (partes.length >= 2) {
	            String dni = partes[1].trim();
	            if (!esDniValido(dni)) {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
	    return true;
	}
	public boolean esDniValido(String dni) {
	    return dni.matches("\\d{9}");
	}
	
	public void empresaigual(empresa e) {
		if(e.nombre.equals(this.nombre)&& e.nif.equals(this.nif)) {
			System.out.println("Estas empresas son iguales");
		}
		
	}
	
}
