package constructores_metodos2;

public class coche {
	String id;
	String marca;
	String modelo;
	double precio;
	String fecha_matriculacion;
	int kilometros;
	
	public coche() {
		marca = "";
		modelo = "";
	}
	public coche (String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
	}

	public coche(String id, String marca, String modelo, Double precio, String fecha_matriculacion, int kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fecha_matriculacion = fecha_matriculacion;
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", fecha_matriculacion=" + fecha_matriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void preciobase(double precio) {
		this.precio = precio;
	}
	public void matriculacion(String fecha_matriculacion) {
		this.fecha_matriculacion = fecha_matriculacion;
	}
	public String recogerfecha(String fecha_matriculacion) {
		
		String[] año = this.fecha_matriculacion.split("/");
		String fecha = año[2];
		return fecha;	
	}
	public void bisiesto () {
		int año = Integer.parseInt(recogerfecha(fecha_matriculacion));
		if(año %4==0) {
			System.out.println(año+" es bisisesto");
		}else {
			System.out.println(año+" no es bisiesto");
		}
	}
	public void devolver() {
		int kilometros = this.kilometros;
		if(kilometros <10000) {
			System.out.println("El precio para devolver equivale a: "+this.precio);
		}else if(kilometros >=10000 & kilometros <50000){
			double nuevoprecio = this.precio;
			nuevoprecio = nuevoprecio * 0.8;
			System.out.println("El precio para devolver equivale a: "+nuevoprecio);
		}else if(kilometros >=50000) {
			double nuevoprecio = this.precio;
			nuevoprecio = nuevoprecio * 0.5;
			System.out.println("El precio para devolver equivale a: "+nuevoprecio);
		}
	}
	public void primo() {
		int saber = 0;
		int contador = 0;
		for(int i = kilometros; i >=1;i--) {
			  saber = kilometros%i;
				if(saber == 0) {
					contador++;
			}
				
			}
		if(contador > 2) {
			System.out.println("-------------------");
			System.out.println(kilometros+" no es primo");
		}else if(contador == 2) {
			System.out.println("-------------------");
			System.out.println(kilometros+" es primo");
			}
	}
	public void kilometrosrestantes() {
		int kilometrosrestantes = 2000000 - kilometros;
		System.out.println("Para los 2000000 kilometros quedan: "+kilometrosrestantes);
	}
	public void caracteristicas() {
		int contador = 0;
		int contador2 = 0;
		for(int i = 0; i <= modelo.length();i++) {
			contador++;
		}
		for(int i = 0; i <= marca.length();i++) {
			contador2++;
		}
		System.out.println("La marca tiene "+(contador2-1)+" caracteres");
		System.out.println("El modelo tiene "+(contador-1)+" caracteres");
		
	}
	public void diferencia (coche coche) {
		if(coche.kilometros > this.kilometros) {
			int diferencia = coche.kilometros-this.kilometros;
			System.out.println("La diferencia de kilometros es de: "+diferencia+" kilometros");
			
		}else {
			int diferencia = this.kilometros-coche.kilometros;
			System.out.println("La diferencia de kilometros es de: "+diferencia+" kilometros");
		}
		
		
	}
	public void mascaro (coche coche) {
		if(coche.precio > this.precio) {
			System.out.println("El segundo coche es mas caro que el primero");
		}else {
			System.out.println("El primer coche es mas caro que el segundo");
		}
	}
	
	
}
