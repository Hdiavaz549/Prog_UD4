/**
 * 
 */
package Ejercicio4_10;

/**
 * 
 */
class Circulo extends Figura {
	private double radio;
	
	public Circulo(double radio) {
		super("Círculo");
		this.radio = radio;
	}
	
	
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Radio: " + radio + ", Área: " + calcularArea());
	}
}
