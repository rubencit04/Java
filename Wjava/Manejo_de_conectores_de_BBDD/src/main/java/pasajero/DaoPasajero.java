package pasajero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coche.Coche;

public class DaoPasajero implements DaoPasajeroInterfaz {
	private Connection conexion;

	public boolean abrirConexion() {
		String url = "jdbc:mysql://localhost:3306/bbdd";
		String usuario = "root";
		String password = "";
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Coche> listarCoches() {
		List<Coche> listaCoche = new ArrayList<>();
		String queryc = "SELECT * FROM coche";
		try {
			PreparedStatement pc = conexion.prepareStatement(queryc);
			ResultSet rs = pc.executeQuery();
			while (rs.next()) {
				Coche coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setFecha(rs.getInt(4));
				coche.setTipo_motor(rs.getString(5));
				coche.setKilometros(rs.getInt(6));

				listaCoche.add(coche);
			}
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener los " + "coches");
			e.printStackTrace();
		}
		return listaCoche;
	}

	@Override
	public boolean alta(Pasajero p) {

		if (!abrirConexion()) {
			return false;
		}
		String queryp = "INSERT INTO PASAJEROS (NOMBRE, EDAD, PESO) VALUES (?, ?, ?)";

		boolean alta = true;
		try {
			PreparedStatement pp = conexion.prepareStatement(queryp);
			pp.setString(1, p.getNombre());
			pp.setInt(2, p.getEdad());
			pp.setDouble(3, p.getPeso());

			int numeroFilasAfectadas = pp.executeUpdate();
			if (numeroFilasAfectadas == 0)
				alta = false;
		} catch (SQLException e) {
			System.out.println("alta -> Error al insertar: " + p);
			alta = false;
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return alta;
	}

	@Override
	public boolean baja(int id) {
		if (!abrirConexion()) {
			return false;
		}
		boolean borrado = true;
		String query = "DELETE FROM PASAJEROS WHERE ID=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);

			int numeroFilasAfectadas = ps.executeUpdate();
			if (numeroFilasAfectadas == 0)
				borrado = false;
		} catch (SQLException e) {
			borrado = false;
			System.out.println("baja -> No se ha podido dar de baja" + " el id " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return borrado;
	}

	@Override
	public Pasajero obtener(int id) {

		if (!abrirConexion()) {
			return null;
		}
		Pasajero pasajero = null;

		String query = "SELECT * FROM PASAJEROS WHERE ID=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pasajero = new Pasajero();
				pasajero.setId(rs.getInt(1));
				pasajero.setNombre(rs.getString(2));
				pasajero.setEdad(rs.getInt(3));
				pasajero.setPeso(rs.getDouble(4));

			}
		} catch (SQLException e) {
			System.out.println("obtener -> error al obtener el " + "pasajero con id " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return pasajero;
	}

	@Override
	public List<Pasajero> listar() {
		if (!abrirConexion()) {
			return null;
		}
		List<Pasajero> listaPasajero = new ArrayList<>();

		String query = "SELECT * FROM PASAJEROS";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Pasajero pasajero = new Pasajero();
				pasajero.setId(rs.getInt(1));
				pasajero.setNombre(rs.getString(2));
				pasajero.setEdad(rs.getInt(3));
				pasajero.setPeso(rs.getDouble(4));

				listaPasajero.add(pasajero);
			}
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener los " + "pasajeros");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return listaPasajero;
	}

	@Override
	public boolean altaPasajeroCoche(int idPasajero, int idCoche) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "UPDATE PASAJEROS SET coche_id =? WHERE pasajero_id =?";
		boolean alta = true;
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, idCoche);
			ps.setInt(2, idPasajero);
			int numeroFilasAfectadas = ps.executeUpdate();
			if (numeroFilasAfectadas == 0)
				alta = false;
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener los " + "pasajeros");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return alta;
	}


	@Override
	public boolean bajaPasajeroCoche(int idPasajero) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "UPDATE pasajeros SET coche_id = NULL WHERE pasajero_id = ?";
		boolean alta = true;
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, idPasajero);
			int filasAfectadas = ps.executeUpdate();
			if (filasAfectadas == 0)
				alta = false;
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return false;
	}

	@Override
	public List<Pasajero> listarPasajerosCoche(int idCoche) {
	    if (!abrirConexion()) {
	        return null;
	    }
	    List<Pasajero> listaPasajeros = new ArrayList<>();

	    String query = "SELECT * FROM PASAJEROS WHERE coche_id = ?";
	    try {
	        PreparedStatement ps = conexion.prepareStatement(query);
	        ps.setInt(1, idCoche);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Pasajero pasajero = new Pasajero();
	            pasajero.setId(rs.getInt(1));
	            pasajero.setNombre(rs.getString(2));
	            pasajero.setEdad(rs.getInt(3));
	            pasajero.setPeso(rs.getDouble(4));

	            listaPasajeros.add(pasajero);
	        }
	    } catch (SQLException e) {
	        System.out.println("Error al obtener los pasajeros del coche con ID: " + idCoche);
	        e.printStackTrace();
	    } finally {
	        cerrarConexion();
	    }
	    return listaPasajeros;
	}

}
