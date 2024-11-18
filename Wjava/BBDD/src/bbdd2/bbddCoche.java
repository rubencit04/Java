package bbdd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bbddCoche {
	private static Scanner sc = new Scanner(System.in);
	private static String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
	private static String user = "root";
    private static String pass = "";
    private static String sql;
	public static void main(String[] args) {
	        int opcion = 0;
			while(opcion !=7) {
				opcion = menu();
				switch (opcion) {
				case 1: {
					insertar();
					break;
				}case 2:{
					darDeBaja();
					break;
				}case 3:{
					modificarCocheId();
					break;
				}case 4:{
					buscarCocheId();
					break;
				}case 5:{
					buscarCocheMarca();
					break;
				}case 6:{
					listarCoches();
					break;
				}
				default:
					System.out.println("Opción no válida.");
				}
			}
	        	
	        

	}

	public static int menu() {
		System.out.println("1.Dar de alta coche");
		System.out.println("2.Dar de baja coche por id");
		System.out.println("3.Modificar coche por id");
		System.out.println("4.Buscar coche por id");
		System.out.println("5.Buscar coches por marca");
		System.out.println("6.Listar todos los coches");
		System.out.println("7.Salir de la aplicación");
		System.out.println("Eliga la opcion");
		return sc.nextInt();
	}
	
	public static void insertar() {
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			
			sql = "INSERT INTO COCHE (MARCA, MODELO, TIPO_MOTOR, KILOMETROS) VALUES (?, ?, ?, ?)";
			 System.out.println("Introduzca la marca a introducir:");
	         String marca = sc.nextLine();
	         marca = sc.nextLine();
	         System.out.println("Introduzca el modelo a introducir:");
	         String modelo = sc.nextLine();

	         System.out.println("Introduzca el tipo de motor a introducir:");
	         String motor = sc.nextLine();

	         System.out.println("Introduzca los kilómetros a introducir");
	         Integer kilometros = null;
	         String kilometrosInput = sc.nextLine();

	         if (!kilometrosInput.isEmpty()) {
	             try {
	                 kilometros = Integer.parseInt(kilometrosInput);
	             } catch (NumberFormatException e) {
	                 System.out.println("Número inválido para kilómetros, debe ser un número entero. Inténtelo de nuevo.");
	                 
	             }
	         }

	         
	         if (modelo.isEmpty() || marca.isEmpty() || motor.isEmpty() || (kilometros != null && kilometros == 0)) {
	             System.out.println("No se pueden guardar datos vacíos.");
	             
	         }

	         System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
	         System.out.println(sql);

	         try (PreparedStatement sentencia = con.prepareStatement(sql)) {
	             sentencia.setString(1, marca);
	             sentencia.setString(2, modelo);
	             sentencia.setString(3, motor);
	             if (kilometros != null) {
	                 sentencia.setInt(4, kilometros);
	             }         

	             int afectados = sentencia.executeUpdate();
	             System.out.println("Sentencia SQL ejecutada con éxito.");
	             System.out.println("Registros afectados: " + afectados);
	             System.out.println("-----------------------------------------");
	         }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void darDeBaja() {

		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			 sql = "DELETE FROM COCHE WHERE ID=?"; 
			 System.out.println("Selecciona el ID de la columna para borrar");
			 int id = sc.nextInt();
			 System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
	         System.out.println(sql);
	         try(PreparedStatement sentencia = con.prepareStatement(sql)) {
				sentencia.setInt(1, id);
				int afectados = sentencia.executeUpdate();
				System.out.println("Sentencia SQL ejecutada con �xito");
				System.out.println("Registros afectados: "+afectados);
				System.out.println("-----------------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}
	         
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void modificarCocheId() {
		try(Connection con = DriverManager.getConnection(cadenaConexion, user, pass)) {
			sql = "UPDATE coche SET MARCA=?, MODELO=?, TIPO_MOTOR=?, KILOMETROS=? WHERE ID=?";
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			System.out.println("Introduzca la marca a introducir:");
	         String marca = sc.nextLine();
	         marca = sc.nextLine();

	         System.out.println("Introduzca el modelo a introducir:");
	         String modelo = sc.nextLine();

	         System.out.println("Introduzca el tipo de motor a introducir:");
	         String motor = sc.nextLine();

	         System.out.println("Introduzca los kilómetros a introducir");
	         Integer kilometros = null;
	         String kilometrosInput = sc.nextLine();

	         if (!kilometrosInput.isEmpty()) {
	             try {
	                 kilometros = Integer.parseInt(kilometrosInput);
	             } catch (NumberFormatException e) {
	                 System.out.println("Número inválido para kilómetros, debe ser un número entero. Inténtelo de nuevo.");
	                 
	             }
	         }

	         
	         if (modelo.isEmpty() || marca.isEmpty() || motor.isEmpty() || (kilometros != null && kilometros == 0)) {
	             System.out.println("No se pueden guardar datos vacíos.");
	             
	         }
	         System.out.println("Introduzca el id a modificar");
	         int id = sc.nextInt();
	    
			PreparedStatement sentencia = con.prepareStatement(sql);
			sentencia.setString(1, marca);
			sentencia.setString(2, modelo);
			sentencia.setString(3, motor);
			sentencia.setInt(4, kilometros);
			sentencia.setInt(5, id);
			int rows = sentencia.executeUpdate();
			if(rows !=0) {
				System.out.println("Se ha dado modificado");
				System.out.println("-----------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void buscarCocheId() {
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			sql = "SELECT * FROM coche WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("Introduzca el id a modificar");
			int id = sc.nextInt();
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getInt(1);
				String marca = rs.getString(2);
				String modelo = rs.getString(3);
				String motor = rs.getString(4);
				int kilometros = rs.getInt(5);
				System.out.println("Registro: " + id + " " + marca + " " + modelo + " " + motor + " " + kilometros);
				System.out.println("-----------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void buscarCocheMarca() {
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			sql = "SELECT * FROM coche WHERE MARCA=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("Introduzca la marca a introducir:");
			String marca  = sc.next();
			ps.setString(1,marca);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				marca = rs.getString(2);
				String modelo = rs.getString(3);
				String motor = rs.getString(4);
				int kilometros = rs.getInt(5);
				System.out.println("Registro: " + id + " " + marca + " " + modelo + " " + motor + " " + kilometros);
				System.out.println("-----------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void listarCoches() {
		try(Connection con = DriverManager.getConnection(cadenaConexion, user, pass)) {
			PreparedStatement sentencia = con.prepareStatement("SELECT * FROM coche");
			ResultSet rs = sentencia.executeQuery();
			
			List<Coche> listadoPersonas = new ArrayList<Coche>();
			while (rs.next()) {
				Coche p = new Coche();
				p.setId(rs.getInt("ID"));
				p.setMarca(rs.getString("MARCA"));
				p.setModelo(rs.getString("MODELO"));
				p.setTipo_motor(rs.getString("TIPO_MOTOR"));
				p.setKilometros(rs.getInt("KILOMETROS"));
				listadoPersonas.add(p);
			}

			System.out.println(listadoPersonas);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
