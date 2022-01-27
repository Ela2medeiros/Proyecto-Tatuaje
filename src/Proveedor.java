
public class Proveedor {
	
	private Insumo insumo;
	private int rutProv;
	private String nombreProv;
	private String direccionProv;
	private int telefonoProv;
	
	public Proveedor(Insumo insumo, int rutProv, String nombreProv, String direccionProv, int telefonoProv) {
		
		this.insumo = insumo;
		this.rutProv = rutProv;
		this.nombreProv = nombreProv;
		this.direccionProv = direccionProv;
		this.telefonoProv = telefonoProv;
	}

	
	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}



	public int getRutProv() {
		return rutProv;
	}

	public void setRutProv(int rutProv) {
		this.rutProv = rutProv;
	}


	
	public String getNombreProv() {
		return nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}

	

	public String getDireccionProv() {
		return direccionProv;
	}

	public void setDireccionProv(String direccionProv) {
		this.direccionProv = direccionProv;
	}


	
	public int getTelefonoProv() {
		return telefonoProv;
	}

	public void setTelefonoProv(int telefonoProv) {
		this.telefonoProv = telefonoProv;
	}
	
	

}
