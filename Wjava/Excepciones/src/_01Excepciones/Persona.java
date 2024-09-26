package _01Excepciones;

public class Persona {
	private String nombre;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws edadNoPermitida{
			if(edad < 0) {
				throw new edadNoPermitida("La edad introducida es negativa");
			}
			this.edad = edad;
	}
	public Persona() {
		
	}
	public Persona(String nombre, int edad)throws IllegalArgumentException {
		super();
		if(nombre == null) {
			throw new IllegalArgumentException("El nombre no pueda ser ni null");
		}else if(nombre.trim().isEmpty()) {
	            throw new nombreVacioNoPermitido("El nombre no puede estar vacío.");
	        }else {
	        	this.nombre = nombre;
	    		this.edad = edad;
	        }
		
		
	}
	

}
