package ar.edu.ort.p1.u1.practico01.ej02_hotel.src;

import java.util.ArrayList;

public class Hotel {

	private String nombre;
	private String direccion;
	private ArrayList<Habitacion> habitaciones;

	/**
	 * Ejercicio D: La explotacion del metodo obtenerHabitacionesDisponibles de la
	 * clase Hotel que debe devolver una lista con aquellas habitaciones que no
	 * esten ocupadas en la actualidad
	 * 
	 * @return
	 */
	public ArrayList<Habitacion> obtenerHabitacionesDisponibles() {

		ArrayList<Habitacion> listaDeHabitaciones = new ArrayList<Habitacion>();

		for (Habitacion habitacion : this.habitaciones) {
			if (!habitacion.estaOcupada()) {
				listaDeHabitaciones.add(habitacion);
			}
		}
		return listaDeHabitaciones;
	}

	/**
	 * Ejercicio E: La explotacion del metodo realizarCheckout de la clase Hotel,
	 * que recibe como parametro el numero de habitacion y debe hacer lo siguiente:
	 * I. Verificar que la habitacion existe y este ocupada actualmente. II.
	 * Devolver el monto a abonar para dicha habitacion. El metodo devolvera -1 si
	 * no se pudiera realizar el checkout (por no encontrar la habitacion enviada
	 * como parametro o no estar ocupada).
	 * 
	 * @param nroHab
	 * @return
	 */
	public double realizarCheckout(int nroHab) {

		double precio = -1;
		Habitacion habitacion;
		habitacion = buscarHabitacion(nroHab);

		if (habitacion != null && habitacion.estaOcupada()) {
			precio = habitacion.calcularTotal();
			habitacion.liberar();
		}
		return precio;
	}

	/**
	 * Devuelve una instancia de habitacion o null si no se encuentra
	 * 
	 * @param nroHab
	 * @return
	 */
	private Habitacion buscarHabitacion(int nroHab) {

		int i = 0;
		Habitacion habitacinEncontrada = null;

		while (i < this.habitaciones.size() && habitacinEncontrada == null) {
			if (nroHab == this.habitaciones.get(i).getNumero()) {
				habitacinEncontrada = this.habitaciones.get(i);
			}
			i++;
		}
		return habitacinEncontrada;
	}
}
