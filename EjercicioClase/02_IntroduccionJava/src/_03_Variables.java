
public class _03_Variables {
	
	public static void main(String[] args) {
		
		//Las variables son "cajas" donde vamos a guardar información
				//que podrá ser cambiada en el tiempo
				
				/*
				 * Todo programa de ordenador persigue ofrecer una funcionalidad 
				 * determinada para la que, por regla general, necesitará almacenar 
				 * y manipular información. Dicha información, que son los datos 
				 * sobre los que operaremos, deben almacenarse temporalmente en la 
				 * memoria del ordenador. 
				 * 
				 * Para poder almacenar y recuperar fácilmente información en la 
				 * memoria de un ordenador los lenguajes de programación ofrecen 
				 * el concepto de variables
				 */
				
				/*
				 * En Java, una variable es un espacio en la memoria que se utiliza para 
				 * almacenar un valor específico (generalmente un literal). 
				 * Las variables tienen un nombre, un tipo y un valor.
				 *  
				 * El nombre de una variable es un identificador único que se 
				 * utiliza para hacer referencia al valor almacenado en esa variable. 
				 * El tipo de una variable especifica qué tipo de valores pueden 
				 * almacenarse en ella y el valor es el dato que se guarda.

				   Java es un lenguaje de tipado estático, lo que significa que el tipo de 
				   una variable debe ser especificado al momento de declararla.
				 */
		
		//Llamamos "declaracion de una variable" cuando creamos una variable
		//por primera vez para usarla durante su ciclo de vida
		//Para declarar una variable en java primero especificamos en tipo,
		//luego el nombre y lo igualamos a un valor
		// TIPO_VARIABLE NOMBRE_VARIABLE = VALOR_VARIABLE
		
		//Ejemplo de variable entera
		int numero1 = 1;
		
		//Una vez declarada una variable NO podemos volver a declararla mientras
		//exista
		//int numero1 = 5;//Esto da error, la variable ya ha sido 'creada'
		
		//Lo que si podemos hacer es cambiar el valor de las variables
		numero1 = 5;
		
		// Podemos imprimir por pantalla valores de variables llamandolas por
		// su nombre
		System.out.println(numero1);
		
		numero1 = 20;
		System.out.println(numero1);
		
		numero1 = 1340;
		System.out.println(numero1);
		
		//Podemos crear variables de distintos tipos
		//Variables booleana
		boolean variableBooleana = true;
		System.out.println(variableBooleana);
		
		variableBooleana = false;
		System.out.println(variableBooleana);
		
		//Notese que el nombre de las variables en java van en notacion
		//lowerCamelCase 
		
		//OJO!!!!! El nombre de las variables es sensible a mayusculas y
		//minusculas
		int estoEsUnaVariable = 0;
		int ESTOESUNAVARIABLE = 0;
		
		//Las variables en java no pueden empezar por numero
		//int 1numero = 0;//error
		//Las variables en java DEBEN empezar por:
		//1. caracter alfabetico
		//2. guion bajo '-'
		//3. simbolo del dolar '$'
		//int %numero = 9;//error
		
		//Variable de tipo double
		double variableDouble= 12.34;
		System.out.println(variableDouble);
		
		//Variable de tipo long
		long variableLarga = 23L;
		variableLarga = 3_000_000_000L;//Si no podemos la 'L' daria error por el literal
		System.out.println(variableLarga);
		
		//Variable de tipo float
		float variableFloat = 23.56F;
		
		//Existen otros tipos de variables menos usados, como por ejemplo
		//byte, que es para numeros muy pequeños, entre -128 y 127
		byte variableByte = 127;
		
		
	}
}
