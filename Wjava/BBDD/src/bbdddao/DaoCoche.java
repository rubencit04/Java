package bbdddao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoCoche implements DaoCocheInterfaz{
	private Connection conexion;
	public boolean abrirConexion(){
		String url = "jdbc:mysql://localhost:3306/bbdd";
		String usuario = "root";
		String password = "";
		try {
			conexion = DriverManager.getConnection(url,usuario,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean cerrarConexion(){
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean alta(Coche p) {
		if(!abrirConexion()){
			return false;
		}
		String query = "INSERT INTO COCHE (MARCA, MODELO, TIPO_MOTOR, KILOMETROS) VALUES (?, ?, ?, ?)";
		boolean alta = true;
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			 ps.setString(1,p.getMarca());
             ps.setString(2,p.getModelo());
             ps.setString(3, p.getTipo_motor());
             ps.setInt(4, p.getKilometros());  
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				alta = false;
		} catch (SQLException e) {
			System.out.println("alta -> Error al insertar: " + p);
			alta = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return alta;
	}

	@Override
	public boolean baja(int id) {
		if(!abrirConexion()){
			return false;
		}
			boolean borrado = true;
			String query = "DELETE FROM COCHE WHERE ID=?";
			try {
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setInt(1, id);
				
				int numeroFilasAfectadas = ps.executeUpdate();
				if(numeroFilasAfectadas == 0)
					borrado = false;
			} catch (SQLException e) {
				borrado = false;
				System.out.println("baja -> No se ha podido dar de baja"
						+ " el id " + id);
				e.printStackTrace();
			} finally {
				cerrarConexion();
			}
			return borrado; 
		}
	

	@Override
	public boolean modificar(Coche p) {
		if(!abrirConexion()){
			return false;
		}
			boolean modificado = true;
			String query = "UPDATE coche SET MARCA=?, MODELO=?, TIPO_MOTOR=?, KILOMETROS=? WHERE ID=?";
			try {
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setString(1, p.getMarca());
				ps.setString(2, p.getModelo());
				ps.setString(3, p.getTipo_motor());
				ps.setInt(4, p.getKilometros());
				ps.setInt(5, p.getId());
				
				int numeroFilasAfectadas = ps.executeUpdate();
				if(numeroFilasAfectadas == 0)
					modificado = false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("modificar -> error al modificar "
						+ " coche " + p);
				modificado = false;
				e.printStackTrace();
			} finally{
				cerrarConexion();
			}
			
			return modificado;
		}
	

	@Override
	public Coche obtener(int id) {
		if(!abrirConexion()){
			return null;
		}		
		Coche coche = null;
		
		String query = "SELECT * FROM coche WHERE ID=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setTipo_motor(rs.getString(4));
				coche.setKilometros(rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println("obtener -> error al obtener el "
					+ "coche con id " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return coche;
	}

	@Override
	public Coche obtener(String marca) {
		if(!abrirConexion()){
			return null;
		}		
		Coche coche = null;
		
		String query = "SELECT * FROM coche WHERE MARCA=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, marca);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setTipo_motor(rs.getString(4));
				coche.setKilometros(rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println("obtener -> error al obtener el "
					+ "coche con la marca " + marca);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return coche;
	}

	@Override
	public List<Coche> listar() {
		if(!abrirConexion()){
			return null;
		}		
		List<Coche> listaPersonas = new ArrayList<>();
		
		String query = "SELECT * FROM coche";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Coche coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setTipo_motor(rs.getString(4));
				coche.setKilometros(rs.getInt(5));
				
				listaPersonas.add(coche);
			}
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener los "
					+ "coches");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		
		return listaPersonas;
	}
	
}
