/**
 * 
 */
package Ejercicio4_12;

/**
 * 
 */
abstract class Perro extends Animal {
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Ladrido: ¡Guau, guau!");
	}
	
	@Override
	public String moverse() {
		return "Corre sobre cuatro patas";
	}
}
