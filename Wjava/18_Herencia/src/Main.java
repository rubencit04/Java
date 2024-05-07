import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static ArrayList<Empleados> empleados;

	public static void main(String[] args) {
		System.out.println("-----Empleados-----");
		sc = new Scanner(System.in);
		empleados = new ArrayList<>();

		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				registrar();

				break;
			case 2:
				mostrarEmpleados();
				break;
			case 3:
				calcularSalarioEmpleado();
				break;
			case 4:
				calcularCostesTotales();
				break;

			default:

			}
		} while (opcion != 5);

	}

	public static int menu() {
		System.out.println("1. Dar de Alta Empleado");
		System.out.println("2. Mostrar Empleados");
		System.out.println("3. Calcular Salario Empleado");
		System.out.println("4. Calcular Salario Total De Empresa");
		System.out.println("5. Salir Del Programa");
		System.out.println("------------------------------------");
		System.out.println("Seleccione La Opcion A Elegir");
		int opcion = sc.nextInt();
		return opcion;
	}

	private static void registrar() {
		System.out.println("1. Programador");
		System.out.println("2. Jefe de proyecto");
		System.out.println("3. Director");
		System.out.println("Seleccione el tipo de empleado:");
		int tipoEmpleado = sc.nextInt();
		System.out.println("DNI empleado");
		String dni = sc.next();
		System.out.println("Nombre del empleado");
		String nombre = sc.next();
		System.out.println("Sueldo base del empleado");
		double sb = sc.nextDouble();
		if (tipoEmpleado == 1) {
			empleados.add(new Programadores(dni, nombre, sb));

		} else if (tipoEmpleado == 2) {
			System.out.println("Incentivos del jefe de proyecto");
			double incentivos = sc.nextDouble();
			empleados.add(new Jefes_De_Proyecto(dni, nombre, sb, incentivos));

		} else if (tipoEmpleado == 3) {
			  Directores director = new Directores(dni, nombre, sb);
			System.out.println("---Empleados---");
			int contador = 1;
			for (Empleados e : empleados) {
				System.out.println((contador++)+" -Nombre " + e.getNombre() + " -ID " + e.getId());
				
			}
			System.out.println("Ingrese el ID del empleado (0 para salir):");
            int idEmpleado;
            while ((idEmpleado = sc.nextInt()) != 0) {
                Empleados empleado = buscarEmpleadoPorId(idEmpleado);
                if (empleado != null) {
                    director.agregarEmpleadoACargo(empleado);
                } else {
                    System.out.println("ID de empleado no válido. Inténtelo de nuevo.");
                }
                System.out.println("Ingrese el ID del empleado (0 para salir):");
            }
            empleados.add(director);
			
			
		}

	
}
	 private static void mostrarEmpleados() {
	        System.out.println("\nEmpleados dados de alta:");
	        for (Empleados empleado : empleados) {
	            System.out.println("ID: " + empleado.getId());
	            System.out.println("DNI: " + empleado.getDni());
	            System.out.println("Nombre: " + empleado.getNombre());
	            System.out.println("Sueldo base: " + empleado.getSb());
	            if (empleado instanceof Directores) {
	                System.out.println("Empleados a cargo:");
	                Directores director = (Directores) empleado;
	                for (Empleados subordinado : director.listaEmpleados) {
	                    System.out.println("- " + subordinado.getNombre());
	                }
	            }
	            System.out.println();
	        }
	    }

	private static Empleados buscarEmpleadoPorId(int id) {
		for (Empleados empleado : empleados) {
			if (empleado.getId() == id) {
				return empleado;
			}
		}
		return null;

	}
	
	private static void calcularSalarioEmpleado() {
        System.out.println("\nSeleccione el ID del empleado:");
        int idEmpleado = sc.nextInt();
        Empleados empleado = buscarEmpleadoPorId(idEmpleado);
        if (empleado != null) {
            System.out.println("Salario total de " + empleado.getNombre() + ": " + empleado.calcularSalarioTotal());
        } else {
            System.out.println("ID de empleado no válido.");
        }
    }
	
	private static void calcularCostesTotales() {
        double costesTotales = 0;
        for (Empleados empleado : empleados) {
            costesTotales += empleado.calcularSalarioTotal();
        }
        System.out.println("\nCostes totales de la empresa: " + costesTotales);
    }
	
}
