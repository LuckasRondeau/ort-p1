package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema1.src;

public class SucursalCorreo {
	
	private String nombre;
	private Domicilio domicilio;
	public SucursalCorreo(String nombre, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	

}
