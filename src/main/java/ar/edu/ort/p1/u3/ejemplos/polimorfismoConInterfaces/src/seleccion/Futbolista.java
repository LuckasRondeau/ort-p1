package ar.edu.ort.p1.u3.ejemplos.polimorfismoConInterfaces.src.seleccion;

public class Futbolista extends SeleccionFutbol {

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
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

}