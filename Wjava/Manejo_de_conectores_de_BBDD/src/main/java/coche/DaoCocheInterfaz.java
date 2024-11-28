package coche;


import java.util.List;

public interface DaoCocheInterfaz {
	public boolean alta(Coche p);
	public boolean baja(int id);
	public boolean modificar(Coche p);
	public Coche obtener(int id);
	public Coche obtener(String marca);
	public List<Coche> listar();
}
