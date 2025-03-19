/**
 * 
 */
package Ejercicio4_12;

/**
 * 
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal[] animales = {
				new Perro("Firulais", 3),
				new Gato("Misu", 2),
				new Pajaro("Piolín", 1)
		};
		
		for (Animal animal : animales) {
			animal.mostrarInformacion();
			System.out.println();
		}

	}

}
