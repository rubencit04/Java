package coche;


import java.util.List;
import java.util.Scanner;

import pasajero.GestorPasajero;
import pasajero.Pasajero;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean fin = false;
        GestorCoche gc = new GestorCoche();
        GestorPasajero gp = new GestorPasajero();

        do {
            menuCoche();
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: 
                    System.out.println("Introduzca la marca a introducir:");
                    String marca = sc.nextLine();
                    System.out.println("Introduzca el modelo a introducir:");
                    String modelo = sc.nextLine();
                    System.out.println("Introduzca el tipo de motor a introducir:");
                    String motor = sc.nextLine();
                    System.out.println("Introduzca los kilómetros a introducir:");
                    int kilometros = sc.nextInt();

                    Coche c = new Coche();
                    c.setMarca(marca);
                    c.setModelo(modelo);
                    c.setTipo_motor(motor);
                    c.setKilometros(kilometros);

                    int alta = gc.alta(c);
                    if (alta == 0) {
                        System.out.println("Coche dado de alta.");
                    } else if (alta == 1) {
                        System.out.println("Error de conexión con la BBDD.");
                    } else if (alta == 2) {
                        System.out.println("Kilómetros introducidos menor que 0, ¡inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Selecciona el ID de la columna para borrar:");
                    int id = sc.nextInt();
                    boolean baja = gc.baja(id);
                    if (baja) {
                        System.out.println("Coche dado de baja.");
                    } else {
                        System.out.println("Error de conexión con la BBDD.");
                    }
                    break;

                case 3: 
                    System.out.println("Introduzca el ID del coche a modificar:");
                    id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Introduzca la nueva marca:");
                    marca = sc.nextLine();
                    System.out.println("Introduzca el nuevo modelo:");
                    modelo = sc.nextLine();
                    System.out.println("Introduzca el nuevo tipo de motor:");
                    motor = sc.nextLine();
                    System.out.println("Introduzca los nuevos kilómetros:");
                    kilometros = sc.nextInt();

                    c = new Coche();
                    c.setId(id); 
                    c.setMarca(marca);
                    c.setModelo(modelo);
                    c.setTipo_motor(motor);
                    c.setKilometros(kilometros);

                    int modificar = gc.modificar(c);
                    if (modificar == 0) {
                        System.out.println("Coche modificado.");
                    } else if (modificar == 1) {
                        System.out.println("Error de conexión con la BBDD.");
                    } else if (modificar == 2) {
                        System.out.println("Kilómetros introducidos menor que 0, ¡inválido!");
                    }
                    break;

                case 4: 
                    System.out.println("Introduce el ID del coche a buscar:");
                    id = sc.nextInt();
                    Coche obtenerId = gc.obtener(id);
                    System.out.println(obtenerId);
                    break;

                case 5:
                    System.out.println("Introduce la marca a buscar:");
                    marca = sc.nextLine();
                    Coche obtenerMarca = gc.obtener(marca);
                    System.out.println(obtenerMarca);
                    break;

                case 6: 
                    List<Coche> listar = gc.listar();
                    System.out.println(listar);
                    break;
                case 7:
                	menuPasajeros();
                	opcion = sc.nextInt();
                	switch (opcion) {
					case 1:
						 System.out.println("Introduzca el nombre del pasajero:");
		                    String nombre = sc.nextLine();
		                    nombre= sc.nextLine(); 
		                    System.out.println("Introduzca la edad del pasajero");
		                    int edad = sc.nextInt();
		                    System.out.println("Introduzca el peso del pasajero");
		                    double peso = sc.nextDouble();

		                    Pasajero p = new Pasajero();
		                    p.setNombre(nombre);
		                    p.setEdad(edad);
		                    p.setPeso(peso);

		                    alta = gp.alta(p);
		                    if (alta == 0) {
		                        System.out.println("Pasajero dado de alta.");
		                    } else if (alta == 1) {
		                        System.out.println("Error de conexión con la BBDD.");
		                    }
		                    break;
					case 2:
	                    System.out.println("Selecciona el ID de la columna para borrar:");
	                    id = sc.nextInt();
	                    baja = gp.baja(id);
	                    if (baja) {
	                        System.out.println("Pasajero dado de baja.");
	                    } else {
	                        System.out.println("Error de conexión con la BBDD.");
	                    }
	                    break;
					case 3: 
	                    System.out.println("Introduce el ID del pasajero a buscar:");
	                    id = sc.nextInt();
	                    Pasajero obtenerIdP = gp.obtener(id);
	                    System.out.println(obtenerIdP);
	                    break;
					case 4: 
	                    List<Pasajero> listarP = gp.listar();
	                    System.out.println(listarP);
	                    break;

					default:
						break;
					}
                	break;
                case 0: 
                    fin = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (!fin);

        System.out.println("Fin de programa.");
    }

    public static void menuCoche() {
        System.out.println("1. Dar de alta coche");
        System.out.println("2. Dar de baja coche por ID");
        System.out.println("3. Modificar coche por ID");
        System.out.println("4. Buscar coche por ID");
        System.out.println("5. Buscar coches por marca");
        System.out.println("6. Listar todos los coches");
        System.out.println("7. Gestión de pasajeros");
        System.out.println("0. Salir de la aplicación");
        System.out.println("Elija la opción:");
    }
    
    public static void menuPasajeros() {
    	System.out.println("1. Crear nuevo pasajero");
        System.out.println("2. Borrar pasajero por ID");
        System.out.println("3. Consulta pasajero por ID");
        System.out.println("4. Listar todos los pasajeros");
        System.out.println("5. Añadir pasajero a coche");
        System.out.println("6. Eliminar pasajero de un coche");
        System.out.println("7. Listar todos los pasajeros de un coche");
        System.out.println("Elija la opción:");
    }
    
    
}
