package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src.listasordenadas;

import ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src.Orden;
import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenesPorPrioridad extends ListaOrdenadaNodos<Integer, Orden> {

	@Override
	public int compare(Orden o1, Orden o2) {
		return o1.getPrioridad() - o2.getPrioridad();
	}

	@Override
	public int compareByKey(Integer prioridad, Orden o) {
		return prioridad - o.getPrioridad();
	}

}
