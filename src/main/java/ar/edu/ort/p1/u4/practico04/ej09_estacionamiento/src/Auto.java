package ar.edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

import java.util.Date;

import ar.edu.ort.p1.util.Fecha;

public class Auto {

	private static int CANT_PAGOS = 12;

	private String patente;
	private Pago[] pagos = new Pago[CANT_PAGOS];
	private Fecha fechaIngreso;

	public Auto(String patente, Pago[] pagos, Fecha fechaIngreso) {
		super();
		this.patente = patente;
		this.pagos = pagos;
		this.fechaIngreso = fechaIngreso;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Pago[] getPagos() {
		return pagos;
	}

	public void setPagos(Pago[] pagos) {
		this.pagos = pagos;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getMesesImpagos() {
		int cont = 0;

		for (int i = Fecha.hoy().getMes(); i >= 0; i--) {
			if (pagos[i] != null) {
				cont++;
			}
		}
		return cont;
	}

	@Override
	public String toString() {
		return "[Auto=" + patente + "]";
	}

}
