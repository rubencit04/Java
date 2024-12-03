package pasajero;

import java.util.List;

import coche.Coche;

public class GestorPasajero {
	private DaoPasajeroInterfaz DaoPasajero= new DaoPasajero();
	
	public int alta(Pasajero p) {
		if (DaoPasajero.alta(p)) {
            return 0;
        } else {
            return 1; 
        }
    }
	
	 public boolean baja(int id) {
	        if (DaoPasajero.baja(id)) {
	            return true; 
	        } else {
	            return false;
	        }
	    }
	 
	 public Pasajero obtener(int id) {
	        if (id > 0) {
	            return DaoPasajero.obtener(id); 
	        } else {
	            return null; 
	        }
	    }
	 
	 public List<Pasajero> listar() {
	        List<Pasajero> listaPasajeros = DaoPasajero.listar();
	        if (listaPasajeros != null && !listaPasajeros.isEmpty()) {
	            return listaPasajeros; 
	        } else {
	            return null; 
	        }
	    }
	 
	 public int altaPasajeroCoche(Pasajero p) {
			if (DaoPasajero.alta(p)) {
	            return 0;
	        } else {
	            return 1; 
	        }
	    }
	 
	 public int bajaPasajeroCoche(Pasajero p) {
			if (DaoPasajero.alta(p)) {
	            return 0;
	        } else {
	            return 1; 
	        }
	    }
	 
	 public List<Pasajero> listarPasajerosCoche() {
	        List<Pasajero> listaPasajeros = DaoPasajero.listar();
	        if (listaPasajeros != null && !listaPasajeros.isEmpty()) {
	            return listaPasajeros; 
	        } else {
	            return null; 
	        }
	    }
}
