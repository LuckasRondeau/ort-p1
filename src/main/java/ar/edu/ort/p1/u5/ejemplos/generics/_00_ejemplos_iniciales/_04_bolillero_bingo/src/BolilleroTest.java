package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._04_bolillero_bingo.src;

public class BolilleroTest {

	private static int CANT_MAX_BOLILLAS = 5;
	private static Bolillero<Bolilla> bolillero = new Bolillero<Bolilla>(CANT_MAX_BOLILLAS);

	public static void main(String[] args) {
		isVacio();
		llenarBolillero();
		isVacio();
		sortearBolillas();
		isVacio();
	}

	private static void llenarBolillero() {
		for (int i = 0; i < CANT_MAX_BOLILLAS; i++) {
			bolillero.add(new Bolilla(i));
		}
		System.out.println("Se lleno el bolillero con " + CANT_MAX_BOLILLAS + " bolillas");
	}

	private static void sortearBolillas() {
		while (!bolillero.isEmpty()) {
			System.out.println("Sale: " + bolillero.remove());
		}
	}

	private static void isVacio() {
		System.out.println("El bolillero esta vacio? " + bolillero.isEmpty());
	}

}
