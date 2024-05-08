import java.util.Scanner;
import java.util.ArrayList;
public class MainCoche {
	private ArrayList<Coche> listacoches;
	private static Scanner sc;
	public static void main(String[] args) {
		MainCoche arrancar = new MainCoche();
		arrancar.listacoches = new ArrayList<>();
		arrancar.arrancarPrograma();
	}

	public void arrancarPrograma() {
		boolean encendido = true;
	 sc = new Scanner(System.in);
		do {
			System.out.println("Seleccione la opcion");
			System.out.println("1.Crear coche");
			System.out.println("2.Mostrar coches");
			System.out.println("3.Mostar contadorID");
			System.out.println("4.Resetear contadorID");
			System.out.println("5.Salir del programa");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				crear();
				break;
			case 2:
				recorrerListaCoches();
				break;
			case 3:
				mostrarContadorID();
				break;
			case 4:
				resetearContadorID();
				break;
			case 5:
				terminarPrograma(encendido);
			}
		} while (encendido == true);

	}
	public void crear() {
		sc = new Scanner(System.in);
		Coche coche = new Coche();
		System.out.println("Escribe la marca");
		coche.setMarca(sc.next());
		System.out.println("Escribe la matricula");
		coche.setMatricula(sc.next());
		listacoches.add(coche);
	}
		
	public void recorrerListaCoches(){
		for(Coche i : listacoches) {
			System.out.println(i);
		}
	}
	
	public static void mostrarContadorID() {
		System.out.println(Coche.mostrarValorActualContadorID());
	}
	
	public static void resetearContadorID() {
		Coche.resetearContadorID();
	}
	public boolean terminarPrograma(boolean encendido) {
		return false;
	}
}
