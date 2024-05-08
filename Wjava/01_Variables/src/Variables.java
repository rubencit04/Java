
public class Variables {
	public static void main(String[] args) {
		int numero = 1; int numero1 = 2; int numero2 = 3;
		System.out.println("Los numeros son : "+ numero+ " " +numero1+" " +numero2);
		numero = 2; numero1 = 3; numero2 = 4; 
		System.out.println("Los numeros son : "+ numero+ " " +numero1+" " +numero2);
		
		char letra = 'A'; char letra1 = 'B'; char letra2 = 'C';
		System.out.println("Las letras son : "+ letra+ " " +letra1+" " +letra2);
		letra = 'B'; letra1 = 'C'; letra2 = 'D'; 
		
		String cadena = "Hola"; String cadena1 = "Paco"; String cadena2 = "Lopez";
		System.out.println(cadena+ " " +cadena1+" " +cadena2);
		cadena = "Adios"; cadena1 = "Vuelve"; cadena2 = "Pronto";
		System.out.println(cadena+ " " +cadena1+" " +cadena2);
		
		boolean verdadero = true; boolean verdadero1 = true;  boolean falso = false;
		System.out.println(verdadero+ " " +verdadero1+" " +falso);
		verdadero = false; verdadero1 = false; falso = true;
		System.out.println(verdadero+ " " +verdadero1+" " +falso);
		
		float float3 = 19F; float float1 = 4924F;  float float2 = 4846F;
		System.out.println(float3+ " " +float1+" " +float2);
		float3 = 9000F; float1 = 203F; float2 = 19F;
		System.out.println(float3+ " " +float1+" " +float2);
		
		long largo1 = 193919319131L; long largo2 = 7461641L;  long largo3= 8417741L;
		System.out.println(largo1+ " " +largo2+" " +largo3);
		largo1 = 89313183L; largo2 = 913881L; largo3 = 19212112L;
		System.out.println(largo1+ " " +largo2+" " +largo3);
		
		double decimal1 = 112.23; double decimal2 = 32.32;  double decimal3= 93.19;
		System.out.println(decimal1+ " " +decimal2+" " +decimal3);
		decimal1 = 2.498; decimal2 = 1.55; decimal3 = 1.2;
		System.out.println(decimal1+ " " +decimal2+" " +decimal3);
	}
}