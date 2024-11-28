package pasajero;

import java.util.List;

public interface DaoPasajeroInterfaz {
	public boolean alta(Pasajero p);
	public boolean baja(int id);
	public Pasajero obtener(int id);
	public List<Pasajero> listar();
	public boolean altaPasajeroCoche(int idPasajero, int idCoche);
	public boolean bajaPasajeroCoche(int idPasajero);
	public List<Pasajero> listarPasajerosCoche(int idCoche);
}
