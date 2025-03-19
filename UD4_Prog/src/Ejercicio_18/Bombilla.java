/**
 * 
 */
package Ejercicio_18;

/**
 * 
 */
public class Bombilla {
	private boolean encendida;
	
	public Bombilla() {
		this.encendida = false;
	}
	
	public void encender() {
		this.encendida = true;
	}
	
	public void apagar() {
		this.encendida = false;
	}
	
	public boolean estaEncendida(boolean luzGeneral) {
		return encendida && luzGeneral;
	}
}
