
public class _01Pantalla {

	public static void main(String[] args) {
		System.out.println("Funciones");
		System.out.println("--------------------------------------");
		pantalla();
		pantalla();
		pantalla();
		System.out.println("--------------------------------------");
		System.out.println("Perimetro dada su base y altura");
		perimetro(2,3);
		perimetro(5,4);
		System.out.println("--------------------------------------");
	    System.out.println("Perimetro Entrada Salida");
	    perimetro2(3,6);
	    perimetro2(5,8);
	    System.out.println("--------------------------------------");
	    System.out.println("Area");
	    area(4,6);
	    area(7,7);
	    System.out.println("--------------------------------------");
	    System.out.println("Hipotenusa");
	    hipotenusa(2,4);
	    hipotenusa(5.6,6);
	    System.out.println("--------------------------------------");
	    System.out.println("Suma");
	    suma(5,5);
	    suma(6,2);
	    System.out.println("--------------------------------------");
	    System.out.println("Resta");
	    resta(7,7);
	    resta(8,3);
	    System.out.println("--------------------------------------");
	    System.out.println("Multiplicacion");
	    multi(8,3);
	    multi(9,2);
	    System.out.println("--------------------------------------");
	    System.out.println("Division");
	    divi(4,2);
	    divi(9,2);
	    System.out.println("--------------------------------------");
	    System.out.println("Media");
	    media(5,7,2);
	    media(8,5,6);
	    System.out.println("--------------------------------------");
	    System.out.println("Nota Final");
	    NotaFinal(5,6,4,8,4);
	    NotaFinal(9,10,8,7.5,10);
	    System.out.println("--------------------------------------");
	    System.out.println("Sueldo Total");
	    SueldoTotal(1500,2,20);
	    SueldoTotal(2000,4,100);
		

	}
	//Entrada
	public static void pantalla() {
		System.out.println("1. Entar en la aplicacion");
		System.out.println("2. Registrarse en la aplicación");
		System.out.println("3. Salir del programa");
		
		
	}
	//Entrada
	public static void perimetro(int base, int altura ) {
		int perimetro = 2 * (base + altura);
		System.out.println("El perimetro de este rectangulo segun su base de "+base+" y con la altura "+altura+" es de-------> "+perimetro);
		
	}
	//Entrada Y Salida
	 public static int perimetro2(int base, int altura){
	        int perimetro = 2*(base+altura);
	        System.out.println("El perimetro del rectangulo con 4base de "+base+" y altura de "+altura+" es de: "+perimetro);
	        return perimetro;
	    }
	    //Entrada Y Salida
	    public static int area(int base, int altura){
	        int area = base*altura;
	        System.out.println("El area del rectangulo con base de "+base+" y altura de "+altura+" es de: "+area);
	        return area;
	    }
	    //Entrada Y Salida
	    public static double hipotenusa(double cateto1, double cateto2){
	        double hipotenusa = (int)Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
	        System.out.println("La hipotenusa con el cateto a de "+cateto1+" y cateto b de "+cateto2+" es de: "+hipotenusa);
	        return hipotenusa;
	    }
	    //Entrada Y Salida
	    public static int suma(int num1, int num2){
	        int suma = num1+num2;
	        System.out.println("La suma de "+num1+" y de "+num2+" es de: "+suma);
	        return suma;
	    }
	    //Entrada Y Salida
	    public static int resta(int num1, int num2){
	        int resta = num1-num2;
	        System.out.println("La resta de "+num1+" y de "+num2+" es de: "+resta);
	        return resta;
	    }
	    //Entrada Y Salida
	    public static int multi(int num1, int num2){
	        int multi = num1*num2;
	        System.out.println("La multiplicacion de "+num1+" y de "+num2+" es de: "+multi);
	        return multi;
	    }
	    //Entrada Y Salida
	    public static int divi(int num1, int num2){
	        int div = num1/num2;
	        System.out.println("La division de "+num1+" y de "+num2+" es de: "+div);
	        return div;
	    }
	    //Entrada
	    public static void media(int num1, int num2, int num3){
	        int media = (num1+num2+num3)/3;
	        System.out.println("La media de "+num1+" , "+num2+" y "+num3+" es de: "+media);
	        
	    }
	    //Entrada y Salida
	    public static double NotaFinal(double nota1, double nota2, double nota3, double notaEx, double notaTrab){
	        double Nparciales = (int)(nota1+nota2+nota3)/3*0.55;
	        double Nef = (int)notaEx * 0.3;
	        double NT= (int)notaTrab * 0.15;
	        double NotaFinal = (int)Nparciales+Nef+NT;
	        System.out.println("Nota media parciales----> "+Nparciales);
	        System.out.println("Nota media del examen final----> "+Nef);
	        System.out.println("Nota media Trabajo----> "+NT);
	        System.out.println("Nota final----> "+NotaFinal);
	        
	        return NotaFinal;
	    }
	     //Entrada   
	    public static void SueldoTotal(int SB, int Hex, int PH){
	        int SueldoTotal = SB+(Hex*PH);
	        System.out.println("El sueldo total con el sueldo base de "+SB+" , con las horas extras hechas siendo "+Hex+" y la hora extra pagada a "+PH+" es de: "+SueldoTotal);
	        
	    }
	
	
	
}
