package Clases;

import java.util.Date;

public class _04_Date {

	public static void main(String[] args) {
		//La manera mas basica de tranajar con una fecha em java es con la clase
		//Date
		
		//La clase Date toma como referencia de la hora la del sistema operativo
		//Cuando intanciamos la clase Date obtendremos la hora del sistema operativo
		//donde estemos ejecutando el programa
		
		//OJO, la clase Date que normalmente usaremos sera la del paquete
		//java.util
		Date fecha = new Date();
		System.out.println(fecha);
		
		//Internamente la clase Date lo que guarda es el numero
		//de milisengundos que han pasado desde el 01/01/1970 00:00:00
		//tambien llamada hora UNIX. Se guarda en una variable de tipo
		//long
		//Podemos acceder a ella
		System.out.println(fecha.getTime());
		
		//Si queremos manejar fechas debemos de basasrnos en otras clases
		//las clase Date tiene casu todos sus metodos OBSOLETOS (deprecated)
		//Loa metodos obsoletos se mantienen para hacer retrocompatibilidad
		//entre versiones superiores de java frente a las inferiores, pero
		//nos dicen qye hay otras maneras mejores de hacer la funcionalidad
		System.out.println(fecha.getDate());//los dias van del 0 al 6
		System.out.println(fecha.getMonth());//los meses van del 0 al 11
		System.out.println(fecha.getYear());//es el año actual menos 1900
		
		//Hay una manera mas facil de obtener el numero de milisegundos
		System.out.println(System.currentTimeMillis());
		
		//Podemos medir tiempo restando fechas finalesw
		long tiempo = System.currentTimeMillis() - fecha.getTime();
		
		System.out.println("Tiempo total de ejecucion del programa: "+tiempo);
	}

}
