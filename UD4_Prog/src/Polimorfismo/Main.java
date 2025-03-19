/**
 * 
 */
package Polimorfismo;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sonido();
		a = new Perro();
		a.sonido();
		a = new Gato();
		a.sonido();
		a = new Pajaro();
		a.sonido();

	}

}
