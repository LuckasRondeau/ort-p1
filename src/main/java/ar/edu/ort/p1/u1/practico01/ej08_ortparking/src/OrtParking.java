package ar.edu.ort.p1.u1.practico01.ej08_ortparking.src;

import java.util.ArrayList;

public class OrtParking {

	private ArrayList<Garage> garages;

	public OrtParking() {
		super();
		this.garages = new ArrayList<Garage>();
	}

	/**
	 * Ejercicio C: El metodo obtenerInformeEstadoGarajes que debe devolver una
	 * lista detallando, para cada garaje, su codigo y la cantidad de vehiculos
	 * estacionados
	 * 
	 * @return
	 */
	public ArrayList<InformeGarage> obtenerInformeEstadoGarages() {

		ArrayList<InformeGarage> lista = new ArrayList<InformeGarage>();

		for (Garage garage : this.garages) {
			lista.add(garage.dameInforme());
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos complementarios */

	public void agregarGarage(Garage garage) {
		this.garages.add(garage);
	}

}
