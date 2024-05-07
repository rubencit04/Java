
public class _04_Constantes {
	public static void main(String[] args) {
		// Las constantes en java es un tipo especial de 'variables', el cual
		// el valor que almacenamos NO se puede cambiar durante todo el ciclo
		//de vida del programa
		
		// Las constantes pueden ser de cualquier tipo de datos
		
		//Las constantes em java se declarab con la palabra reservada
		//  'final'
		
		//Las constantes en java se suelen declarar en UpperSnakeCase
		//El: CONSTANTE_NUMERICA
		final double NUMERO_PI = 3.1416;
		System.out.println(NUMERO_PI);
		
		// Si intentamos cambiar el valor de una constante, nos dara
		// un error en tiempo de compilacion
		// NUMERO_PI = 2.79; //ERROR
		
		final String TITULO_WEB= "Bienvenidos a mi página web";
		System.out.println(TITULO_WEB);
	}
}
