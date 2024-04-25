package condicionales;

public class _03_OperadorTernario {

	public static void main(String[] args) {
		//OPERADOR TERNARIO
		//-----------------
		//Con est eoperador buscamos hacer una sentencia "IF-ELSE" de una manera
		//rapida y en una sola linea
		
		//La estructura es la siguiente
		//(EXPRESION_BOLEAN) ? CASO_VERDADERO : CASO_FALSO;
		//El caso sera lo que devuelva la expresion, que normalmente lo almacenaremos
		//en una variable
		
		//Ejemplo
		int numero = 6;
		String cadena = (numero <=5) ? "Menor o igual que 5" : "Mayor que 5";
		System.out.println(cadena);
		
		//Equivalente al ternario
		if (numero <=5) {
			System.out.println("Menor o igual que 5");
		}else {
			System.out.println("Mayor que 5");
		}
		
		//Otro ejemlpo
		String texto = (numero %2 == 0)? "El numero es par" : "El numero es impar";
		System.out.println(texto);
	
		//otro ejemplo
		//Las variables booleanas normalmente empiezan por "es" o por "is"
		//tamniem pueden empezar por "tiene" o por "has"
		boolean esPar = (numero %2==0) ? true : false;
		//no se recomienda llamar a las varibales "negadas"
		//es mejor tomar el nombre "esPar" que llamarla "noeEsPar"
		if(esPar) {
			System.out.println("La variable es par");
		}else {
			System.out.println("La variable es impar");
		}
		
		//Si queremos usar la negacion mejor usar el operador "!"
	
		if(!esPar) {
			System.out.println("La variable es par");
		}else {
			System.out.println("La variable es impar");
		}
	}

}
