import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main  {

	public static void main(String[] args) {
		Operable numelevado = (base,exponente) -> {
			double resultado = Math.pow(base,exponente);
			return resultado;
		};
		System.out.println(numelevado.operar(2, 5));
		
		Operable raizcuadrada = (op1,op2) ->{
			double resultado = Math.sqrt(op1);
			return resultado;
		};
		System.out.println(raizcuadrada.operar(8, 0));
		Imprimir imprimirPnatalla = new Imprimir() {
			
			@Override
			public void imprimir(String cadena) {
				System.out.println(cadena);
				
			}
		};
		imprimirPnatalla.imprimir("Hola");
		
		Imprimir imprimirImpresora = new Imprimir() {
			
			@Override
			public void imprimir(String cadena) {
				String IP = "192.168.56.13";//Supongamos que la impresora esta aquí
				//Simulamos la impresion por impresora
				System.out.println("Imprimiendo por impresora: " + cadena);

				
			}
		};
		imprimirImpresora.imprimir("aa");
		Imprimir imprimirFichero = new Imprimir() {
			
			@Override
			public void imprimir(String cadena) {
					//Este método arroja Excepciones que DEBEMOS controlar
					//Con esta clase vamos a poder escribir en un fichero
					//de texto cadenas
					try {
						PrintWriter pw = new PrintWriter("fichero.txt");
						//El objeto tiene un método que nos permite escribir
						//en el fichero, que se llama igual que el método
						//de la clase "System.out"
						pw.println(cadena);//LLenamos el buffer con la información
						pw.flush();//Pasamos la información del buffer al fichero
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
			}
		};
		imprimirFichero.imprimir("adad");
		Cadena cadenaHola = new Cadena() {

			@Override
			public String cadena(String cadena) {
				return "Hola:" + cadena;
			}
		};
		System.out.println(cadenaHola.cadena("adada"));
			Cadena cadenaEliminar = new Cadena() {
				
				@Override
				public String cadena(String cadena) {
					return cadena.trim();
				}
			};
		System.out.println(cadenaEliminar.cadena("  dddddd "));
		Cadena cadenaEliminar2 = (cadena) -> cadena.trim();
		System.out.println(cadenaEliminar2.cadena("         aaaaaaaaaaaaaaaaa      "));
	}


}