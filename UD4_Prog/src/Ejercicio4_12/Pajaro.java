/**
 * 
 */
package Ejercicio4_12;

/**
 * 
 */
abstract class Pajaro extends Animal{
	public Pajaro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Canto: ¡Pío, pío!");
	}
	
	@Override
	public String moverse() {
		return "Vuela por el aire";
	}
}
