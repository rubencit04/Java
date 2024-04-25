
public class Jefes_De_Proyecto extends Empleados {
	private double incentivos;
	public Jefes_De_Proyecto() {
		
	}
	public Jefes_De_Proyecto(String dni, String nombre, double sb, double incentivos) {
		super(dni, nombre, sb);
		
	}
	public double calcularSalarioTotal() {
		return getSb() + incentivos;
	}
	@Override
	public String toString() {
		return "Jefes_De_Proyecto [incentivos=" + incentivos + "]";
	}
	
}
