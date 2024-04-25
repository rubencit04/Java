import java.util.Scanner;

public class _07Inversion_Cadenas {

    public static void main(String[] args) {
        System.out.println("---Inversion de cadenas---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String Cadena = sc.nextLine();
        System.out.println("Imprimir todas las letras");
        String cadenaInversa = "";
        for (int i = 0; i < Cadena.length(); i++) {
            cadenaInversa = Cadena.charAt(i)+cadenaInversa;
        }        
        System.out.println("---------------------------------");
        System.out.println("Cadena original---> " + Cadena);
        System.out.println("Cadena Inversa---> " + cadenaInversa);
    }
}