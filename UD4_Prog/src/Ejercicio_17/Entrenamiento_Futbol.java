/**
 * 
 */
package Ejercicio_17;

/**
 * 
 */
abstract class Entrenamiento_Futbol extends Entrenamiento implements Compite {
	@Override
	public abstract void entrenar();{
		System.out.println("Entrenando fútbol...");
	}
	
	@Override
	public String competir() {
		return "El futbolista está compitiendo en un partido";
	}
}

