/**
 * 
 */
package Ejercicio4_12;

/**
 * 
 */
abstract class Gato extends Animal {
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Maullido: ¡Miau, miau!");
	}
	
	@Override
	public String moverse() {
		return "Camina sigilosamente sobre cuatro patas";
	}
}
