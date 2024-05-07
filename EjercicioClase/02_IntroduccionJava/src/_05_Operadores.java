
public class _05_Operadores {
	public static void main(String[] args) {

		/*
		 * Operadores ---------- Los operadores son símbolos especiales que por lo común
		 * se utilizan en expresiones.
		 * 
		 * Según su naturaleza pueden representar multiples objetivos.
		 * 
		 * Expresión --------- Una expresión es una combinación de variables, operadores
		 * o llamadas a métodos.
		 * 
		 * El tipo de dato del valor regresado por una expresión depende de los
		 * elementos usados en la expresión.
		 */

		// Operadores ariteméticos
		// -----------------------
		System.out.println(5 + 7);// '+' suma
		System.out.println(17 - 7);// '-' resta
		System.out.println(5 * 7);// '*' multiplicación
		System.out.println(10 / 2);// '/' división

		// Si dividimos dos numeros enteros, el resultado sera
		// un número entero, es decir, se elimina la parte decimal
		System.out.println(11 / 2);// 5

		// Si en la división usamos algún numero double, entonces
		// el resultado sera un numero decimal o double.
		System.out.println(11.0 / 2);// 5.5
		System.out.println(11 / 2.0);// 5.5

		// '%' modulo de la división, es decir, el resto de la división
		// entera
		System.out.println(10 % 2);// 0
		System.out.println(11 % 2);// 1
		System.out.println(12 % 2);// 0

		// Operadores de asignación
		// ------------------------
		// '=', se utiliza para asignar valores a variables
		int numero1 = 5;
		numero1 = 10;

		// Podemos usar operadores aritmeticos para cambiar el valor
		// de variables
		int numero2 = 10;
		System.out.println(numero2);
		// En la siguiente expresión estamos asignando un nuevo valor
		// a la variable 'numero2'. Estamos cogiendo el antiguo valor
		// de la variable 'numero2' (10) y le estamos sumando el valor
		// '5', es decir, cuando ejecutemos la expresión el nuevo valor
		// que tendrá la varialbe 'numero2' será '15'
		numero2 = numero2 + 5;// 5 + 10 = 15
		System.out.println(numero2);

		// '+=', se utiliza para incrementar un valor a una variable
		// de manera más rápida de escribir
		int numero3 = 10;
		numero3 += 5;// Esto es equivalente a 'numero3 = numero3 + 5;'
		System.out.println(numero3);

		// '-=', se utiliza para decrementar una valor a una variable
		// de una manera más rapida de escribir
		int numero4 = 10;
		numero4 -= 4;// Esto es equivalente a 'numero4 = numero4 - 4;'
		System.out.println(numero4);

		// '*=', igual pero para la multiplicación
		int numero5 = 10;
		numero5 *= 5;// Esto es equivalente a 'numero5 = numero5 * 5;'
		System.out.println(numero5);

		// '/=', igual pero para la división
		int numero6 = 10;
		numero6 /= 5;// Esto es equivalente a 'numero6 = numero6 / 5;'
		System.out.println(numero6);

		// '%=', igual pero para el módulo
		int numero7 = 10;
		numero7 %= 5;// Esto es equivalente a 'numero7 = numero7 % 5;'
		System.out.println(numero7);// 0

		// Operador especial de incremento en UNA unidad
		// El operador '++' incrementa la variable entera en uno!
		int variableIncremental = 0;
		variableIncremental++;// Equivalente a 'variableIncremental = variableIncremental + 1'
		System.out.println(variableIncremental);// 1
		variableIncremental++;
		System.out.println(variableIncremental);// 2

		// Operador especial de decremento en UNA unidad
		// El operador especial '--' decrementa la variable entera en uno!
		int variableDecremental = 0;
		variableDecremental--;// Equivalente a 'variableDecrementa = variableDecremental - 1'
		System.out.println(variableDecremental);// -1
		variableDecremental--;
		System.out.println(variableDecremental);// -2

		// Ojo! con la precediencia de operadore
		int numero8 = 0;
		// Si ponemos ++ al finsl, se incrementara el valor despues de imprimirlo
		System.out.println(numero8++);// Imprimira 0 pero luego incrementara el valor en 1
		// La variable numero8 valdra 1
		System.out.println(++numero8);// Imprimira 1

		// Ojo otra vez
		// Si ponemos el ++ al principio, se incrementara primero
		int numero9 = 0;
		System.out.println(++numero9);// Imprimira 1 y su valor sera 1
		System.out.println(numero9++);// Imprime 1 y su valor sera 2
		System.out.println(numero9);// Imprime 2 su valor sera 2

		// Operadores relacionales
		// --------------------------
		// Son operadores que comparan valores y devuelven siempre un valor booleano
		// Operador == compara si dos valores son iguales
		System.out.println(5 == 5);
		System.out.println(5 == 7);
		// Se utilizan con variables
		int numero10 = 5;
		int numero11 = 8;
		System.out.println(numero10 == numero11);
		numero10 = 8;
		System.out.println(numero10 == numero11);

		// Operador < compara si un valor es menor que otro
		System.out.println(5 < 5);
		System.out.println(5 < 4);
		System.out.println(5 < 7);
		System.out.println(numero10 < numero11);

		// Operador > compara si un valor es mayor que otro
		System.out.println(5 > 5);
		System.out.println(5 > 4);

		// Operador >= compara si es mayor o igual que otro
		System.out.println(5 >= 5);
		System.out.println(5 >= 4);
		System.out.println(3 >= 6);

		// Operador <= compara si un valor es menoro igual que otro
		System.out.println(5 <= 5);
		System.out.println(numero10 <= numero11);

		// Operador != compara si un valor es distinto de otro
		System.out.println(5 != 4);
		System.out.println(numero10 != numero11);

		// Podemos utilizar generalmente otros tipos de datos
		System.out.println(false == false);
		System.out.println(true != false);
		System.out.println(34.56 <= 34.57);
		// A veces no siempre podemos comparar entre diferentestipos
		System.out.println(45L < 234.56);
		// System.out.println(false < 10);/ERROR

		// Operadores especiales de agrupacion ()
		// Hay que tener claro que los operadores tienen precedencia para
		// ejecutarse el * tiene precedencia al +
		System.out.println(10 + 2 * 5);// 20
		System.out.println((10 + 2) * 5);// 60

		// Operadores lógicos
		// ------------------
		// Los operadores lógicos se usan para combinar dos valores Booleanos
		// y devolver un resultado Booleano, es decir, verdadero o falso

		// Operador logico "AND" se representa por los simbolos &&
		// Este operador devuelve true solamente cuando los dos valores booleanos
		// que se comparan son true
		// Tabla "AND"
		// 1- false y false = false
		// 2- false y true = false
		// 3- true y false = false
		// 4- true y true = true
		System.out.println(true && false);
		boolean bol1 = true;
		boolean bol2 = true;
		System.out.println(bol1 && bol2);
		// Operador logico "OR" se representa por los simbolos ||
		// El simbolo | se suele llamar pipe
		// Este simbolo se escribe con altgr +
		// Este operador devuelve true cuando alguno de los valores booleanos
		// que se comparan sea true
		// Tabla "OR"
		// 1- false y false = false
		// 2- false y true = true
		// 3- true y false = true
		// 4- true y true = true
		System.out.println(true || false);// true
		System.out.println(bol1 || bol2);// true
		bol1 = false;
		System.out.println(bol1 || bol2);// true
		bol2 = false;
		System.out.println(bol1 || bol2);// false
		
		//Operador logico negacion se representa con el simbolo ! 
		//Este operador devuelve true cuando el valor es false y devuelve
		//false cuando el valor es true cambia el valor booleano
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println(!bol1);//true
		
		//Ejemplos
		//Si tenemos mucahs condiciones booleanas es mejor usar
		//el operador de agrupacion
		System.out.println((true && false) || true);//true
		System.out.println(!bol1 || bol2);//true
		
		//Operador especial de concatenacion de cadenas se representa por
		//el simbolo +. Notese que es el mismo operador que para la
		//suam aritmetica
		System.out.println("Cadena " + "concatenada");
		//Tambien se puede utilizad para concatenar una cadena con otra
		//variable de otro tipo
		int numero12 = 5; int numero13 =7; int resultado =numero12+numero13;
		System.out.println("El resultadod e la operacion "+resultado);
		numero13 =12;
		resultado = numero12+numero13;
		System.out.println("El resultadod e la operacion "+resultado);
		
		
	}
}