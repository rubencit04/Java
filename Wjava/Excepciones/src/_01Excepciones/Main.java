package _01Excepciones;

public class Main {

	public static void main(String[] args) {
		try {
            String palabra1 = "Hola";
            String palabra2 = "Adios";
            String resultado = concatenar(palabra1, palabra2);
            System.out.println("Resultado: " + resultado);
        } catch (excepcionPalabra e) {
            System.out.println("Error: " + e.getMessage());
        }
		System.out.println("---------------------------------");
		try {
            String palabra1 = "Hola";
            String palabra2 = null;
            String resultado = concatenar2(palabra1, palabra2);
            System.out.println("Resultado: " + resultado);
        } catch (excepcionuncheked e) {
            System.out.println("Error: " + e.getMessage());
        }
		System.out.println("---------------------------------");
		
		try {
			Persona p1 = new Persona();
			Persona p2 = new Persona();
			p1.setEdad(10);
			p2.setEdad(-2);
			System.out.println("La edad es: "+p1.getEdad()+" "+p2.getEdad());
			
		} catch (edadNoPermitida e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("---------------------------------");
		
		try {
			Persona p3 = new Persona("Paco",2);
			System.out.println(p3.getNombre()+ " " + p3.getEdad() );
			Persona p4 = new Persona(null,3);
			System.out.println(p4.getNombre()+ " " + p4.getEdad() );
		}catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		 try {
	            Persona p5 = new Persona("", 20); 
	            System.out.println(p5.getNombre()+ " " + p5.getEdad() );
	        } catch (nombreVacioNoPermitido e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		
		
	}
	
		public static String concatenar (String a, String b) throws excepcionPalabra{
			if(a==null || b==null) {
				throw new excepcionPalabra("Una de las palabras es nula.");
			}
			return a.concat(b);
		}
		
		public static String concatenar2 (String a, String b) throws excepcionuncheked{
			if(a==null || b==null) {
				throw new excepcionuncheked("Una de las palabras es nula.");
			}
			return a.concat(b);
		}

}
