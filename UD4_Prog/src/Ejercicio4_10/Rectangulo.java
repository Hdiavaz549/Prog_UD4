/**
 * 
 */
package Ejercicio4_10;

/**
 * 
 */
class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super("Rectángulo");
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return base * altura;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Base: " + base + ", Altura: " + altura + ". Área: " + calcularArea());
	}
}
