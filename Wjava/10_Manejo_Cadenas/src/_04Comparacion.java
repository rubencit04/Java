import java.util.Scanner;

public class _04Comparacion {

	public static void main(String[] args) {
		System.out.println("---Comparacion Cadenas---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el usuario");
		String usuario = sc.nextLine();
		System.out.println("Introduce la contraseña");
		String password = sc.nextLine();
		if(usuario.equalsIgnoreCase("Capi")&& password.equals("odioAironMan69")) {
			
			System.out.println("Bienvenido a nuestro programa");
			
		}else {
			System.out.println("Usuario o password incorrecto");
		}
		System.out.println("Usuario---> "+usuario);
		System.out.println("Usuario sin espacios---> "+usuario.trim());
		System.out.println("Contraseña---> "+password);
		System.out.println("Contraseña sin espacios---> "+password.trim());
	}

}
