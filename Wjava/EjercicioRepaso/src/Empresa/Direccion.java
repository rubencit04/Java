package Empresa;

public class Direccion {
	private String Tipovia;
	private String nombreVia;
	private String cp;
	public String getTipovia() {
		return Tipovia;
	}
	public void setTipovia(String tipovia) {
		Tipovia = tipovia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public Direccion(String tipovia, String nombreVia, String cp) {
		super();
		Tipovia = tipovia;
		this.nombreVia = nombreVia;
		this.cp = cp;
	}
	
	
}
