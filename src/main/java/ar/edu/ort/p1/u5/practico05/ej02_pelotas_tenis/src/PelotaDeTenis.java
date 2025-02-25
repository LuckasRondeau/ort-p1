package ar.edu.ort.p1.u5.practico05.ej02_pelotas_tenis.src;

public class PelotaDeTenis {

	public final int USOS_HASTA_GASTADA = 7;
	private int cantUsos;
	private Estado estado;

	PelotaDeTenis() {
		this.cantUsos = 0;
		this.setEstado(Estado.NUEVA);
	}

	public void usar() {
		this.cantUsos++;
		actualizarEstado();
	}

	private void actualizarEstado() {
		if (this.cantUsos <= USOS_HASTA_GASTADA) {
			this.setEstado(Estado.USADA);
		} else {
			this.setEstado(Estado.GASTADA);
		}
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
