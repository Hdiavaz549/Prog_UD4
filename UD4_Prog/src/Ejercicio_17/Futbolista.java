/**
 * 
 */
package Ejercicio_17;

/**
 * 
 */
class Futbolista extends Deportista{
	private String posicion;
	private int golesMarcados;
	
	public Futbolista(String nombre, int edad, String deporte, String posicion, int golesMarcados) {
		super(nombre, edad, deporte);
		this.posicion= posicion;
		this.golesMarcados = golesMarcados;
	}
	
	public void anortarGol() {
		this.golesMarcados++;
	}
	
	@Override
	public String toString() {
		return super.toString() + ",Posición: " + posicion + ", Goles Marcados: " + golesMarcados;
	}
}
