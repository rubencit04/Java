package _02Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> contarLetras = (v) -> {
			int contador = v.length();
			
			return contador;
			
		};
		System.out.println(contarLetras.apply("leon"));
		
		BiFunction<Integer, Integer, Integer> distancia = (v,k) -> {
			int num1 = v;
			int num2 = k;
			int resultado = v-k;
			//Math.abs
			return resultado;
		};
		System.out.println(distancia.apply(5, 2));
		BiFunction<String, Integer, String> subcadena = (v,k) -> {
			String cadena = v;
			int num = k;
			return cadena.substring(0,k);
		};
		System.out.println(subcadena.apply("Hola", 2));
		Predicate<String> contener = (v) -> {
			if(v.equals("pepe")) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(contener.test("pepe"));
		Consumer<List <Integer>> lista = (v) -> {
			for(Integer a : v) {
				System.out.println(a);
			}
			
		};
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(4);
		lista.accept(lista2);
		
		TriFunction<Integer, Integer, Integer, Integer> devolverMayor = (v,k,s) -> {
			return Math.max(v, Math.max(k, s));
		};
		System.out.println(devolverMayor.apply(10, 3, 30));
	}

}
