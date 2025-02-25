package ar.edu.ort.p1.u3.practico03.ej10_comercio_informatico.src;

import ar.edu.ort.p1.util.Matematica;

public class Insumo implements Facturable {

	private String nombre;
	private double precioLista;
	private double porcGanancia;
	private Tipo tipo;

	public Insumo(String nombre, int porcGanancia, double precioLista) {
		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	@Override
	public double getMontoFacturacion() {
		double precio = 0;
		precio = Matematica.sumarPorcentaje(this.precioLista, this.porcGanancia);
		return Matematica.sumarPorcentaje(precio, Facturable.IVA); // Tambien se puede usar IVA, ya que se hereda por
																	// ser publico
	}

}
