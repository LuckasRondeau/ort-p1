package ar.edu.ort.p1.u3.ejemplos.polimorfismo.src.polimorfismo;

public class Futbolista extends IntegranteDeSeleccion {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy entrenando (Clase Futbolista - Override)");
	}

	@Override
	public void participarEnPartido() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido()
				+ " -> Juega un Partido (Clase Futbolista - Override)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

}
