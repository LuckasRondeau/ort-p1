package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._03_sorteador_generico;

public class SorteadorGenericoTest {

	public static void main(String[] args) {
		SorteadorGenerico<String> sorteador = new SorteadorGenerico<String>();

		System.out.println("El sorteador generico esta vacio? " + sorteador.isEmpty());

		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");

		System.out.println("El sorteador generico esta vacio? " + sorteador.isEmpty());

		while (!sorteador.isEmpty()) {
			System.out.println(sorteador.remove()); // toUpperCase() no podria ser sin castear a String
		}

		System.out.println("El sorteador generico esta vacio? " + sorteador.isEmpty());
	}

}
