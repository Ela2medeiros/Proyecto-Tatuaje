
public class Insumo {
	
	private int codInsumo;
	private String nombreInsumo;
	private int precioInsumo;
	
	public Insumo(int codInsumo, String nombreInsumo, int precioInsumo) {
		
		this.codInsumo = codInsumo;
		this.nombreInsumo = nombreInsumo;
		this.precioInsumo = precioInsumo;
	}

	public int getCodInsumo() {
		return codInsumo;
	}

	public void setCodInsumo(int codInsumo) {
		this.codInsumo = codInsumo;
	}

	
	public String getNombreInsumo() {
		return nombreInsumo;
	}

	public void setNombreInsumo(String nombreInsumo) {
		this.nombreInsumo = nombreInsumo;
	}

	
	public int getPrecioInsumo() {
		return precioInsumo;
	}

	public void setPrecioInsumo(int precioInsumo) {
		this.precioInsumo = precioInsumo;
	}
	
	

}
