
public class Procesador {
		String marca;
		String modelo;
		int numeroNucleos;
		double precio;
		
		public Procesador(){
			
		}

		@Override
		public String toString() {
			return "Procesador [marca=" + marca + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos
					+ ", precio=" + precio + "]";
		}
		
}
