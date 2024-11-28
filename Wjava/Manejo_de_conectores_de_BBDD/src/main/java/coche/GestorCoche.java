package coche;

import java.util.List;

public class GestorCoche {
	private DaoCocheInterfaz DaoCoche= new DaoCoche();
	
	public int alta(Coche coche) {
        if (coche.getKilometros() > 0) {
            if (DaoCoche.alta(coche)) {
                return 0;
            } else {
                return 1; 
            }
        } else {
            return 2;
        }
    }

    public boolean baja(int id) {
        if (DaoCoche.baja(id)) {
            return true; 
        } else {
            return false;
        }
    }

    public int modificar(Coche coche) {
        if (coche.getKilometros() > 0) {
            if (DaoCoche.modificar(coche)) {
                return 0;
            } else {
                return 1; 
            }
        } else {
            return 2; 
        }
    }

    public Coche obtener(int id) {
        if (id > 0) {
            return DaoCoche.obtener(id); 
        } else {
            return null; 
        }
    }

    public Coche obtener(String marca) {
        if (marca != null && !marca.isEmpty()) {
            return DaoCoche.obtener(marca); 
        } else {
            return null; 
        }
    }

    public List<Coche> listar() {
        List<Coche> listaCoches = DaoCoche.listar();
        if (listaCoches != null && !listaCoches.isEmpty()) {
            return listaCoches; 
        } else {
            return null; 
        }
    }
}

